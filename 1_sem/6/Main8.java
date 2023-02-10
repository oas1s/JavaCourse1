import java.util.Arrays;
import java.util.Scanner;

/*
Реализовать функцию для сложения матриц
 */
public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int [][] matrix1 = new int[x][x];
        int [][] matrix2 = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        printMatrix(matrix1);
        printMatrix(matrix2);
        printMatrix(summMatrix(matrix1, matrix2));
    }
    public static void printMatrix(int[][] matrix){
        for(int[] i: matrix){
            System.out.println(Arrays.toString(i));
        }
    }

    public static int[][] summMatrix(int[][] matrix1, int[][] matrix2){
        int n = matrix1.length;
        int[][] newMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return newMatrix;
    }
}
