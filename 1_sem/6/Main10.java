import java.util.*;
public class Main10 {
	public static void main(String[] args){
		int[] a = new Random().ints(10,0,100).toArray();
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(selectionSort(a)));
		System.out.println(Arrays.toString(doubleSelectionSort(a)));
}

	public static void swap(int[] arr, int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}


	public static int[] selectionSort(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count++;
			int minIndx = i;
			int min = arr[i];
			for (int j = i+1; j < arr.length; j++) {
				count++;
				if (arr[j] < min) {
					minIndx = j;
					min = arr[j];
				}
			}
			swap(arr,i,minIndx);
		}
		System.out.print(count + " ");
		return arr;
	}


	public static int[] doubleSelectionSort(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length/2; i++) {
			count++;
			int minIndx = i;
			int min = arr[i];
			int maxIndx = arr.length-i-1;
			int max = arr[arr.length-i-1];
			for (int j = i+1; j < arr.length-i; j++) {
				count++;
				if (arr[j] < min) {
					minIndx = j;
					min = arr[j];
				}
				if (arr[j] > max) {
					maxIndx = j;
					max = arr[j];
				}
			}
			swap(arr,i,minIndx);
			swap(arr,arr.length-i-1,maxIndx);
		}
		System.out.print(count + " ");
		return arr;
	}
}