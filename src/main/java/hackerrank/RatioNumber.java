package hackerrank;

import java.text.DecimalFormat;

public class RatioNumber {

    void plusMinus(int[] arr) {
        int positives=0;
        int negatives=0;
        int zeros=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                negatives++;
            }else if(arr[i]>0){
                positives++;
            }else{
                zeros++;
            }
        }
        double pos=positives/arr.length;
        double neg=negatives/arr.length;
        double zer=zeros/arr.length;
        DecimalFormat decimalFormat = new DecimalFormat("#.000000");

        System.out.println(pos);
        System.out.println(neg);
        System.out.println(zer);


    }

    public static void main(String[] args) {
        new RatioNumber().plusMinus(new int[]{1,4,0,-2,-1});
    }
}
