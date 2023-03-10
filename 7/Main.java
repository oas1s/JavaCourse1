import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("one");
        treeSet.add("two");
        treeSet.add("three");
        treeSet.add("four");
        treeSet.add("five");

        System.out.println(treeSet.size());
        for (String s : treeSet){
            System.out.println(s);
        }

        Student student = new Student(1,"Danil");
        Student student1 = new Student(2,"Artem");
        Student student2 = new Student(3,"Nafis");
        Student student3 = new Student(4,"Azat");
        Student student4 = new Student(5,"Alina");

        TreeSet<Student> treeSet2 = new TreeSet<>((x,y) -> x.id.compareTo(y.id));
        treeSet2.add(student1);
        treeSet2.add(student4);
        treeSet2.add(student2);
        treeSet2.add(student3);
        treeSet2.add(student);

        for (Student studentt : treeSet2){
            System.out.println(studentt);
        }

        System.out.println(treeSet2.first());

        System.out.println(treeSet2.tailSet(new Student(3,"Timur")));
        System.out.println(treeSet2.headSet(new Student(3,"Timur")));
        System.out.println(treeSet2.subSet(new Student(2,"Aida"),new Student(4,"Kirill")));
    }


    static class Student {
        Integer id;
        String name;

        public Student(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Objects.equals(id, student.id) && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
