package guide4;

public class Calculator {

    public int divideByZero() {
        try {
            if (1==1){
                throw new DivideByZeroException("Feild");
            }
        } catch (DivideByZeroException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void main(String[] args) {
        new Calculator().divideByZero();
    }

}


class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}