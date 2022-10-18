import io.restassured.RestAssured;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class OpenWeatherYamlApiTest extends TestBaseYaml {

    @Test
    @DisplayName("Checking for current weather for required city")
    @Tag("openWeatherWithYaml")
    @Tag("regression")
    void shouldGetCurrentWeatherForCityUsingYamlConfig() {
        RestAssured.given()
                .spec(TestBaseYaml.getRequestSpec())
        .when()
                .get()
        .then()
                .spec(getResponseSpec());
    }
}