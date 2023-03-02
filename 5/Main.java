import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = getRandomList();
        List<Integer> listToRemove = new LinkedList<>();
        for (int i = 0; i <list.size() ; i++) {
            Integer integer = list.get(i);
            if (integer>=128){
                listToRemove.add(integer);
            }
        }
        list.removeAll(listToRemove);

        Iterator<Integer> iterator =list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        for (int i : list){
            System.out.println(i);
        }

    }

    public static LinkedList<Integer> getRandomList() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            list.add((int) Math.round(Math.random() * 256));
        }
        return list;
    }
}
