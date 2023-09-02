import java.util.Scanner;

//Прервать ввод в момент, когда очередное число
// будет меньше предыдущего
public class Main6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		while (a<b) {
			a = b;
			b = scanner.nextInt();
		}
	}
}