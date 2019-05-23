package guide8;

public class Exercises {


    public static long findFactorial(int number){
        if(number<=1){
            return number;
        }else{
            return 1* findFactorial(number+1);
        }
    }

    public static void main(String[] args) {
        System.out.println(findFactorial(3));
        int[][] arr = {{123},{123}};
    }



}