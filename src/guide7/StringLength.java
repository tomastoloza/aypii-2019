package guide7;

public class StringLength implements Comparable<StringLength> {

    private final String text;

    public StringLength(String text){
        this.text=text;
    }

    @Override
    public int compareTo(StringLength o) {
        return this.text.length()>(o.text.length())?1:-1;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
