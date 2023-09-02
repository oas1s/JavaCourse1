public class F1Car extends Car{
    public F1Car(double weight, double horsePower,
                     int speedFirst3Minutes,
                     int speedAfter){
        super(weight,horsePower,speedFirst3Minutes,speedAfter);
    }

    @Override
    public void beep(){
        System.out.println("F1 honk");
    }
}
