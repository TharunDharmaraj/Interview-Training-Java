import java.util.Arrays;

public class solution {

    public static int[][] multiply(int mat[][], int size) {
        int[][] mul = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int sum = 0;
                for (int k = 0; k < size; k++) {
                    sum += mat[i][k] * mat[k][j];
                }
                mul[i][j] = sum;
            }
        }
        return mul;
    }

    public static boolean checkMat(int orgMat[][], int transMat[][], int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (orgMat[i][j] != transMat[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean CheckIdempotent(int mat[][], int size) {
        int[][] orgMul = new int[size][size];
        orgMul = multiply(mat, size);
        return checkMat(orgMul, mat, size);
    }
}
