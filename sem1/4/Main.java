import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		Random random = new Random();
		random.ints(9,-200,200).toArray();
		int[] a = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		int[] b = {1,2,3,4,6};
		System.out.println(Arrays.toString(a));
		System.out.println(a.length);
		System.out.println(Arrays.toString(b));
	}
}