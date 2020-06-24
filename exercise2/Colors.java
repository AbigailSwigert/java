import java.util.Arrays;

public class Colors {

    String[] colorful(String[] strings) {
        // For the given strings, keep all the strings that begin with a color ("red", "yellow", "green", "blue", etc.) return an array of strings that start with a color.  discard all the other strings.  If no strings start with a color in the input array, return an empty array.
        return Arrays.stream(strings).filter(s -> s.startsWith("red") || s.startsWith("yellow") || s.startsWith("green") || s.startsWith("blue") || s.startsWith("pink") || s.startsWith("black")).toArray(String[]::new);
    }

    public static void main(String[] args) {
        Colors code = new Colors();
        code.colorful(new String[]{"bluebird","red herring", "yellow bumblebee","black spider",
                "green monkey","pink","great gatsby","feeding frenzy","black bird","widowmaker","quran","bible","torah"});
    }


}