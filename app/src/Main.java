import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created by Robert Burek
 */
public class Main {


    public static void main(String[] args) {

        System.out.println("Główny wątek aplikacji : " + Thread.currentThread().getName());
        Thread thread = new MyThread("My-Tread-1");
        thread.start();
//        Thread secondthread = new MyThread("My-Tread-2");
//        secondthread.start();
//        Runnable runnable = new MyRunnable();
//        lub w taki sposób
        /* zamiast tego --- >  lambda
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Wykonywany wątek (runnable) - " + Thread.currentThread().getName());
            }
        };
        */

        Runnable runnable = () -> {
            try {
                System.out.println("Wykonywany wątek (runnable) - " + Thread.currentThread().getName());
                for (int i = 1; i <= 10; ++i) {
                    System.out.println(i);
                //    Thread.sleep(1000); // Zamiaste tego to poniżej
                    TimeUnit.SECONDS.sleep(1);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread anotherTread = new Thread(runnable, "My-Runnable-1");
        anotherTread.start();
    }

}
