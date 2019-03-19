package hackerrank;


import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static void findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month-1,day);
        String[] days = {"SUNDAY","MONDAY", "TUESDAY","WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        System.out.println(days[calendar.getTime().getDay()]);
    }


    public static void main(String[] args) {
        findDay(8, 16, 2015);
    }

//public class DateTime {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int month = Integer.parseInt(firstMultipleInput[0]);
//
//        int day = Integer.parseInt(firstMultipleInput[1]);
//
//        int year = Integer.parseInt(firstMultipleInput[2]);
//
//        String res = Result.findDay(month, day, year);
//
//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
}
