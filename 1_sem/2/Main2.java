import java.util.Scanner;

//Найти максимальное из 2 вещественных чисел
public class Main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		if (a>b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		
	}
}