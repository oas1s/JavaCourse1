import java.util.Scanner;

/*
Найти элемент ближе всех к 0 ниже основной диагонали матрицы
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int [][] matrix = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        if (x == 1){
            System.exit(0);
        }
        int m = 10000000;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i > j){
                    if (Math.abs(matrix[i][j]) < m){
                        m = matrix[i][j];
                    }
                }
            }
        }
        System.out.println(m);
    }
}
