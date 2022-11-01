public class MainCar {
    public static void main(String[] args) {
        CasualCar casualCar = new CasualCar(1000d,
                450d,30,40);
        casualCar.beep();
        System.out.println(casualCar);
    }
}
