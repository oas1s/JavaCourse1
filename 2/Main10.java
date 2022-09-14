import java.util.Scanner;

//(x - x0)^2 + (y - y0)^2 <= R^2
//На вход подается вещественная пара чисел x,y
// Определить попадает ли точка в мишень
// (концентрические круги радиусом 1,2,..10)
// Если да, то вывести номер круга наименьшего радиуса куда попала точка
// Если нет, вывести "missed"
public class Main10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 double x = scanner.nextDouble();
		 double y = scanner.nextDouble();
		 boolean hit = false;
		 for (int r =1;r<=10 ;r++ ) {
		 	if (Math.pow(x,2) + Math.pow(y,2) <= Math.pow(r,2)) {
		 		System.out.println(r);
		 		hit = true;
		 		break;
		 	}
		 }
		 if (hit == false) {
		 	System.out.println("missed");
		 }
	}
}