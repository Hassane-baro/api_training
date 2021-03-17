package fr.esiea.ex4A.Api;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UserData {
    public final String userEmail;
    public  final  String userName;
    public  final String userTweeter;
    public  final String userCountry;
    public  final String userSex;
    public  final String userSexPref;

    public UserData(@JsonProperty("userEmail") String userEmail, @JsonProperty("userName") String userName, @JsonProperty("userTweeter") String userTweeter, @JsonProperty("userCountry") String userCountry, @JsonProperty("userSex") String userSex, @JsonProperty("userSexPref") String userSexPref) {
        this.userEmail = userEmail;
        this.userName = userName;
        this.userTweeter = userTweeter;
        this.userCountry = userCountry;
        this.userSex = userSex;
        this.userSexPref = userSexPref;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserData userData = (UserData) o;
        return Objects.equals(userEmail, userData.userEmail) && Objects.equals(userName, userData.userName) && Objects.equals(userTweeter, userData.userTweeter) && Objects.equals(userCountry, userData.userCountry) && Objects.equals(userSex, userData.userSex) && Objects.equals(userSexPref, userData.userSexPref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userEmail, userName, userTweeter, userCountry, userSex, userSexPref);
    }


}
