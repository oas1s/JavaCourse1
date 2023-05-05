import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {

    private int age;

    @CheckValue(ranges = "Boris")
    private String name;

    @CheckValue(ranges = "White")
    private String color;
}
