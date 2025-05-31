package uap.bases;
// Shape.java
public abstract class Shape {
    protected double density = 0.65; // g/cm^3
    protected double thickness = 0.5; // cm

    public abstract double getVolume();
    public abstract double getSurfaceArea();

    public double getMass() {
        return getVolume() * density; // dalam gram
    }
}
