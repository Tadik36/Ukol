package prvníverze;

public class Main {
    private static double polomer;
    public Main(double polomer) {
        this.polomer = polomer;
    }
    public static double obsah() {
        return Math.PI*polomer*polomer;
    }

    public static void main(String[] args) {
        Main obsah = new Main(2);
        System.out.format("Obsah kruhu je: %.5f", obsah.obsah());
    }
}
