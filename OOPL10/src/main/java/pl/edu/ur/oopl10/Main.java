package pl.edu.ur.oopl10;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 2
        /*
        int[] tablica = {32, 24, 32345, 4};
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ktory element tablicy wyświetlic?");
        int index = input.nextInt();
        input.close();
        try 
        {
            System.out.println(tablica[index]);
        } 
        catch(ArrayIndexOutOfBoundsException e) 
        {
            System.err.println("Podales indeks wykraczajacy poza rozmiar tablicy!");
        }
         */
        // 3
        /*
        dzielenie();
         */
        // 4 
        
       
        Random r = new Random();

        int a = r.nextInt(21) + (-10);
        //int b = r.nextInt(21) + (-10);
        int b = 0;

        int licznik = 0;
        while (licznik < 3) {
            try {
                int wynik = a / b;
                System.out.println(wynik);
            } catch (ArithmeticException e) {
                System.out.println("blad dzielenia przez zero");
                licznik++;
                System.out.println("wyjatek zostal wywolany " + licznik + " raz");

            }
        }
       
        
        
        
        
    }

    static void dzielenie() {
        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Wpisz liczby:");

            int n = input.nextInt();
            int m = input.nextInt();

            double w = n / m;

            System.out.println(w);
        } catch (ArithmeticException e) {
            System.err.println("Blad dzielenia przez 0 !!!!! ");
        }

    }

}
