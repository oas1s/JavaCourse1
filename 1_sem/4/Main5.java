import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main5 {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		Random random = new Random();
		int[] a = random.ints(9,-200,200).toArray();
		System.out.println(Arrays.toString(a));
		int max = -1000;
		int min = 1000;
		int maxIndex = 0;
		int minIndex = 0;
		for(int i = 0; i<a.length; i++) {
       if (max < a[i]) {
       		max = a[i];
       		maxIndex = i;
       }
       if(min > a[i]){
       		min = a[i];
       		minIndex = i;
       }
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(Math.abs(maxIndex - minIndex) - 1);
	}
}