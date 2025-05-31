package uap.mains;
// CalculatorPabrik.java
import java.util.Scanner;

public class CalculatorPabrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MassBasedShippingCalculator calculator = new MassBasedShippingCalculator(5000);

        System.out.println("=========================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.print("NAMA LENGKAP\t: ");
        String nama = sc.nextLine();
        System.out.print("NIM\t\t: ");
        String nim = sc.nextLine();

        System.out.println("=========================================");
        System.out.println("Donat dengan Lubang");

        System.out.print("Isikan Radius r (input pengguna, isi dengan 7): ");
        double r = sc.nextDouble();
        System.out.print("Isikan Radius R (input pengguna, isi dengan 3.5): ");
        double R = sc.nextDouble();

        Torus torus = new Torus(r, R);
        printResult(torus, calculator);

        System.out.println("=========================================");
        System.out.println("Donat tanpa Lubang");

        System.out.print("Isikan Radius (input pengguna, isi dengan 21): ");
        double rs = sc.nextDouble();

        Sphere sphere = new Sphere(rs);
        printResult(sphere, calculator);

        System.out.println("=========================================");
    }

    private static void printResult(Shape shape, ShippingCostCalculator calculator) {
        double volume = shape.getVolume();
        double surface = shape.getSurfaceArea();
        double mass = shape.getMass();
        int biaya = calculator.calculateShippingCost(shape);

        System.out.printf("Volume\t\t: %.2f cm^3\n", volume);
        System.out.printf("Luas permukaan\t: %.2f cm^2\n", surface);
        System.out.printf("Massa dalam g\t: %.2f g\n", mass);
        System.out.printf("Massa dalam kg\t: %.2f kg\n", mass / 1000);
        System.out.printf("Biaya kirim\t: Rp%,d\n", biaya);
    }
}
