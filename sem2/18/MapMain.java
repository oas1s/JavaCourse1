import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class MapMain {
    public static void main(String[] args) {
        MyMap<Student,String> map =
                new MyMap<>();
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Student implements Comparable<Student>{
        private String name;
        private Integer age;

        @Override
        public int compareTo(Student o) {
            return 0;
        }
    }
}
