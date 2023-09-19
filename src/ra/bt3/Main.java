package ra.bt3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một năm: ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%d Là năm nhuận", year);
                } else {
                    System.out.printf("%d Không phải là năm nhuận", year);
                }
            } else {
                System.out.printf("%d Là năm nhuận", year);
            }
        } else {
            System.out.printf("%d Không phải là năm nhuận", year);
        }

    }
}
