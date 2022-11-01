public class Car {
    public double weight;
    public double horsePower;
    public int speedFirst3Minutes;
    public int speedAfter;

    public Car(double weight, double horsePower, int speedFirst3Minutes, int speedAfter) {
        this.weight = weight;
        this.horsePower = horsePower;
        this.speedFirst3Minutes = speedFirst3Minutes;
        this.speedAfter = speedAfter;
    }

    public Car(){
    }

    public void beep(){
        System.out.println("beep beep");
    }
}
