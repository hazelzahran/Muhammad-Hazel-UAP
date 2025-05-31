package uap.models;
// Sphere.java
public class Sphere extends Shape {
    private double r;

    public Sphere(double r) {
        this.r = r;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3) * (22.0 / 7) * r * r * r * thickness;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * (22.0 / 7) * r * r;
    }
}
