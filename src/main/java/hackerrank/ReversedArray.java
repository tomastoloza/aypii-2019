package hackerrank;

public class ReversedArray {

    static int[] reverseArray(int[] a) {
        int[] reversed = new int[a.length];
        for(int i = a.length-1; i>=0; i--){
            for (int j = 0; j < a.length-i; j++) {
                reversed[i]=a[j];
            }
        }
        return reversed;
    }


    public static void main(String[] args) {
        for (int i = 0; i < reverseArray(new int[]{1,4,3,2}).length; i++) {
            System.out.println(reverseArray(new int[]{1,4,3,2})[i]);
        };
    }
}
