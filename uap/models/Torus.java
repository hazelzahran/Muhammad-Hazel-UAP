package uap.models;

import uap.bases.Shape;

public class Torus extends Shape {
    private double R;
    private double r;

    public Torus(double R, double r) {
        this.R = R;
        this.r = r;
    }

    @Override
    public double getVolume() {
        return 2 * PI * PI * R * r * r;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * PI * R * r;
    }

    @Override
    public double getMass() {
        return getSurfaceArea() * THICKNESS * DENSITY;
    }

    @Override
    public int convertToKg() {
        return (int) Math.ceil(getMass() / 1000);
    }

    @Override
    public int getShippingCost() {
        return convertToKg() * 5000;
    }

    @Override
    public void printInfo() {
        System.out.printf("Volume          : %.2f\n", getVolume());
        System.out.printf("Luas permukaan  : %.2f\n", getSurfaceArea());
        System.out.printf("Massa           : %.2f\n", getMass());
        System.out.printf("Massa dalam kg  : %d\n", convertToKg());
        System.out.printf("Biaya kirim     : Rp%d\n", getShippingCost());
    }
}
