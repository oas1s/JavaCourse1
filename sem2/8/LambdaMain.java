public class LambdaMain {
    @FunctionalInterface
    interface SomeInterface {
         void doSome(Integer i);

        default void something(){
            System.out.println("some");
        }
    }
    public static void main(String[] args) {
        SomeInterface someInterface = new SomeInterface() {
            @Override
            public void doSome(Integer i) {
                System.out.println(i);
            }
        };

        SomeInterface someInterface1 = System.out::println;
        SomeInterface someInterface2 = i -> System.out.println(i);
        someInterface.doSome(2);
        someInterface1.doSome(2);
    }
}
