import java.util.Scanner;

/*
Вычислить сумму цифр числа с помощью функции
  */
public class Main4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println(countNumberSum(a));
}

	private static int countNumberSum(int x){
		int sum = 0;
		while (x>0) {
			sum += x%10;
			x /= 10;
		}
		return sum;
	}
}