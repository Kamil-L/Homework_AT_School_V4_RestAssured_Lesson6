package models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.ArrayList;
import java.util.List;

public class Environment {

    public EnvironmentModel development;
    public EnvironmentModel testing;
    public EnvironmentModel staging;

    @JsonAnyGetter
    public EnvironmentModel getDevelopment() {
        return development;
    }

    @JsonAnyGetter
    public EnvironmentModel getTesting() {
        return testing;
    }

    @JsonAnyGetter
    public EnvironmentModel getStaging() {
        return staging;
    }

    @JsonAnyGetter
    public List<EnvironmentModel> getListOfEnvironments() {
        List<EnvironmentModel> listOfEnvironments = new ArrayList<>();
        listOfEnvironments.add(getDevelopment());
        listOfEnvironments.add(getTesting());
        listOfEnvironments.add(getStaging());
        return listOfEnvironments;
    }
}
