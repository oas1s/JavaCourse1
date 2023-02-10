import java.util.Scanner;

//Вводится сторона квадрата, вывести в консоли 
//полый квадрат звездочками
public class Main8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if (n == 1) {
			System.out.println("*");
		} else {
		String str1 = "";
		String str2 = "";
		for (int i = 0;i<n ;i++ ) {
			str1 += "*";
			if (i == 0 || i == n-1) {
				str2 += "*";
			} else {
				str2 += " ";
			}
		}
		System.out.println(str1);
		for (int i = 0;i<n-2 ;i++ ) {
			System.out.println(str2);
		}
		System.out.println(str1);
	}
	}
}