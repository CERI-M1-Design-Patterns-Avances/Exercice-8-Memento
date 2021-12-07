package exo8;

public class Point {

    private int abscisse, ordonnee;

    public Point(int abscisse, int ordonnee) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    @Override
    public String toString() {
        return  "abscisse=" + abscisse +
                ", ordonnee=" + ordonnee;
    }
}
