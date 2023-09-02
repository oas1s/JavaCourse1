import java.util.*;

public class CollectionMain {
    public static void main(String[] args) {
        MyUnmodAbstrCollection<Integer> integers =
                new MyUnmodAbstrCollection<>(Arrays.asList(1,2,3,3));
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        integers.add(3);
        List<Integer> integers2 = Arrays.asList(1,2);
        MyAbstractCollection<Integer> myAbstractCollection =
                new MyAbstractCollection<>(Integer.class,integers2);

    }


    static class MyUnmodAbstrCollection<T> extends AbstractCollection<T>{

        private List<T> list = new ArrayList<>();

        public MyUnmodAbstrCollection(Collection<T> collection){
            Iterator<T> iterator = collection.iterator();
            while (iterator.hasNext()){
                list.add(iterator.next());
            }
        }

        @Override
        public Iterator<T> iterator() {
            return list.iterator();
        }

        @Override
        public int size() {
            return list.size();
        }
    }

}
