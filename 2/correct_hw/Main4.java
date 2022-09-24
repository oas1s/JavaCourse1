import java.util.Scanner;

// На вход подается целочисленное число в десятичной системе счисления
// Вычислить его двоичную запись
// Найти наибольшую длину последовательности единиц в двоичной записи
public class Main4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int bin = 0;
		int k = 0;
		while (x>0) {
			bin += (int)(x%2)*Math.pow(10,k);
			x = x/2;
			k++;
		}
		System.out.println(bin);
		int count = 0;
		int countMax = 0;
		while(bin>0) {
			if (bin%10 == 1) {
				count++;
				if (count>countMax) {
					countMax = count;
				}
			} else {
				count = 0;
			}
		bin /= 10;
		}
		System.out.println(countMax);
	}
}