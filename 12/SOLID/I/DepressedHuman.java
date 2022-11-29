package SOLID.I;
// implements Human
public class DepressedHuman implements AbleToEat{
    @Override
    public void eat() {
        System.out.println("nom nom");
    }

//    @Override
//    public void sleep() {
//        throw new RuntimeException("cant sleep");
//    }
}
