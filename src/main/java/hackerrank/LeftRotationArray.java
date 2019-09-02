package hackerrank;

import java.util.Arrays;

public class LeftRotationArray {

    static void rotateLeft(String[] aItems, int n, int d) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] rotated = a.clone();
        System.out.println(Arrays.toString(rotated));

        System.out.println(Arrays.toString(rotated));
    }


    public static void main(String[] args) {
        rotateLeft(new String[]{"1", "2", "3", "4", "5"}, 5, 4);
    }

}