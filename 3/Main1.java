import java.util.Scanner;

//1. На вход приходит число если оно меньше 5 вывести меньше
// 5 если больше, то больше
public class Main1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		String a = x < 5 ? "menshe" : "bolshe";
		System.out.println(a);
		}
}