import java.util.Scanner;
/*
найти сумму побочной диагонали матрицы
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] matrix = new int[n][n];

        int sum = 0;
        int check = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
                if (i + j == check){
                    sum += matrix[i][j];
                }
            }

        }
        System.out.println(sum);
    }

}
