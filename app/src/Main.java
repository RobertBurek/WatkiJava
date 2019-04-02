import java.util.ArrayList;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/**
 * Created by Robert Burek
 */
public class Main {


    public static void main(String[] args) throws InterruptedException {

        //1  System.out.println("Główny wątek aplikacji : " + Thread.currentThread().getName());
//        wykonywany w wątku głónym main
        // 1  Thread thread = new MyThread("My-Tread-1");
        //1  thread.start();

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
        //Brakuje procedury uruchomienia wątków
//------------------------------------------------------------------------------------------------------------------

        System.out.println("Główny wątek aplikacji : " + Thread.currentThread().getName());

        Runnable countdown = () -> {
            try {
                System.out.println("Wykonywany wątek (runnable) o nazwie: " + Thread.currentThread().getName());
                for (int i = 1; i <= 10; ++i) {
                    System.out.println(i + " wątek runnable wykonywany w : " + Thread.currentThread().getName());
                    //    Thread.sleep(1000); // Zamiaste tego to poniżej
                    TimeUnit.MILLISECONDS.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable blastOff = () -> {
            System.out.println("Wykonywany wątek (countdown) : " + Thread.currentThread().getName());
            System.out.println("Blast Off !!!");
        };

        Thread countdownThread = new Thread(countdown, "Countdown");


        Thread blastOffThread = new Thread(blastOff, "BlastOff");
        countdownThread.start();
        countdownThread.join(400);
        System.out.println("Główny wątek aplikacji cd : " + Thread.currentThread().getName());
        Thread.sleep(200);
        blastOffThread.start();
    }

}
