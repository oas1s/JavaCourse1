import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main3 {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		Random random = new Random();
		int[] a = random.ints(9,-200,200).toArray();
		System.out.println(Arrays.toString(a));
		int d = 0;
		for (int i = 0; i < a.length; i++){
			d += a[i];

		}
		System.out.println(d);

	}
}