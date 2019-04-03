import java.util.ArrayList;
import java.util.TreeMap;
import java.util.concurrent.*;

/**
 * Created by Robert Burek
 */
public class Main {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

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
        //
        // ------------------------------------------------------------------------------------
//------------------------Zatrzymywanie wątków metodą join -----------------------------------

//
//        System.out.println("Główny wątek aplikacji : " + Thread.currentThread().getName());
//
//        Runnable countdown = () -> {
//            try {
//                System.out.println("Wykonywany wątek (runnable) o nazwie: " + Thread.currentThread().getName());
//                for (int i = 1; i <= 10; ++i) {
//                    System.out.println(i + " wątek runnable wykonywany w : " + Thread.currentThread().getName());
//                    //    Thread.sleep(1000); // Zamiaste tego to poniżej
//                    TimeUnit.MILLISECONDS.sleep(100);
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        };
//
//        Runnable blastOff = () -> {
//            System.out.println("Wykonywany wątek (countdown) : " + Thread.currentThread().getName());
//            System.out.println("Blast Off !!!");
//        };
//
//        Thread countdownThread = new Thread(countdown, "Countdown");
//
//
//        Thread blastOffThread = new Thread(blastOff, "BlastOff");
//        countdownThread.start();
//        countdownThread.join(400);
//        System.out.println("Główny wątek aplikacji cd : " + Thread.currentThread().getName());
//        Thread.sleep(200);
//        blastOffThread.start();
//    }
//--------------------------------------------------------------------------------------------------------------------
//
//---------------------------------------EXECUTOR WĄTKÓW -----------------------------------------------------------
//------------------------------------- kolejka wątków za pomocą newSingleThreadExecutors ------------------------

//        System.out.println("Główny wątek aplikacji : " + Thread.currentThread().getName());
//
//        ExecutorService executor = Executors.newSingleThreadExecutor();
//
//        Runnable countdown = () -> {
//            try {
//                System.out.println("Wykonywany wątek (runnable) o nazwie: " + Thread.currentThread().getName());
//                for (int i = 1; i <= 10; ++i) {
//                    System.out.println(i + " wątek runnable wykonywany w : " + Thread.currentThread().getName());
//                    //    Thread.sleep(1000); // Zamiaste tego to poniżej
//                    TimeUnit.MILLISECONDS.sleep(100);
//                }
//            } catch (InterruptedException e) {
//                System.out.println("Tutaj przerywa działanie shutdownNow");
//                e.printStackTrace();
//            }
//        };
//
//        Runnable blastOff = () -> {
//            System.out.println("Wykonywany wątek (countdown) : " + Thread.currentThread().getName());
//            System.out.println("Blast Off !!!");
//        };
//
//        executor.submit(countdown);
//        executor.submit(blastOff);
//
//        executor.shutdown();
//      //  executor.shutdownNow();  //kończy natychmiast wszystko poprzez wyjatek "InterruptedException"
//
//
//    }

//-----------------------------------------------------------------------------------------------------------------

//---------------------------------------EXECUTOR WĄTKÓW -----------------------------------------------------------
//------------------------------------- kolejka wątków za pomocą newFixedThreadPool ------------------------
        // wątki wykonuję się w zadanej liczbie i jak się zwolni wątek to wchodzi nastepny.

