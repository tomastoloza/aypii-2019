package hackerrank;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatedString {

    static long repeatedString(String s, long n) {
        long count = 0;
        String repeated = "";
        for (int i = 0; i < n; i++) {
            repeated += s;
        }
        Pattern pattern = Pattern.compile(s);
        Matcher matcher = pattern.matcher(repeated);
        while (matcher.find())
            count++;
        return count;
    }

    public static void main(String[] args) {
        repeatedString("aba", 7);
    }


}
