package guide8;

public class Factorial {

    public int getFactorial(int n){
        return (n<=1)? 1: getFactorial(n-1)*n;
    }

    public static void main(String[] args) {
        System.out.println(new Factorial().getFactorial(5));
    }

}
