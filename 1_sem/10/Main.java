public class Main extends MyClass implements MyInterface1 {
    public static void main(String[] args) {
        Main main = new Main();
        main.s = "Azat";
        main.hello();
        Main main2 = new Main();
        main2.s = "Danil";
        main2.hello();
        System.out.println(main.a);
        System.out.println(MyInterface1.ss);
        main.something();
        main.something2();
    }

    @Override
    void bye() {
        System.out.println("bye!");
    }

    @Override
    public void meow() {
        System.out.println("meow");
    }

//    @Override
//    public void something() {
//        MyInterface1.super.something();
//        MyInterface2.super.something();
//    }
}

abstract class MyClass {

    String s;
    int a = 15;

    void hello(){
        System.out.println("hello, " + s);
    }

    abstract void bye();
}


interface MyInterface1 extends MyInterface2{
    String ss = "asd";

    void meow();

    default void something(){
        System.out.println("something");
    }
}

interface MyInterface2 {
    default void something2(){
        System.out.println("something2");
    }
}
