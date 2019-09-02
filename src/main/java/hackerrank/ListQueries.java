package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ListQueries {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bf.readLine());
        String[] arr = bf.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (String value : arr) {
            list.add(Integer.parseInt(value));
        }
        size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String next = bf.readLine();
            if (next.contains("Insert")) {
                String[] query = bf.readLine().split(" ");
                list.add(Integer.parseInt(query[0]), Integer.parseInt(query[1]));
            } else if (next.contains("Delete")) {
                list.remove(Integer.parseInt(bf.readLine()));
            }
        }

        String listString = "";
        for (int item : list) {
            listString += item + " ";
        }
        System.out.println(listString);
    }
}
