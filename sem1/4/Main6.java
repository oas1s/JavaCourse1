import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main6 {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		Random random = new Random();
		int[] a = random.ints(9,-200,200).toArray();
		String itis = "ITIS the best";
		char[] chars = itis.toCharArray();
		System.out.println(Arrays.toString(chars));	
		for(int i = 0;i<chars.length;i++) {
			int temp = (int) chars[i];
			System.out.print(temp + " ");
		}	
	}
}