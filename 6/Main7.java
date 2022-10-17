import java.util.Scanner;

/*
Найти сумму всех элементов ниже побочной и основной диагоналей матрицы
 */
public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int [][] matrix = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if ((i > j) && (i + j > x - 1)) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
