import java.util.Iterator;

public class KotlinIterator {
    public static void main(String[] args) {

        for(int i: new Range(0,100)){
            System.out.println(i);
        }
    }

    static class Range implements Iterable<Integer> {
        int start;
        int end;

        public Range(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public Iterator<Integer> iterator() {
            return new MyIterator(start,end);
        }

        static class MyIterator implements Iterator<Integer> {

            int start;
            int end;
            int current;

            public MyIterator(int start, int end) {
                this.start = start;
                this.end = end;
                this.current = start;
            }

            @Override
            public boolean hasNext() {
                return current<=end;
            }

            @Override
            public Integer next() {
                return current++;
            }
        }
    }
}
