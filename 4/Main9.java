import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		System.out.println(palindr(s));
		

	}
	public static boolean palindr(String s){
		char[] arr = s.toCharArray();
		int index = arr.length-1;
		for (int i = 0; i < arr.length/2 ; i ++){
			if (arr[i] != arr[index - i]){
				return false;
			}
		}
		return true;

	}

}