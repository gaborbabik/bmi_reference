import java.util.Scanner;

public class BmiCalculation {
    static double result;

    // BMI számítása
    static void bmiCalculationMethod(int weight, double height) {
        result = weight / (height*height);
        System.out.printf("Az ön BMI indexe: %.2f \n", result);
    }

    // Eredmény kiértékelése
    static void bmiEvaluation(double result) {
        if (result<16) {
            System.out.println("Súlyos soványság");
        } else if (result >= 16 & result <= 16.99) {
            System.out.println("Mérsékelt soványság");
        } else if (result >= 17 & result <= 18.49) {
            System.out.println("Enyhe soványság");
        } else if (result >= 18.5 & result <= 24.99) {
            System.out.println("Normális testsúly");
        } else if (result >= 25 & result <= 29.99) {
            System.out.println("Túlsúlyos");
        } else if (result >= 30 & result <= 34.99) {
            System.out.println("I. fokú elhízás");
        } else if (result >= 35 & result <= 39.99) {
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

        bmiCalculationMethod(weight, height);
        bmiEvaluation(result);

    }
}
