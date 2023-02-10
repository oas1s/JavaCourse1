import java.util.Scanner;
/*
Написать рекурсивную функцию которая вычисляет факториал числа
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(fact(a));
    }

    public static long fact(int a) {
        if (a == 0) {
            return 1;
        }
        return fact(a-1)*a;
    }
}
