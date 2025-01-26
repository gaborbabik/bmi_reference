import java.util.Scanner;

public class BmiCalculation {
    static double result;

    // BMI számítása
    static void calculateBmi(int weight, double height) {
        if (weight > 0 && height > 0) {
            result = weight / (height * height);
            System.out.printf("Az ön BMI indexe: %.2f \n", result);
            evaluateBmi(result);
        } else {
            System.out.println("Negatív számot adtál meg!");
            return;
        }
    }

    // Eredmény kiértékelése
    static void evaluateBmi(double result) {
        if (result<16) {
            System.out.println("Súlyos soványság");
        } else if (result >= 16 && result < 17) {
            System.out.println("Mérsékelt soványság");
        } else if (result >= 17 && result < 18.5) {
            System.out.println("Enyhe soványság");
        } else if (result >= 18.5 && result < 25) {
            System.out.println("Normális testsúly");
        } else if (result >= 25 && result < 30) {
            System.out.println("Túlsúlyos");
        } else if (result >= 30 && result < 35) {
            System.out.println("I. fokú elhízás");
        } else if (result >= 35 && result < 40) {
            System.out.println("II. fokú elhízás");
        } else if (result >= 40) {
            System.out.println("III. fokú (súlyos) elhízás");
        }
    }

    public static void main(String[] args) {

        // Adatok bekérése a számításhoz
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a súlyod kg-ban (Pl. 86) és a magasságod méterben (Pl. 1,86): ");

        int weight = scanner.nextInt();
        double height = scanner.nextDouble();

        calculateBmi(weight, height);

    }
}
