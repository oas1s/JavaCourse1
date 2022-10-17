import java.util.Arrays;
import java.util.Scanner;

/*
Реализовать игру в крестики-нолики
Написал проверку для строк
 */
public class Main11 {
    private static String winnerSymbol = "";

    public static boolean gameNotEnded(String[][] matrix) {
        for (int i = 0; i <matrix.length ; i++) {
            String str = matrix[i][0];
            for (int j = 0; j <matrix.length; j++) {
                if (!str.equals(matrix[i][j])) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    public static void printMatrix(String[][] matrix){
        for(String[] i: matrix){
            System.out.println(Arrays.toString(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String[][] matrix = new String[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j <3; j++) {
//                matrix[i][j] = "_";
//            }
//        }
//        printMatrix(matrix);
//        while (gameNotEnded(matrix)) {
//
//        }
        String[][] matrix = {{"X","X","X"},{"X","Y","Z"},{"X","Y","Z"}};
        System.out.println(gameNotEnded(matrix));
    }
}
