import io.restassured.RestAssured;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OpenWeatherParamsApiTest extends TestBaseParams {

    @ParameterizedTest
    @MethodSource("DataProvider#dataSource")
    @DisplayName("Checking for current weather for required city")
    @Tag("openWeatherWithParametrizedTest")
    @Tag("regression")
    void shouldGetCurrentWeatherForCityUsingParametrizedValues(String cityName, String cityId) {
        RestAssured.given()
                .spec(TestBaseParams.getRequestSpec(cityId))
        .when()
                .get()
        .then()
                .spec(getResponseSpec(cityName));
    }
}
