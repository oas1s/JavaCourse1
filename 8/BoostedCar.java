public class BoostedCar extends Car{
    private int boostStartTime = -1;
    public BoostedCar(double weight, double horsePower,
                 int speedFirst3Minutes,
                 int speedAfter){
        super(weight,horsePower,speedFirst3Minutes,speedAfter);
    }
    public BoostedCar(double weight, double horsePower,
                      int speedFirst3Minutes,
                      int speedAfter,
                      int boostStartTime){
        super(weight,horsePower,speedFirst3Minutes,speedAfter);
        this.boostStartTime = boostStartTime;
    }

    @Override
    public void beep(){
        System.out.println("boost honk");
    }
}
