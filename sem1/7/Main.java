public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("leopold",15);
        cat.meow();
        System.out.println(cat.passport());
        Cat.printPassport(cat);
    }
}
