import java.util.Arrays;

public class Matrix {
    private int[][] innerMatrix;

    public Matrix(int len){
        innerMatrix = new int[len][len];
    }

    public int getElement(int i, int j){
        return innerMatrix[i][j];
    }

    public void setElement(int i, int j,int value){
        innerMatrix[i][j] = value;
    }

    public int getMatrixSize(){
        return innerMatrix.length;
    }

    public void printMatrix(){
        for (int i = 0; i <innerMatrix.length ; i++) {
            System.out.println(Arrays.toString(innerMatrix[i]));
        }
    }
}
