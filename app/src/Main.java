import java.awt.*;
import java.util.Scanner;

/**
 * Created by Robert Burek
 */
public class Main {
    public static void main(String[] args){

        Thread thread = new MyThtead("My-Tread-1");
        Thread secondthread = new MyThtead("My-Tread-2");
        thread.start();
        secondthread.start();

        System.out.println("Główny wątek aplikacji : " + Thread.currentThread().getName());
        System.out.println("Cześć Robercie!!!");

    }
}
