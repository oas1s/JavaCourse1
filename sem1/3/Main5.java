import java.util.Scanner;
/*
Вычислить является ли число степенью двойки с помощью функции
  */
public class Main5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println(step(a));

}
	public static boolean step(int x) {
		int k = 1;
		while (x >= k){
			if (x == k){
				return true;
			} 
			k *= 2;

		}
		return false;
	}


}