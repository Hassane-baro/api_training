package fr.esiea.ex4A.Api;
import fr.esiea.ex4A.Api.AgifyClient;
import fr.esiea.ex4A.Api.AgifyService;
import fr.esiea.ex4A.Api.UserData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.io.IOException;
import java.util.ArrayList;

public class AgifyServiceIT {

    @Test
    void getAgifyUserAge_testIT() throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.agify.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
        AgifyClient agifyClient = retrofit.create(AgifyClient.class);
        AgifyService agifyService = new AgifyService(agifyClient, new ArrayList<UserData>());
        int age =agifyService.getAgifyAge("Hassane","FR");
        Assertions.assertNotNull(age);
    }
}
