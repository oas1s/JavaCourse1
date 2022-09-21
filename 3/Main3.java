import java.util.Scanner;

/*
На вход приходит число если оно меньше 5 вывести "little" если оно больше 5 и больше
 10 вывести "large" если число больше 5 и
  меньше 10 вывести "middle"
  */
public class Main3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println(x < 5 ? "little" : x > 10 ? "large" : "middle");
	
}
}