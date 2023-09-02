import java.util.Scanner;
/*
Написать программу которая вводит двойку в степень полученного числа
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(powOf2(a));
    }

    public static int powOf2(int a){
        if(a == 0) {
            return 1;
        }
        return 2*powOf2(a-1);
    }
}
