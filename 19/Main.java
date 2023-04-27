import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.ToString;

public class Main {
    public static void main(String[] args) throws Exception{
        String json = "{\"name\":\"John\", \"age\":30, \"car\":null, \"id\": 123}";
        ObjectMapper objectMapper = new ObjectMapper();
        User user = objectMapper.readValue(json,User.class);
        System.out.println(user);
    }
}
