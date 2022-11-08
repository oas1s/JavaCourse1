import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        ABC abc = new ABC();
//        try {
//            abc.doSomething();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        Square square = new Square();
//        square.setSide(-3);
//        try {
//            System.out.println(square.getPlosh());
//        } catch (SquareException e) {
//            e.printStackTrace();
//        }
        try {
            System.out.println(Square.divide(0));
        } catch (SquareException e) {
            e.printStackTrace();
        }
    }
}
