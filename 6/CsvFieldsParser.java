import java.util.Arrays;

public class CsvFieldsParser {
    public static void main(String[] args) {
        String s = "rank,personName,age,finalWorth,category," +
                "source,country,state,city,organization,selfMade,gender,birthDate,title,philanthropyScore,bio,about";
        Arrays.stream(s.split(",")).forEach(ss -> System.out.println("String " + ss +";"));
    }
}
