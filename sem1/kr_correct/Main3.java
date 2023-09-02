import java.util.Scanner;

/*
1 задание 2 варианта
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        double y = scanner.nextInt();
        if (x<=0) {
            System.out.println("X не может быть меньше или равен 0");
        }
        if (logBase2(x) + Math.abs(y) == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static double logBase2(double x){
        return Math.log(x)/Math.log(2);
    }
}
