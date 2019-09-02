package hackerrank;

public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c) {
        int numberOfJumps = 0;
        for (int i = 0; i < c.length - 1; i++) {
            try {

                if (c[i + 2] == 0) {
                    i++;
                }
                numberOfJumps++;
            } catch (ArrayIndexOutOfBoundsException e) {
                if (c[i + 1] == 0) {
                    i++;
                    numberOfJumps++;
                }
            }
        }
        return numberOfJumps;
    }

    public static void main(String[] args) {
//        jumpingOnClouds(new int[]{0, 0, 0, 0, 1, 0});
//        jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 0});
        jumpingOnClouds(new int[]{0, 0, 0, 1, 0, 0});

    }
}
