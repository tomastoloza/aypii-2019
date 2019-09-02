package hackerrank;


import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class JesseAndCookies {

    static int cookies(int k, int[] A) {
        int operationCount = 0;
        Queue<Integer> sweets = new LinkedList();
        try {
            return operationCount;
        } catch (Exception e) {
            return -1;
        }
    }


    public static void main(String[] args) {
        System.out.println(cookies(7, new int[]{1, 2, 3, 9, 10, 12}));
//        System.out.println(cookies(3, new int[]{1, 1, 8}));
//        System.out.println(cookies(10, new int[]{1, 1, 1}));
        System.out.println(cookies(9, new int[]{1, 62, 14}));
        System.out.println(cookies(3581, new int[]{6214, 8543, 9266, 1150, 7498, 7209, 9398, 1529, 1032, 7384, 6784, 34, 1449, 7598, 8795, 756, 7803, 4112, 298, 4967, 1261, 1724, 4272, 1100, 9373,}));
    }
    //7

}
