package config;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import models.Environment;

public class Config {

    public Environment environment;

    @JsonAnyGetter
    public Environment getEnvironment() {
        return environment;
    }
}
