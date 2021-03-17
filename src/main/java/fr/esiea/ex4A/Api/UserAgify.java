package fr.esiea.ex4A.Api;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserAgify {
    public final String name;
    public final int age;
    public final int count;

    public UserAgify(@JsonProperty("name") String name, @JsonProperty("age") int age, @JsonProperty("count") int count) {
        this.name = name;
        this.age = age;
        this.count = count;
    }
}
