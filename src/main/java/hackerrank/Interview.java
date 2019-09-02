package hackerrank;

import java.util.*;

public class Interview {

    /**
     * Agarra cada palabra de la lista, la ordena y compara con una lista de encontrados, si no esta, agrega la palabra
     */
    public static List<String> funWithAnagrams(List<String> s) {
        List<String> result = new LinkedList<String>();
        Set<String> found = new HashSet<String>();
        for (int i = 0; i < s.size(); i++) {
            String word = s.get(i);
            String key = key(word);
            if (!found.contains(key)) {
                result.add(word);
                found.add(key);
            }
        }

        Collections.sort(result);

        return result;
    }

    public static String key(String word) {
        char[] chrs = word.toCharArray();
        Arrays.sort(chrs);
        return new String(chrs);
    }


    public static int numberOfTokens(int expiryLimit, List<List<Integer>> commands) {
        HashMap<Integer, Integer> tokens = new HashMap<>(); //token_id: expiryTime
        ArrayList<Integer> deleted = new ArrayList<>();
        try {
            for (List<Integer> list : commands) {
                if (list.get(0) == 0) {
                    if (!deleted.contains(list.get(1))) {
                        tokens.put(list.get(1), list.get(2) + expiryLimit);
                    }
                } else if (list.get(0) == 1) {
                    if (tokens.get(list.get(1)) < list.get(2)) {
                        tokens.remove(list.get(1)); // borra si expiro
                        deleted.add(list.get(1));
                    } else {
                        tokens.put(list.get(1), list.get(2) + expiryLimit);//updatea el expiryLimit
                    }
                }
            }
        } catch (NullPointerException e) {
            //no existe
        }
        System.out.println(tokens);
        return tokens.size();
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> commands = new ArrayList<>();
        commands = new ArrayList<>();
        commands.add(0);
        commands.add(1);
        commands.add(1);
        list.add(commands);
        commands = new ArrayList<>();
        commands.add(0);
        commands.add(2);
        commands.add(6);
        list.add(commands);
        commands = new ArrayList<>();
        commands.add(1);
        commands.add(1);
        commands.add(5);
        list.add(commands);
        numberOfTokens(3, list);
    }
}
