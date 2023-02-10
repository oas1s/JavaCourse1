import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("nces330_20.csv"));
        List<Education> educations = new ArrayList<>();
        scanner.nextLine();
        while (scanner.hasNextLine()){
            String[] strings = scanner.nextLine().split(",");
            educations.add(new Education(Integer.parseInt(strings[0]),
                    strings[1],strings[2],parseYear(strings[3]),strings[4],
                    strings[5]));
        }
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < educations.size(); i++) {
            integers.add(educations.get(i).length);
        }
        System.out.println(integers.stream().mapToInt(i -> i).sum());
        System.out.println(Collections.max(educations.stream().map(x -> Integer.parseInt(x.value)).collect(Collectors.toList())));
    }

    public static int parseYear(String s){
        return s.toCharArray()[0] - '0';
    }

    static class Education{
        int year;
        String state;
        String type;
        int length;
        String expense;
        String value;

        public Education(int year, String state, String type, int length, String expense, String value) {
            this.year = year;
            this.state = state;
            this.type = type;
            this.length = length;
            this.expense = expense;
            this.value = value;
        }
    }
}
