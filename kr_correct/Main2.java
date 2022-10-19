import java.util.Arrays;
import java.util.Scanner;

/*
4 задание 2 варианта
 */
public class Main2 {

    public static void printMatrix(int[][] matrix){
        for (int[] i:matrix){
            System.out.println(Arrays.toString(i));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        double sum = 0;
        int[][] matrix = new int[k][k];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        printMatrix(matrix);
        for (int i = 0; i <k ; i++) {
            for (int j = 0; j <k ; j++) {
                if ((i>j) && ((i+j)<(k-1))){
                    sum+= matrix[i][j];
                }
                if ((i<j) && ((i+j)>(k-1))){
                    sum+= matrix[i][j];
                }
                if (i==j) {
                    sum += matrix[i][j];
                }
                if ((i+j)==(k-1)){
                    sum += matrix[i][j];
                }
            }
        }
        if (k % 2 ==1) {
            sum -= matrix[k/2][k/2];
        }
        System.out.println(sum);
    }
}
