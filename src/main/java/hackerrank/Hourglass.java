package hackerrank;

public class Hourglass {
    static int hourglassSum(int[][] arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            String current = "";
            for (int j = 0; j < arr.length - 2; j++) {
                sum = 0;
                sum += arr[i][j];
                sum += arr[i][j + 1];
                sum += arr[i][j + 2];
                sum += arr[i + 1][j];
                sum += arr[i + 1][j + 1];
                sum += arr[i + 1][j + 2];
                sum += arr[i + 2][j];
                sum += arr[i + 2][j + 1];
                sum += arr[i + 2][j + 2];
                System.out.println(sum);
            }
        }
        if (sum > max) {
            max = sum;
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}};
        System.out.println(hourglassSum(arr));
    }

}
