import java.lang.reflect.Array;
import java.util.*;

public class MyAbstractCollection<T> extends AbstractCollection<T> {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(3); list.add("asd");
        MyAbstractCollection<Integer> integers = new MyAbstractCollection<>(Integer.class,list);
        for (Integer i : integers){
            System.out.println(i);
        }
    }

    T[] array;

    public MyAbstractCollection(Class<T> tClass, Collection<T> collection){
        array = (T[]) Array.newInstance(tClass, collection.size());
        Iterator<T> iterator = collection.iterator();
        int indx = 0;
        while (iterator.hasNext()){
            array[indx] = iterator.next();
            indx++;
        }
    }

    public void addElem(){

    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator(array);
    }

    @Override
    public int size() {
        return array.length;
    }

    class MyIterator implements Iterator<T>{

        T[] ts;
        int current = 0;

        public MyIterator(T[] ts) {
            this.ts = ts;
        }

        @Override
        public boolean hasNext() {
            return current<ts.length;
        }

        @Override
        public T next() {
            return ts[current++];
        }
    }
}
