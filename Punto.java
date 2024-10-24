package Ejercicios;

public class Punto {

    double x;
    double y;

    public Punto (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Coordenada x: " + this.x + "\nCoordenada y: " + this.y;
    }

}
