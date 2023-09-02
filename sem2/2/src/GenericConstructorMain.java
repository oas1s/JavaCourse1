public class GenericConstructorMain {
    public static void main(String[] args) {

        Account1 acc1 = new Account1("cid2373", 5000);
        Account1 acc2 = new <Long>Account1(53757l, 4000);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}

class Account1{

    private String id;
    private int sum;

    <T>Account1(T id, int sum){
        this.id = id.toString();
        this.sum = sum;
    }

    public String getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}
