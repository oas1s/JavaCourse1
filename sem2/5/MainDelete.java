import java.util.*;

public class MainDelete {

    public static void main(String[] args) {
        LinkedList<Integer> list = getRandomList();
        LinkedList<Integer> list2 = new LinkedList<>(list);
        List<Integer> list1 = new LinkedList<>();
        Integer[] integers = new Integer[]{1,2,3,3,4};
        Collections.addAll(list1,integers);
        for (int i = 0; i < list1.size(); i++) {
            Integer curr = list1.get(i);
            if (curr > 2) {
                list1.remove(i);
            }
        }
        System.out.println(list1);

        ListIterator<Integer> listIterator = list.listIterator();
        measureTime(() -> {
            while (listIterator.hasNext()){
                int item = listIterator.next();
                if (item >= 128) {
                    listIterator.remove();
                }
            }
        });

        measureTime(() -> {
            List<Integer> integers1 = new LinkedList<>();
            for (int i = 0; i < list2.size(); i++) {
                Integer item = list2.get(i);
                if (item>=128){
                    integers1.add(item);
                }
            }
            list2.removeAll(integers1);
        });
    }

    public static LinkedList<Integer> getRandomList() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            list.add((int) Math.round(Math.random() * 256));
        }
        return list;
    }

    public static void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("Затраченное время: " + elapsed + " ms");
    }
}