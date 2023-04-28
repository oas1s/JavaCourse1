import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.InputStream;
import java.net.URL;

public class MainMain {
    public static void main(String[] args) throws Exception{
        InputStream inputStream =
                new URL("https://api.openweathermap.org/data/2.5/weather?q=Kazan&appid=209412395c0806ea38f6accb1a3b49de")
                        .openStream();
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        String json = new String(bytes);
        System.out.println(json);
        ObjectMapper objectMapper = new ObjectMapper();
        City city = objectMapper.readValue(json,City.class);
        System.out.println(city);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    static class City{
        Mainn main;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    static class Mainn{
        Double temp;
        Double feels_like;
        Integer humidity;
    }
}
