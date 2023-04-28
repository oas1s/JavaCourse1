import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrettyWeatherPrinter {

    private WeatherGetter weatherGetter;

    public void printWeather() throws Exception{
        String s = weatherGetter.getWeatherJson();
        MainMain.City city = new ObjectMapper().readValue(s,MainMain.City.class);
        System.out.println("Привет, погода в городе "
        + city.getMain().temp);
    }
}
