import java.util.Iterator;

public class PythonIteratorMain {
    public static void main(String[] args) {
        for (int i: new PythonIterable(10)){
            System.out.println(i);
        }
    }

    static class PythonIterable implements Iterable<Integer>{

        int size;

        public PythonIterable(int size) {
            this.size = size;
        }

        @Override
        public Iterator<Integer> iterator() {
            return new PythonIterator(size);
        }

        static class PythonIterator implements Iterator<Integer>{
            int size;
            int current = 0;

            public PythonIterator(int size) {
                this.size = size;
            }

            @Override
            public boolean hasNext() {
                return current<=size;
            }

            @Override
            public Integer next() {
                return current++;
            }
        }
    }
}