//        System.out.println("Główny wątek 1 aplikacji : " + Thread.currentThread().getName());
//
//    ExecutorService executor = Executors.newFixedThreadPool(2);
//
//    Runnable worker1 = () -> {
//        try {
//            System.out.println("Robotnik 1 - Aktualny wątek o nazwie: " + Thread.currentThread().getName());
//            System.out.println("Ładuję butle z tlenem na wątku: " + Thread.currentThread().getName());
//                      TimeUnit.SECONDS.sleep(10);
//            System.out.println("Załadowałem butle z tlenem na wątku: " + Thread.currentThread().getName());
//        } catch (InterruptedException e) {
//            System.out.println("Tutaj przerywa działanie shutdownNow");
//            e.printStackTrace();
//        }
//    };
//
//        Runnable worker2 = () -> {
//            try {
//                System.out.println("Robotnik 2 - Aktualny wątek o nazwie: " + Thread.currentThread().getName());
//                System.out.println("Ładuję zapas pożywienia na wątku: " + Thread.currentThread().getName());
//                TimeUnit.SECONDS.sleep(5);
//                System.out.println("Załadowałem żywność na wątku: " + Thread.currentThread().getName());
//            } catch (InterruptedException e) {
//                System.out.println("Tutaj przerywa działanie shutdownNow");
//                e.printStackTrace();
//            }
//        };
//
//        Runnable worker3 = () -> {
//            try {
//                System.out.println("Robotnik 3 - Aktualny wątek o nazwie: " + Thread.currentThread().getName());
//                System.out.println("Ładuję zapas paliwa na wątku: " + Thread.currentThread().getName());
//                TimeUnit.SECONDS.sleep(3);
//                System.out.println("załadowałem paliwo na wątku: " + Thread.currentThread().getName());
//            } catch (InterruptedException e) {
//                System.out.println("Tutaj przerywa działanie shutdownNow");
//                e.printStackTrace();
//            }
//        };
//
//        executor.submit(worker1);
//        executor.submit(worker2);
//        System.out.println("Główny wątek 2 aplikacji : " + Thread.currentThread().getName());
//        executor.submit(worker3);
//        System.out.println("Główny wątek 3 aplikacji : " + Thread.currentThread().getName());
//
//        executor.shutdown();
//    //  executor.shutdownNow();  //kończy natychmiast wszystko poprzez wyjatek "InterruptedException"
//
//
//}

//-----------------------------------------------------------------------------------------------------------------

//---------------------------------------EXECUTOR WĄTKÓW -----------------------------------------------------------
//------------------------------------- kolejka wątków za pomocą newScheduledThreadPool ------ScheduledExecutorService-
        // wątki są wykonywane w zadanej ilości ale można je opóżniać lu zwielokratniać   klasa ScheduledExecutorService
//
//        System.out.println("Główny wątek 1 aplikacji : " + Thread.currentThread().getName());
//
//        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
//
//        Runnable worker1 = () -> {
//            try {
//                System.out.println("Robotnik 1 - Aktualny wątek o nazwie: " + Thread.currentThread().getName());
//                System.out.println("Ładuję butle z tlenem na wątku: " + Thread.currentThread().getName());
//                TimeUnit.SECONDS.sleep(10);
//                System.out.println("Załadowałem butle z tlenem na wątku: " + Thread.currentThread().getName());
//            } catch (InterruptedException e) {
//                System.out.println("Tutaj przerywa działanie shutdownNow");
//                e.printStackTrace();
//            }
//        };
//
//        Runnable worker2 = () -> {
//            try {
//                System.out.println("Robotnik 2 - Aktualny wątek o nazwie: " + Thread.currentThread().getName());
//                System.out.println("Ładuję zapas pożywienia na wątku: " + Thread.currentThread().getName());
//                TimeUnit.SECONDS.sleep(5);
//                System.out.println("Załadowałem żywność na wątku: " + Thread.currentThread().getName());
//            } catch (InterruptedException e) {
//                System.out.println("Tutaj przerywa działanie shutdownNow");
//                e.printStackTrace();
//            }
//        };
//
//        Runnable worker3 = () -> {
//            try {
//                System.out.println("Robotnik 3 - Aktualny wątek o nazwie: " + Thread.currentThread().getName());
//                System.out.println("Ładuję zapas paliwa na wątku: " + Thread.currentThread().getName());
//                TimeUnit.SECONDS.sleep(2);
//                System.out.println("załadowałem paliwo na wątku: " + Thread.currentThread().getName());
//            } catch (InterruptedException e) {
//                System.out.println("Tutaj przerywa działanie shutdownNow");
//                e.printStackTrace();
//            }
//        };
//
//        executor.scheduleAtFixedRate(worker1, 10, 1, TimeUnit.SECONDS);
//        System.out.println("Główny wątek 2 aplikacji : " + Thread.currentThread().getName());
//        executor.scheduleAtFixedRate(worker2, 0, 3, TimeUnit.SECONDS);
//        System.out.println("Główny wątek 3 aplikacji : " + Thread.currentThread().getName());
//        executor.scheduleAtFixedRate(worker3, 2, 6, TimeUnit.SECONDS);
//
//        //   executor.shutdown();
//        //  executor.shutdownNow();  //kończy natychmiast wszystko poprzez wyjatek "InterruptedException"
//
//
//    }


        //-----------------------------------------------------------------------------------------------------------------

