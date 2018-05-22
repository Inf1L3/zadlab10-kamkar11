package pl.edu.ur.oopl10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WprowadzZKonsoli {

    public void wpiszInt() {
        Scanner input = new Scanner(System.in);
        try {
            int a = input.nextInt();
        } catch (Exception e) {
            System.out.println("Nie jest to int");
        }
    }

    public void wpiszString() {
        Scanner input = new Scanner(System.in);
        try {
            String a = input.nextLine();
        } catch (Exception e) {
            System.out.println("Nie jest to string");
        }
    }

    public void wpiszDouble() {
        Scanner input = new Scanner(System.in);
        try {
            Double a = input.nextDouble();
        } catch (Exception e) {
            System.out.println("Nie jest to double");
        }
    }

    public void wpiszFloat() {
        Scanner input = new Scanner(System.in);
        try {
            Float a = input.nextFloat();
        } catch (Exception e) {
            System.out.println("Nie jest to float");
        }
    }

    public void wpiszlong() {
        Scanner input = new Scanner(System.in);
        try {
            long a = input.nextLong();
        } catch (Exception e) {
            System.out.println("Nie jest to long");
        }
    }

    public void wpiszshort() {
        Scanner input = new Scanner(System.in);
        try {
            short a = input.nextShort();
        } catch (Exception e) {
            System.out.println("Nie jest to short");
        }
    }

    public void wpiszchar() {
        Scanner input = new Scanner(System.in);
        try {
            char a = input.next().charAt(0);
        } catch (Exception e) {
            System.out.println("Nie jest to char");
        }
    }

    /*
    // czytanie
    FileReader fr = new FileReader("nazwa.rozszerzenie");
        BufferedReader br = new BufferedReader(fr);
        while (stringRead != null) {
            stringRead = br.readLine();
            //...  rzutowanie na odpowiedni typ i podstawienie pod
            //...  zmienną
        }
        br.close();
    }
     */
 /*
    // zapis
    FileWriter fwo = new FileWriter("nazwa.rozszerzenie", `false`/`true`);
        BufferedWriter bwo = new BufferedWriter(fwo);
        bwo.write(...);
        bwo.newLine();

        bwo.close();
    
     */
    public void zapiszInt(int x) {

        try {
            FileWriter fw = new FileWriter("zapis.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.valueOf(x));
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("blad zapisu");
        }
    }

    public void zapiszString(String x) {
        try {
            FileWriter fw = new FileWriter("zapis.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(x);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("blad zapisu");
        }
    }

    public void zapiszDouble(double x) {
        try {
            FileWriter fw = new FileWriter("zapis.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.valueOf(x));
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("blad zapisu");
        }
    }

    public void zapiszFloat(float x) {
        try {
            FileWriter fw = new FileWriter("zapis.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.valueOf(x));
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("blad zapisu");
        }
    }

    public void zapiszLong(long x) {
        try {
            FileWriter fw = new FileWriter("zapis.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.valueOf(x));
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("blad zapisu");
        }
    }

    public void zapiszShort(short x) {
        try {
            FileWriter fw = new FileWriter("zapis.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.valueOf(x));
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("blad zapisu");
        }
    }

    public void zapiszChar(char x) {
        try {
            FileWriter fw = new FileWriter("zapis.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.valueOf(x));
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("blad zapisu");
        }
    }

    public void odczyt(String x)  {
        try {
            File fr = new File(x);
            Scanner in = new Scanner(fr);

            String tekst = in.nextLine();
            System.out.println(tekst);
            
        } catch (FileNotFoundException e) {
            System.out.println("nie znaleziono pliku");
        }

    }

}
