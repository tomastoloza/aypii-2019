package hackerrank;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String current = "";
        int count = 0;

        while ((current = scanner.nextLine()) != null) {
            count++;
            System.out.println(count + " " + current);
        }

    }
}
