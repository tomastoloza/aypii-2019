package hackerrank;

public class Stringutil {
    public static void main(String[] args) {

        String A = "asd";
        String B = "eqweqw";

        System.out.println(A.length() + B.length());
        System.out.println((A.length()>B.length())?"Yes":"No");

        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1,A.length()).toLowerCase() + " "+B.substring(0,1).toUpperCase()+B.substring(1,B.length()).toLowerCase());

    }
}
