package guide8;

public class Binary {

    public static String getBinary(int number){
        if(number< 10){
            return String.valueOf(number / 2);
        }
        return String.valueOf(0);
    }

}
