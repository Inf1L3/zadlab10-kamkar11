package pl.edu.ur.oopl10;

import java.util.Scanner;

public class WprowadzZKonsoli {

    static void wpiszInt() {
        Scanner input = new Scanner(System.in);
        try {
            int a = input.nextInt();
        } catch (Exception e) {
            System.out.println("Nie jest to int");
        }
    }

    static void wpiszString() {
        Scanner input = new Scanner(System.in);
        try {
            String a = input.nextLine();
        } catch (Exception e) {
            System.out.println("Nie jest to string");
        }
    }

    static void wpiszDouble() {
        Scanner input = new Scanner(System.in);
        try {
            Double a = input.nextDouble();
        } catch (Exception e) {
            System.out.println("Nie jest to double");
        }
    }

    static void wpiszFloat() {
        Scanner input = new Scanner(System.in);
        try {
            Float a = input.nextFloat();
        } catch (Exception e) {
            System.out.println("Nie jest to float");
        }
    }
}
