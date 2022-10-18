import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DataProvider {

    private static Stream<Arguments> dataSource() {
        return Stream.of(
                Arguments.of("London","2643743"),
                Arguments.of("Oxford","2640729"),
                Arguments.of("Gdańsk","3099434")
        );
    }
}
