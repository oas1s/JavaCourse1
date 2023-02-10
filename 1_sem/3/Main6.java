import java.util.Scanner;
/*
Вычислить является ли число четным, а сумма его цифр делится на 2
  */
public class Main6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println(st(a));
}
	public static boolean st(int x){
		int sum = 0;
		int y = x;
		while(x > 0){
			sum += x % 10;
			x /= 10;
		}
		return y % 2 == 0 && sum % 2 == 0 ? true : false;
	}
}