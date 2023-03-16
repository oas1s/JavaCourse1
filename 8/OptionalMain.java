import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.empty();
        optional.ifPresent(System.out::println);
        Integer integer = optional.orElse(33);
        System.out.println(integer);
    }
}
