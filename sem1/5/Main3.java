import java.util.*;

// Реализрвать функцию сортировки массива пузырьком
public class Main3 {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int len = Scanner.nextInt();
		int[] a = new int[len];
		for (int i=0;i<len;i++) {
			a[i] = Scanner.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(sort(a)));
	}

	public static int[] sort(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] < arr[j]){
					int currEl = arr[i];
					arr[i] = arr[j];
					arr[j] = currEl;
				}
			}
		}
		return arr;
	}
}