import java.util.Scanner;

/*
Вариант 1 задание 3.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double x = scanner.nextDouble();
        double sum = 0;
        for (int i = 1; i <=n; i++) {
            int factt = fact(i);
            double x1 = Math.pow(-1,i);
            double x2 = Math.pow(x,2*i+1);
            sum += (x1*x2)/(factt + x);
        }
        System.out.println(sum);
    }

    public static int fact(int a){
        int b = 1;
        for (int i = 1; i <=a ; i++) {
            b *= i;
        }
        return b;
    }
}
