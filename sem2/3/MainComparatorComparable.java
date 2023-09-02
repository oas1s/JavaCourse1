import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

public class MainComparatorComparable {
    static class ABC implements Comparable<ABC>{
        public Integer id;
        public String name;

        public ABC(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public int compareTo(ABC o) {
            return id.compareTo(o.id);
        }

        @Override
        public String toString() {
            return "ABC{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        Comparator<ABC> comparator = (x,y) -> x.id.compareTo(y.id);
        Comparator<ABC> comparator1 = new Comparator<ABC>() {
            @Override
            public int compare(ABC o1, ABC o2) {
                return 0;
            }
        };
        Comparator<ABC> comparator2 = new Comparator<ABC>() {
            @Override
            public int compare(ABC o1, ABC o2) {
               return o1.id.compareTo(o2.id);
            }
        };
        ABC[] abcs = new ABC[3];
        abcs[2] = new ABC(1,"first");
        abcs[0] = new ABC(3,"third");
        abcs[1] = new ABC(2,"second");
        Arrays.sort(abcs,comparator);
        System.out.println(Arrays.toString(abcs));
    }
}
