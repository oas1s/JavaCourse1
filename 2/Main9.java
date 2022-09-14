import java.util.Scanner;

//(x - x0)^2 + (y - y0)^2 <= R^2
//На вход подается целочисленный центр окружности x0 y0
//Целочисленный радиус R
//Вещественные x,y 
//Определить попадает ли точка x,y в круг
public class Main9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x0 = scanner.nextInt();
		int y0 = scanner.nextInt();
		int r = scanner.nextInt();
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		if (Math.pow(x-x0,2) + Math.pow(y-y0,2) <= Math.pow(r,2)) {
			System.out.println("popadaet");
		} else {
			System.out.println("ne popadaet");
		}
	}
}