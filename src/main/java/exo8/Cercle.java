package exo8;

public class Cercle {

    private Point centre;

    public Cercle(Point centre) {
        this.centre = centre;
    }

    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Cercle{" + centre + '}';
    }

    public void deplacement(Point point) {
        centre = point;
    }

}
