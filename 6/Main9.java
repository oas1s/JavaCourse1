import java.util.Arrays;
import java.util.Scanner;

/*

 */
public class Main9 {
    public static int [][] matrixTrans(int [][] matrix) {
        int [][] trans = new int [matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) { //ОЧЕВИДНО
            for (int j = 0; j < matrix.length; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int [][] matrix1 = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        printMatrix(matrix1);
        System.out.println("-------");
        printMatrix(matrixTrans(matrix1));

    }

    public static void printMatrix(int[][] matrix){
        for(int[] i: matrix){
            System.out.println(Arrays.toString(i));
        }
    }
}
