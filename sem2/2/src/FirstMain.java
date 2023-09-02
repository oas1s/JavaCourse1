//public class FirstMain {
//    public static void main(String[] args) {
//
//        Account<Integer> acc1 = new Account<>(2334, 5000); // id - число
//        int acc1Id = acc1.getId()
//        System.out.println(acc1Id);
//
//        Account<String> account2 = new Account<String>("asd",23);
//
////        Account<String> acc2 = new Account<>("sid5523", 5000);    // id - строка
////        System.out.println(acc2.getId());
////        Integer[] ints = {2,3,4};
////        Account.Account2.<Integer>printArray(ints);
////        String[] strings = {"asada","adad"};
////        Account.Account2.printArray(strings);
//
//
//
//    }
//}
//class Account<T>{
//
//    private T id;
//    private int sum;
//
//    Account(T id, int sum){
//        this.id = id;
//        this.sum = sum;
//    }
//
//    public T getId() { return id; }
//    public int getSum() { return sum; }
//    public void setSum(int sum) { this.sum = sum; }
//
//    static class Account2 {
//        public static  <T> void printArray(T[] array){
//            for (int i = 0; i < array.length; i++) {
//                System.out.println(array[i]);
//            }
//        }
//    }
//}
//
//
//
