import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5);
        Queue<Integer> queue = new PriorityQueue<>(integers);
        for (Integer digit : queue){
            System.out.println(digit);
        }
        System.out.println("--------------------");

        for (int i = 0; i < 5; i++) {
            System.out.println(queue.poll());
        }
        System.out.println("--------------------");
        queue.add(2);
        queue.add(3);
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }


    static class MyQueue<T> extends AbstractCollection<T> implements Queue<T>{

        @Override
        public Iterator<T> iterator() {
            return null;
        }

        @Override
        public boolean add(T t){
            return false;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean offer(T t) {
            return false;
        }

        @Override
        public T remove() {
            return null;
        }

        @Override
        public T poll() {
            return null;
        }

        @Override
        public T element() {
            return null;
        }

        @Override
        public T peek() {
            return null;
        }
    }
}
