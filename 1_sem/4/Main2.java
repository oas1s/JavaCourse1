import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main2 {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		Random random = new Random();
		int[] a = random.ints(9,-200,200).toArray();
		System.out.println(Arrays.toString(a));
		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}

		System.out.println("max: " + max);
		System.out.println("min: " + min);

	}
}