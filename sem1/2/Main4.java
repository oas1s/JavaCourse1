import java.util.Scanner;

//Вводятся вещественные x,y, целое n.
//Определить, попадает ли в квадрат размера n 
//С центром в начале координат точка (x,y)
public class Main4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		int n = scanner.nextInt();
		double z = n/2;
		if (Math.abs(x)<= z && Math.abs(y)<=z) {
			System.out.println("Popal");
		} else {
			System.out.println("Ne popal");
		}
	}
}