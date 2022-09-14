import java.util.Scanner;

//Вывести таблицу умножения для числа k
public class Main5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		for (int i = 1; i<10 ; i++) {
			System.out.println(k + " * " + i + " = " + k*i);
		}
	}
}