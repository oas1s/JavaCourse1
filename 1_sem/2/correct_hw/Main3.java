import java.util.Scanner;

public class Main3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(); 
		int factorial = 1;
		for(int i = 1; i <= a; i++){
			factorial *= i;
		}
		System.out.println(factorial);
	}
}