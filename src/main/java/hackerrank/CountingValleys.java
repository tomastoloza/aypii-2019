package hackerrank;

public class CountingValleys {

    static int countSteps(String s) {
        int steps = 0;
        for (char letter : s.toLowerCase().toCharArray()) {
            if (letter == 'd') {
                steps--;
            } else if (letter == 'u') {
                steps++;
            }
        }
        return steps;
    }

    static int countingValleys(int n, String s) {
        int seaLevel = 0;
        if (s.startsWith("D")) {
            seaLevel--;
            countSteps(s);
            seaLevel++;
        } else if (s.startsWith("U")) {
            seaLevel++;
            countSteps(s);
            seaLevel--;
        }

        System.out.println(seaLevel);
        return seaLevel;
    }

    public static void main(String[] args) {
        countingValleys(8, "UDDDUDUU");
        countingValleys(8, "DDUUDDUDUUUD");
    }
}
