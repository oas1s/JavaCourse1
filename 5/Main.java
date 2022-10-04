import java.util.*;

// Среднее арифметическое всех элементов на четных позициях
public class Main {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int len = Scanner.nextInt();
		int[] a = new int[len];
		for (int i=0;i<len;i++) {
			a[i] = Scanner.nextInt();
		}
		int sum=0;
		int k = 0;
		for (int i=0; i<len; i++) {
			if (i%2==0) {
				sum+=a[i];
				k++;
			}
		}
		int srArifm = sum/k;
		System.out.println("sum = "+ sum);
		System.out.println(srArifm);
	}
}