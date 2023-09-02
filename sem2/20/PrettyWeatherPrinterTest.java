import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PrettyWeatherPrinterTest {

    public static PrettyWeatherPrinter prettyWeatherPrinter;

    public static WeatherGetter weatherGetter;

    @BeforeAll
    public static void init(){
        weatherGetter = Mockito.mock(WeatherGetter.class);
        prettyWeatherPrinter =
                new PrettyWeatherPrinter(weatherGetter);

    }

    @Test
    public void testt() throws Exception{
        Mockito.when(weatherGetter.getWeatherJson()).thenReturn("{\"coord\":{\"lon\":49.1221,\"lat\":55.7887},\"weather\":[{\"id\":802,\"main\":\"Clouds\",\"description\":\"scattered clouds\",\"icon\":\"03d\"}],\"base\":\"stations\",\"main\":{\"temp\":295.49,\"feels_like\":294.98,\"temp_min\":295.49,\"temp_max\":295.49,\"pressure\":1016,\"humidity\":46,\"sea_level\":1016,\"grnd_level\":1009},\"visibility\":10000,\"wind\":{\"speed\":2.61,\"deg\":206,\"gust\":3.53},\"clouds\":{\"all\":29},\"dt\":1682687420,\"sys\":{\"type\":1,\"id\":9038,\"country\":\"RU\",\"sunrise\":1682644094,\"sunset\":1682698420},\"timezone\":10800,\"id\":551487,\"name\":\"Kazan’\",\"cod\":200}");

        prettyWeatherPrinter.printWeather();
    }

}
