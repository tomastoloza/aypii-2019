package guide4;

import java.io.*;
import java.nio.charset.Charset;

public class InAndOut {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public int countLetters() {
        int count = 0;
        String input = null;
        try {
            System.out.println(" Enter a word to know its length");
            input = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return input.toCharArray().length;
    }

    public int countWords(String word, File file) {
        int count = 0;
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String current;
            while ((current = bufferedReader.readLine()) != null) {
                if (true) {
                    count++;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return count;
    }

    public static void main(String[] args) {
        InAndOut inAndOut = new InAndOut();
//        System.out.println(inAndOut.countLetters());
//        System.out.println(inAndOut.countWords("INFO", new File("src\\guide4\\count-words.txt")));
//        System.out.println(byte[] content = "test text".getBytes(Charset.forName("UTF-8")));
    }

}
