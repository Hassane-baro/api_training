package fr.esiea.ex4A.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiController {

   private final AgifyService agifyService;

    public ApiController(AgifyService agifyService) {
        this.agifyService = agifyService;
    }

    @PostMapping(path = "/api/inscription", produces = MediaType.APPLICATION_JSON_VALUE)
    public void inscription(@RequestBody UserData userData) throws IOException {
        agifyService.listUser.add(userData);
    }

    @GetMapping(path = "/api/matches",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserData> matches(@RequestParam(name = "userName", required = true) String userName, @RequestParam(name = "userCountry", required = true) String userCountry) throws IOException {
        List<UserData> MatchUser = new ArrayList<>();
        UserData initialUser = agifyService.listUser.get(agifyService.listUser.size()-1);
        for( UserData i : agifyService.listUser ) {
            if (i.equals(initialUser) == false){
                if (agifyService.getAgifyAge(userName,userCountry) > agifyService.getAgifyAge(i.userName,i.userCountry) - 4 && agifyService.getAgifyAge(userName,userCountry) < agifyService.getAgifyAge(i.userName,i.userCountry) + 4){
                    agifyService.matchUser(initialUser,i,MatchUser);
                }
            }
        }
        return MatchUser;
    }

}
