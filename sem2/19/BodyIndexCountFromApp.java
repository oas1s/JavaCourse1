import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BodyIndexCountFromApp {
    private String url;

    private BodyIndexCounter bodyIndexCounter = new BodyIndexCounter();

    public Double countBodyIndexFromApp() throws Exception{
        InputStream inputStream = new URL(url)
                .openStream();
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        String json = new String(bytes);
        ObjectMapper objectMapper = new ObjectMapper();
        User user = objectMapper.readValue(json,User.class);
        System.out.println(user);
        return bodyIndexCounter.countBodyIndex(user);
    }

    public static void main(String[] args) throws Exception{
        BodyIndexCountFromApp bodyIndexCountFromApp =
                new BodyIndexCountFromApp("http://127.0.0.1:8080",
                        new BodyIndexCounter());
        System.out.println(bodyIndexCountFromApp.countBodyIndexFromApp());
    }
}
