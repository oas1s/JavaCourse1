import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class KrMain {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        List<Car> carList1 = carList.stream().filter(c -> c.name.equals("Honda"))
                .sorted().toList();
        List<String> names = carList.stream().map(c -> c.name).toList();

        carList.stream()
                .collect(Collectors.groupingBy(c -> c.suspension))
                .entrySet().stream()
                .filter(e -> e.getKey().equals("Auto"))
                .forEach(e -> {
                    e.getValue()
                            .forEach(c -> {
                        System.out.println(c.name + " " + c.price);
                    });
                });
    }

    static class Car {
        String name;
        String price;
        String suspension;

        public Car(String name, String price, String suspension) {
            this.name = name;
            this.price = price;
            this.suspension = suspension;
        }
    }
}
