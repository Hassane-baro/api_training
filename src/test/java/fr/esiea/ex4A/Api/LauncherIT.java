package fr.esiea.ex4A.Api;

import fr.esiea.ex4A.Launcher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LauncherIT {

    @Test
    void agifyClientLauncher_test(){
        Launcher launcher = new Launcher();
        AgifyClient agifyClient = launcher.agifyClient();
        Assertions.assertNotNull(agifyClient);
    }
}
