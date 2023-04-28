import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class User{
    public String name;
    public Integer age;
    public String car;
    public Double weight;
    public Double height;
    public User partner;
}