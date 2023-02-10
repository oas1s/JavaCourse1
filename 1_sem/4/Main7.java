import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int len1 = scanner.nextInt();
		int[] a = new int[len1];

		for (int i = 0; i < len1; i++) {
			a[i] = scanner.nextInt();
		}

		int len2 = scanner.nextInt();
		int[] b = new int[len2];

		for (int i = 0; i < len2; i++) {
			b[i] = scanner.nextInt();
		}

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(fun(a, b));
	}

	public static boolean fun(int[] a, int[] b){
		int countIndex = 0;
		for (int i = 0; i < b.length; ++i){
			if (a[countIndex] == b[i]){
				countIndex++;
				if (countIndex == a.length){
					return true;
				}
			}

			else{
				countIndex = 0;
			}
		}
		return false;
	}
}