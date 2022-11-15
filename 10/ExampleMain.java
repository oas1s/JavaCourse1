public class ExampleMain {
    public static void main(String[] args) {
        Sinitsa sinitsa = new Sinitsa();
        sinitsa.fly();
        sinitsa.plantEggs();
        sinitsa.sing();
        sinitsa.prepateToFly();
        sinitsa.type = "some type";
        System.out.println(sinitsa.type);
    }

    static class Sinitsa extends Bird implements Flyable{
        String name;

        @Override
        void sing() {
            System.out.println("chirik");
        }

        @Override
        public void fly() {
            System.out.println("vzletttt");
        }

        @Override
        public void plantEggs(){
            System.out.println("sinitsa plant eggs");
        }
    }
     abstract static class Bird {
        String type;
        int age;

        abstract void sing();

        void plantEggs(){
            System.out.println("planting eggs");
        }
    }

    interface Flyable {
        void fly();

        default void prepateToFly(){
            System.out.println("prepating......");
        }
    }
}
