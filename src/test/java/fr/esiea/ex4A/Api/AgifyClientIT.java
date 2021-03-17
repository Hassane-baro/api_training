package fr.esiea.ex4A.Api;
import fr.esiea.ex4A.Api.AgifyClient;
import fr.esiea.ex4A.Api.UserAgify;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.io.IOException;

public class AgifyClientIT {

    @Test
    void agifyClient_testIT() throws IOException {
        String name = "Hassane";
        String country = "FR";
        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.agify.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
        AgifyClient agifyClient = retrofit.create(AgifyClient.class);
        Response<UserAgify> execute = agifyClient.getUserAgify(name, country).execute();
        UserAgify user = execute.body();
        Assertions.assertNotNull(user);
        Assertions.assertEquals(user.name, name);
    }
}
