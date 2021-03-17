package fr.esiea.ex4A.Api;
import fr.esiea.ex4A.Api.UserData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Objects;

public class UserDataIT {
    @Test
    void User_Equals_test()
    {
        UserData userTest = new UserData("hassanebaro@hotmail.com","Hassane","barozo94","FR","M","F");
        UserData userTest1 = new UserData("emilie@hotmail.com", "emilie", "emilie78", "FR", "F", "M");
        UserData userTest2 = new UserData("hassanebaro@hotmail.com", "Hassane", "barozo94", "FR", "M", "F");
        Assertions.assertFalse(userTest.equals(userTest1));
        Assertions.assertTrue(userTest.equals(userTest2));
    }

    @Test
    void Hash_userData_test(){
            UserData user = new UserData("test@test.com", "test", "test", "FR", "M", "M");
            int hash = Objects.hash(user.userEmail, user.userName, user.userTweeter, user.userCountry, user.userSex,user.userSexPref);
            Assertions.assertEquals(hash, user.hashCode());
    }
}
