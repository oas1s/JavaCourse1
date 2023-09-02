import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.InputStream;
import java.net.URL;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WeatherGetter {

    private String url;

    public String getWeatherJson() throws Exception{
        InputStream inputStream =
                new URL("https://api.openweathermap.org/data/2.5/weather?q=Kazan&appid=209412395c0806ea38f6accb1a3b49de")
                        .openStream();
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        return  new String(bytes);
    }
}
