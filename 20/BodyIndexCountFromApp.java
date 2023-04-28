import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BodyIndexCountFromApp {
    private String url;

    private BodyIndexCounter bodyIndexCounter = new BodyIndexCounter();
    private ApiJsonGetter apiJsonGetter = new ApiJsonGetter();

    public BodyIndexCountFromApp(String url) {
        this.url = url;
    }

    public Double countBodyIndexFromApp() throws Exception{
        String json = apiJsonGetter.getJsonFromURL(url);
        ObjectMapper objectMapper = new ObjectMapper();
        User user = objectMapper.readValue(json,User.class);
        System.out.println(user);
        return bodyIndexCounter.countBodyIndex(user);
    }

    public static void main(String[] args) throws Exception{
        BodyIndexCountFromApp bodyIndexCountFromApp =
                new BodyIndexCountFromApp("http://127.0.0.1:8080");
        System.out.println(bodyIndexCountFromApp.countBodyIndexFromApp());
    }
}
