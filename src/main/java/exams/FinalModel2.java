package exams;

import java.util.Arrays;

public class FinalModel2 {


    private static int[][] getTransposed(int[][] matrix) {
        int[][] matrixT = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrixT.length; i++) {
            for (int j = 0; j < matrixT[0].length; j++) {
                matrixT[i][j] = matrix[j][i];
            }
        }
        return matrixT;
    }

    private static boolean isSymmetric(int[][] matrix) {
        boolean isSymmetric = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (!(matrix[i][j] == getTransposed(matrix)[i][j])) {
                    isSymmetric = false;
                }
            }
        }
        return isSymmetric;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {2, 5, 0 },
                {3, 0, 5}};
        System.out.println(Arrays.deepToString(getTransposed(matrix)));
        System.out.println(isSymmetric(matrix));
    }

}