//---------------------------------------EXECUTOR WĄTKÓW Callable-----------------------------------------------------
//------------------------------------- kolejka wątków za pomocą Callable ------ScheduledExecutor--------------------
        // wątke zwraca wartość do wykorzystania opóźniej po objekcie klasy Future
        // callabe wstrzymuje realizację na innych wątkach aż sam nie skończy pracy.
        // chyba że użyjemy while (!result.isDone()) {} gdzie w pętli wykonamy coś równolegle do wątku callable.
        // tyle że jeżeli w pętli zapuścimy wątek to on się zapętla i wykonuje cały czas nawet po otrzymaniu future
        // poza tym zapętla się na obu wykorzystywanych wątkach.
        // gdy wykonamy coś na main wątku to działa OK.

        System.out.println("Główny wątek 1 aplikacji : " + Thread.currentThread().getName());

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable worker1 = () -> {
            try {
                System.out.println("Robotnik 1 - Aktualny wątek o nazwie: " + Thread.currentThread().getName());
                System.out.println("Ładuję butle z tlenem na wątku: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(10);
                System.out.println("Załadowałem butle z tlenem na wątku: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println("Tutaj przerywa działanie shutdownNow");
                e.printStackTrace();
            }
        };

        Runnable worker2 = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Robotnik 2 - Aktualny wątek o nazwie: " + Thread.currentThread().getName());
                    System.out.println("Ładuję zapas pożywienia na wątku: " + Thread.currentThread().getName());
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println("Załadowałem żywność na wątku: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    System.out.println("Tutaj przerywa działanie shutdownNow");
                    e.printStackTrace();
                }
            }
        };

        Runnable worker3 = () -> {
            try {
                System.out.println("Robotnik 3 - Aktualny wątek o nazwie: " + Thread.currentThread().getName());
                System.out.println("Ładuję zapas paliwa na wątku: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(2);
                System.out.println("załadowałem paliwo na wątku: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println("Tutaj przerywa działanie shutdownNow");
                e.printStackTrace();
            }
        };

        //        Callable<Integer> answerToEverything = new Callable<Integer>() {
//            @Override
//            public Integer call() throws Exception {
//                TimeUnit.SECONDS.sleep(10);
//                return 45;
//            }
//        };    poniżej to samo ale z lambdą

        Callable<Integer> answerToEverything = () -> {
            System.out.println("Cekam 10 sek i zwracam integer 45 (callable) na wątku :" + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(10);
            System.out.println("Zrobione!!! wątek : " + Thread.currentThread().getName());
            return 45;
        };

        Callable<Integer> callable2 = () -> {
            System.out.println("Cekam 2 sek i zwracam integer 55 (callable2) na wątku :" + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Zrobione!!! wątek : " + Thread.currentThread().getName());
            return 55;
        };

        Future<Integer> result = executor.submit(answerToEverything);
        Future<Integer> result2 = executor.submit(callable2);

        while (!result.isDone()) {
            System.out.println("Czekam na dane 1");
            TimeUnit.SECONDS.sleep(1);
        }
        while (!result2.isDone()) {
            System.out.println("Czekam na dane 2");
            TimeUnit.SECONDS.sleep(1);
        }
        //executor.submit(worker1);
        Integer przekazana = result.get();
        System.out.println("Zwrócona wartość z wątku callable wynisi: " + przekazana);
        Integer przekazana2 = result2.get();
        System.out.println("Zwrócona wartość z wątku callable2 wynisi: " + przekazana2);

        executor.shutdown();
        //  executor.shutdownNow();  //kończy natychmiast wszystko poprzez wyjatek "InterruptedException"

    }


}
