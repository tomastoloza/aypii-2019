package guide4;

import java.io.*;

public class Reader {

    public static String read(String file) {
        String concated = "";
        try {
            int var;
            FileReader reader = new FileReader(file);
            while ((var = reader.read()) != -1) {
                concated += (char) var;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return concated;
    }


    public static void main(String[] args) {
        read("\\file.txt");
    }


}
