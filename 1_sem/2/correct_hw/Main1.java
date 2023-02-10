import java.util.Scanner;

public class Main1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt(); 
		x = y + x;
		y = x - y;
		x = x - y;
		System.out.println(x);
		System.out.println(y);
	}
}