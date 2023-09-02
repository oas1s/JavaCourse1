import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class InClassMain {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner =
                new Scanner(new File("test.csv"));
        scanner.nextLine();
        scanner.nextLine();
        List<Lap> lapList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String s1 = scanner.nextLine();
            if (s1.isEmpty()) {
                continue;
            }
            String[] strings = s1.split(",");
            lapList.add(new Lap(strings[0], strings[1], strings[2], Lap.parseTime(strings[3])
                    , Integer.parseInt(strings[4])));
        }

        Comparator<Lap> comparator = (x, y) -> x.year.compareTo(y.year);
        Comparator<Lap> comparator1 = (x, y) -> x.time.compareTo(y.time);
        Comparator<Lap> comparator2 = new Comparator<Lap>() {
            @Override
            public int compare(Lap o1, Lap o2) {
                if (o1.driver.equals("Michael Schumacher MSC") && o2.driver.equals("Michael Schumacher MSC")) {
                    return 0;
                }
                if (o1.driver.equals("Michael Schumacher MSC")) {
                    return 1;
                } else {
                    return -1;
                }

            }
        };
        lapList.sort(comparator);
        System.out.println(lapList.subList(0, 20));
        lapList.sort(comparator1);
        System.out.println(lapList.subList(0, 20));
        lapList.sort(comparator2);
        System.out.println(lapList.subList(0, 20));
    }


    static class Lap {
        private String grandPrix;
        private String driver;
        private String car;
        private Integer time;
        private Integer year;

        public Lap(String grandPrix, String driver, String car, Integer time, Integer year) {
            this.grandPrix = grandPrix;
            this.driver = driver;
            this.car = car;
            this.time = time;
            this.year = year;
        }

        public static Integer parseTime(String s) {
            if (s.indexOf(':') == -1) {
                return Integer.parseInt(s.substring(0, 2));
            }
            Integer minutes = Integer.parseInt(s.split(":")[0]);
            Integer secounds = Integer.parseInt(s.split(":")[1].substring(0, 2));
            Integer overall = minutes * 60 + secounds;
            return overall;
        }

        @Override
        public String toString() {
            return "Lap{" +
                    "grandPrix='" + grandPrix + '\'' +
                    ", driver='" + driver + '\'' +
                    ", car='" + car + '\'' +
                    ", time=" + time +
                    ", year=" + year +
                    '}';
        }
    }
}
