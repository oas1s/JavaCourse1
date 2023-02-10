import java.util.Scanner;
/*
Найти натуральное число от 0 до 100 с максимальной суммой делителей
  */
public class Main7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int maxl=0;
		int p=0;
		for (int i=1; i<=100;i++){
			if (maxlpr<ost(i)){
				maxl=prost(i);
				p=i;

			}
		}
		System.out.println(p);
}
	
	public static int prost(int x){
		int k=0;
		for (int i=1; i<=x;i++){
				if (x%i==0){
					k+=i;
				}
			} 
			return k;
		}
			}