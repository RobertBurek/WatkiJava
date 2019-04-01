/**
 * Created by Robert Burek
 */
public class Main {


    public static void main(String[] args) {

        System.out.println("Główny wątek aplikacji : " + Thread.currentThread().getName());

        Thread thread = new MyThread("My-Tread-1");
//        Thread secondthread = new MyThread("My-Tread-2");
        thread.start();
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

        Thread anotherTread = new Thread(/*runnable*/
                ()-> System.out.println("Wykonywany wątek (runnable) - " + Thread.currentThread().getName()),
                "My-Runnable-1");

        anotherTread.start();

    }

}
