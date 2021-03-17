package fr.esiea.ex4A.Api;
import org.springframework.stereotype.Service;
import retrofit2.Response;
import java.io.IOException;
import java.util.List;

@Service
public class AgifyService {

    public final AgifyClient agifyClient;
    public final List<UserData> listUser;

    public AgifyService(AgifyClient agifyClient, List<UserData> listUser) {
        this.agifyClient = agifyClient;
        this.listUser = listUser;
    }

    public int getAgifyAge(String name, String country) throws IOException {
        Response<UserAgify> userAgifyCall = agifyClient.getUserAgify(name, country).execute();
        UserAgify userAgify = userAgifyCall.body();
        return userAgify.age;
    }

    public void matchUser (UserData currentUser,UserData userList,List<UserData>listMatch) throws IOException {
            if (currentUser.userSexPref.equals(userList.userSex)){
                listMatch.add(userList);
            }
    }

}
