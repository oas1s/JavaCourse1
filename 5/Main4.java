import java.util.*;

// Реализовать бинарный поиск
public class Main4 {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int x = Scanner.nextInt();
		int len = Scanner.nextInt();
		int[] a = new int[len];
		for (int i=0;i<len;i++) {
			a[i] = Scanner.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(sort(a)));
		a = sort(a);
		System.out.println(binarySearch(a, x));
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

	public static int binarySearch(int[] array, int x){
		int l = 0;
		int r = array.length - 1;
		int middle = (l + r) / 2;
		while (l <= r){
			middle = (l + r) / 2;
			if (array[middle] == x){
				return middle;
			}
			else if (array[middle] < x){
				l = middle;
			}
			else{
				r = middle;
			}
		}
		return -1;
	}
}