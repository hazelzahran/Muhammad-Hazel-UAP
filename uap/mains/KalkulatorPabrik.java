package uap.mains;

import java.util.Scanner;
import uap.models.*;

public class KalkulatorPabrik {

    private static double readDouble(Scanner input, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String str = input.next().replace(",", ".");
                return Double.parseDouble(str);
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Masukkan angka dengan format benar.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("MUHAMMAD HAZEL ZAHRAN SALEH");
        System.out.println("NIM ANDA DI SINI");
        System.out.println("=============================================");

        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");

        double R = readDouble(input, "Isikan Radius   : "); // e.g. 7
        double r = readDouble(input, "Isikan radius   : "); // e.g. 3,5

        Torus torus = new Torus(R, r);
        System.out.println("=============================================");
        torus.printInfo();
        System.out.println("=============================================");

        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");

        double radius = readDouble(input, "Isikan radius   : "); // e.g. 21

        Sphere sphere = new Sphere(radius);
        System.out.println("=============================================");
        sphere.printInfo();
        System.out.println("=============================================");
    }
}
