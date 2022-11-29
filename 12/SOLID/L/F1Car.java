package SOLID.L;

public class F1Car extends Car{

    @Override
    public void beep(){
        System.out.println(" new honk");
    }

    public static void main(String[] args) {
        Car car = new F1Car();
        car.beep();
    }
}
