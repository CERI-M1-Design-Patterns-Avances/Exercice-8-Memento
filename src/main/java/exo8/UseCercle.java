package exo8;

public class UseCercle {
    public static void main(String[] args) {
        Cercle cercle = new Cercle(new Point(10,20));
        cercle.draw();
        cercle.deplacement(new Point(50,50));
        cercle.deplacement(new Point(30,30));
        cercle.draw();
/*        cercle.annuleDeplacement();
        cercle.draw();
        cercle.annuleDeplacement();
        cercle.draw();*/
    }
}
