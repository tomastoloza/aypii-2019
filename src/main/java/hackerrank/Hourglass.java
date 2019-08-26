package hackerrank;

public class Hourglass {
    static int hourglassSum(int[][] arr) {
        int max = 0;
        for (int j = 0; j < arr.length - 2; j++) {
            int sum = 0;
            for (int i = 0; i < arr.length - 2; i++) {
                sum += arr[i][j];
                sum += arr[i][j + 1];
                sum += arr[i][j + 2];
                sum += arr[i + 1][j + 1];
                sum += arr[i + 2][j];
                sum += arr[i + 2][j + 1];
                sum += arr[i + 2][j + 2];
            }
            if (sum > max)
                max = sum;
        }

        return max;
    }

}
