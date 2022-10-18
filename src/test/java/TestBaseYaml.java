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

public class TestBaseYaml {

    static Logger log = LoggerFactory.getLogger(TestBaseYaml.class);

    private static AppProperties appProperties;
    @BeforeAll
    static void setDriver() {
        appProperties = AppProperties.getInstance();
    }

    public static RequestSpecification getRequestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(System.getProperty("baseUri"))
                .setBasePath(System.getProperty("basePath"))
                .addParam("appId", System.getProperty("appId"))
                .addParam("id", System.getProperty("cityId"))
                .setContentType(ContentType.JSON)
                .build().filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

    public static ResponseSpecification getResponseSpec() {
        return new ResponseSpecBuilder()
                .build()
                .statusCode(200);
    }
}