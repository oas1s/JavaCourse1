import java.util.Scanner;

//Найти сумму цифр введенного положительного целого числа
public class Main7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int sum = 0;
		while (x>0) {
			sum += x%10;
			x = x / 10;
		}
		System.out.println(sum);
	}
}