import java.util.Scanner;

public class Main2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a1 = scanner.nextInt(); 
		int a2 = scanner.nextInt(); 
		int k = scanner.nextInt(); 
		System.out.println(a1 + (a2-a1) * (k - 1));
	}
}