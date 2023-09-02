import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(2);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix.getMatrixSize(); i++) {
            for (int j = 0; j <matrix.getMatrixSize() ; j++) {
                matrix.setElement(i,j,scanner.nextInt());
            }
        }
        matrix.printMatrix();
    }
}
