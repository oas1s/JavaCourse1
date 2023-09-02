import java.util.*;

// Реализовать вывод матрицы
public class Main5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int[][] matrix = new int[k][k];
		int[][] matrix2 = {{1,2,3},{4,5,6},{7,8,9}};
		for (int i =0;i<k ;i++ ) {
			for (int j = 0;j<k ;j++ ) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		printMatrix(matrix);
		printMatrix(matrix2);
	}

	public static void printMatrix(int[][] matrix){
		for (int i =0;i<matrix.length ;i++ ) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
}