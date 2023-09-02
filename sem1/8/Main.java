public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("grey","english",
                "12");
        Cat cat2 = new Cat("black","bald",
                "13");
        System.out.println(Cat.crossing(cat1,cat2).toString());
    }
}
