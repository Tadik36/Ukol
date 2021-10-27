package druhaverze;

public class Obsahkruhu {
    private double polomer;
    public Obsahkruhu(double polomer){
     this.polomer = polomer;
    }
    public double obsah() {
       return Math.PI*this.polomer*this.polomer;
    }
}
