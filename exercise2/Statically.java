public class Statically {
    //Once you have finished getting statistically.js to run, refactor the code here in Java.
    private static String glue = "Epoxy";
    public String jello = "Jello";

    public static void moveAndShake() {
        System.out.println("Never stagnate in life.  Be agile, change, and improve...");
    }

    public static void stubborn() {
        Statically.moveAndShake();
        System.out.println("Please don't make me change... I just don't like it...");
    }

    public static void explain() {
        Statically.stubborn();
        System.out.println(Statically.glue);
    }

    public String getGlue() {
        return Statically.glue;
    }

    public static void main(String[] args) {
        Statically stats = new Statically();

        Statically.moveAndShake();
        Statically.stubborn();
        Statically.explain();

        System.out.println(stats.getGlue());
        System.out.println(stats.jello);
    }
}
