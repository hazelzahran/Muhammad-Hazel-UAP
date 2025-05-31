package uap.models;
// Torus.java
public class Torus extends Shape {
    private double r; // jari-jari kecil
    private double R; // jari-jari besar

    public Torus(double r, double R) {
        this.r = r;
        this.R = R;
    }

    @Override
    public double getVolume() {
        return 2 * (22.0 / 7) * (22.0 / 7) * R * r * r * thickness;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * (22.0 / 7) * (22.0 / 7) * R * r;
    }
}
