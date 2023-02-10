import java.util.Scanner;

//Вводится 3 вещественных числа найти максимум (без циклов)
public class Main3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		if (a>b && a>c) {
			System.out.println(a);
		} else if (b>a && b>c){
			System.out.println(b);
		} else {
			System.out.println(c);
		}
		
	}
}