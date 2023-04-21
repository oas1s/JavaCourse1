import lombok.*;

import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestMain {
    public static void main(String[] args) throws Exception {
        InputStream inputStream =
                new URL("http://10.17.50.59:8080").openStream();
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        String s = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(s);
        String[] lines = s.split("\\n\\n");
        List<String> strings = new ArrayList<>(List.of(lines));
        strings.removeIf(sss -> sss.isEmpty());
        strings.remove(0);
        strings.remove(strings.size()-1);
        List<Student> students = new ArrayList<>();
        strings.remove(strings.size()-1);

        strings.forEach(ss -> {
            students.add(Student.builder()
                            .FIO(ss.split(";")[0])
                            .kr1(ss.split(";")[9].isEmpty() ? 0 : Double.parseDouble(ss.split(";")[9].replace(',','.')))
                            .kr2(ss.split(";")[20].isEmpty() ? 0 : Double.parseDouble(ss.split(";")[20].replace(',','.')))
                    .build());
        });
        System.out.println(students);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Student {
        String FIO;
        Double kr1;
        Double kr2;
    }
}
