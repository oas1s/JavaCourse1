import java.util.Scanner;

//На вход приходит число вывести является ли оно четным
public class Main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		System.out.println(x % 2 == 0 ? "yes)": "no(");
		}
}