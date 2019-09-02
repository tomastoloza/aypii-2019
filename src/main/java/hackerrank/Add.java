package hackerrank;

public class Add {


    public static void add(int... num) {
        int sum = 0;
        String sumString = "";
        for (int value : num) {
            sumString += value + "+";
            sum += value;
        }
        sumString = sumString.substring(0, sumString.length() - 1) + "=" + sum;
        System.out.println(sumString);
    }


    public static void main(String[] args) {
        add(1, 2, 3);
    }
}
