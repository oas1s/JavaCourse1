import java.util.*;

public class MapMain {
    public static void main(String[] args) {
         Map<Student,Double> marks = new HashMap<>();
         marks.put(new Student("Artem",19,1),9.0);
         marks.put(new Student("Dima",18,2),10.0);
         marks.put(new Student("Tsveta",19,3),4.0);
         marks.put(new Student("Tsveta",19,3),6.0);

        System.out.println(marks);

        System.out.println(marks.get(new Student("Artem",19,1)));
        System.out.println(marks.containsKey(new Student("Azat",22,1)));
        System.out.println(marks.containsValue(9.0));
        System.out.println(marks.keySet());
        System.out.println(marks.values());
        System.out.println(marks.entrySet());
        List<Double> markss = marks.entrySet().stream().filter(e -> e.getValue()>8).map(Map.Entry::getValue).toList();
        System.out.println(markss);
        System.out.println(marks);
    }

    static class Student implements Comparable{
        String name;
        Integer age;
        Integer course;

        public Student(String name, Integer age, Integer course) {
            this.name = name;
            this.age = age;
            this.course = course;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) && Objects.equals(age, student.age) && Objects.equals(course, student.course);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, course);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", course=" + course +
                    '}';
        }

        @Override
        public int compareTo(Object o) {
            Student student = (Student) o;
            return this.name.compareTo(student.name);
        }
    }
}
