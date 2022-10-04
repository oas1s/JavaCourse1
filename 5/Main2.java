import java.util.*;

// Проверить является ли массив частью чисел Фибоначчи
public class Main2 {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);

		//Ввод
		int len = Scanner.nextInt();
		int[] a = new int[len];
		for (int i=0;i<len;i++) {
			a[i] = Scanner.nextInt();
		}

		boolean flag = true;
		for(int i = 0; i < len; i++){
			if (((Math.pow((5 * Math.pow(a[i],2) + 4),0.5) % 1) != 0 ) && ((Math.pow((5 * Math.pow(a[i],2) - 4),0.5) % 1) != 0)){
				flag = false;
				break;
			}
		}

		//проверка
		if (flag){
			for(int i = 2; i < len; i++){
				if (a[i] != (a[i-1] + a[i - 2])){
					flag = false;
					break;
				}
			}
		}

		//Вывод
		System.out.println(flag);
	}
}