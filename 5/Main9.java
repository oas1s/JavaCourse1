import java.util.Iterator;

public class Main9 {
    public static void main(String[] args) {
        Integer[] integers = new Integer[] {1,2,3,3,3,4};
        Iterator<Integer> iterator = new MyIterator(integers);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    static class MyIterator implements Iterator<Integer>{

        private Integer[] integers;
        private int current;

        public MyIterator(Integer[] integers) {
            this.integers = integers;
            this.current = integers.length-1;
        }


        @Override
        public boolean hasNext() {
            return current>=0;
        }

        @Override
        public Integer next() {
            return integers[current--];
        }
    }
}
