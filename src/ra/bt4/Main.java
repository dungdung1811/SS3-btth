package ra.bt4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("Nhập cân nặng của bạn (kilogram): ");
        weight = sc.nextDouble();
        System.out.println("Nhập chiều cao của bạn (meters): ");
        height = sc.nextDouble();

        bmi = weight / Math.pow(height, 2);

        System.out.printf("%-20s%s", "BMI", "PHÂN TÍCH\n");
        if (bmi < 18.5) {
            System.out.printf("%-20.2f%s", bmi, "Gầy\n");
        } else if (bmi < 24.9) {
            System.out.printf("%-20.2f%s", bmi, "Bình thường\n");
        } else if (bmi < 29.9) {
            System.out.printf("%-20.2f%s", bmi, "Hơi béo\n");
        } else {
            System.out.printf("%-20.2f%s", bmi, "Béo phì\n");
        }

        sc.close();
    }
}
