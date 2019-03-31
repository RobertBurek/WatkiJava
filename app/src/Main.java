import java.awt.*;
import java.util.Scanner;

/**
 * Created by Robert Burek
 */
public class Main {
    public static void main(String[] args){

        System.out.println("Cześć Robercie!!!");

        while (true){
            System.out.print("Podaj liczbę do obliczenia pierwiastka:  ");
            Scanner scanner = new Scanner((System.in));
            int liczba = scanner.nextInt();
            System.out.println("Pierwiastek z tej liczby to: " + Math.sqrt((double)liczba));
        }
    }
}
