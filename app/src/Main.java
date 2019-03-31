import java.awt.*;
import java.util.Scanner;

/**
 * Created by Robert Burek
 */
public class Main {
    public static void main(String[] args){

        Thread thread = new MyThtead("My-Tread-1");
        thread.start();

        System.out.println("Główny wątek aplikacji : " + Thread.currentThread().getName());
        System.out.println("Cześć Robercie!!!");

//        while (true){
//            System.out.print("Podaj liczbę do obliczenia pierwiastka:  ");
//            Scanner scanner = new Scanner((System.in));
//            int liczba = scanner.nextInt();
//            System.out.println("Pierwiastek z tej liczby to: " + Math.sqrt((double)liczba));
//        }
    }
}
