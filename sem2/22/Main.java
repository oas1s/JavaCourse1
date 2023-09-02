import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Animal animal =
                new Animal(12,"Boris","White");
        System.out.println(CheckValueAnnotationValidator
                .isValid(Animal.class,animal));
    }
}
