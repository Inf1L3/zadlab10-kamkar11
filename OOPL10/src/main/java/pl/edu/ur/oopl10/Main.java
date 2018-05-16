package pl.edu.ur.oopl10;

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
        dzielenie();
        
    }
    
    static void dzielenie()
    {
        Scanner input = new Scanner(System.in);
        
        try {
            
           System.out.println("Wpisz liczby:");
           
           int n = input.nextInt();
           int m = input.nextInt();
           
           double w = n / m;
           
           System.out.println(w);
        }
        catch (ArithmeticException e) 
        {
            System.err.println("Blad dzielenia przez 0 !!!!! ");
        }
        
    }
    
}
