import config.AppProperties;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.Matchers.is;

public class TestBaseParams {

    static Logger log = LoggerFactory.getLogger(TestBaseParams.class);

    private static AppProperties appProperties;
    @BeforeAll
    static void setDriver() {
        appProperties = AppProperties.getInstance();
    }

    public static RequestSpecification getRequestSpec(String cityId) {
        return new RequestSpecBuilder()
                .setBaseUri("https://api.openweathermap.org/data/2.5")
                .setBasePath("/weather")
                .addParam("appId", "89a2ed8a594cc497a6273490e7ca59dd")
                .addParam("id", cityId)
                .setContentType(ContentType.JSON)
                .build().filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

    public static ResponseSpecification getResponseSpec(String cityName) {
        return new ResponseSpecBuilder()
                .build()
                .statusCode(200)
                .body("name", is(cityName));
    }
}
