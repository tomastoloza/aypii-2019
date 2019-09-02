package hackerrank;

import java.util.HashMap;

public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {
        int numberOfSocks = 0;

        HashMap<Integer, Integer> socks = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            if (socks.get(ar[i]) == null) {
                socks.put(ar[i], 1);
            } else {
                socks.put(ar[i], socks.get(ar[i]) + 1);
            }
        }
        for (int value : socks.values()) {
            int x = value / 2;
            numberOfSocks += x;
        }
        return numberOfSocks;
    }

    public static void main(String[] args) {
        System.out.println(sockMerchant(10, new int[]{1, 1, 3, 1, 2, 1, 3, 3, 3, 3,}));
    }
}
