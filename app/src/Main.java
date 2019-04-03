import java.time.LocalTime;
import java.util.concurrent.*;

/**
 * Created by Robert Burek
 */
public class Main {

    public static long jakisTime, startTime, stopTime;

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


//--------------------------------------------------------------------------------------------------------------------

//---------------------------------------EXECUTOR WĄTKÓW Callable-----------------------------------------------------
//------------------------------------- kolejka wątków za pomocą Callable ------ScheduledExecutor--------------------
        // wątke zwraca wartość do wykorzystania opóźniej po objekcie klasy Future
        // callabe wstrzymuje realizację na innych wątkach aż sam nie skończy pracy.
        // chyba że użyjemy while (!result.isDone()) {} gdzie w pętli wykonamy coś równolegle do wątku callable.
        // tyle że jeżeli w pętli zapuścimy wątek to on się zapętla i wykonuje cały czas nawet po otrzymaniu future
        // poza tym zapętla się na obu wykorzystywanych wątkach.
        // gdy wykonamy coś na main wątku to działa OK.

//        System.out.println("Główny wątek 1 aplikacji : " + Thread.currentThread().getName());
//
//        ExecutorService executor = Executors.newFixedThreadPool(2);
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
//        Runnable worker2 = new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    System.out.println("Robotnik 2 - Aktualny wątek o nazwie: " + Thread.currentThread().getName());
//                    System.out.println("Ładuję zapas pożywienia na wątku: " + Thread.currentThread().getName());
//                    TimeUnit.SECONDS.sleep(5);
//                    System.out.println("Załadowałem żywność na wątku: " + Thread.currentThread().getName());
//                } catch (InterruptedException e) {
//                    System.out.println("Tutaj przerywa działanie shutdownNow");
//                    e.printStackTrace();
//                }
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
//        //        Callable<Integer> answerToEverything = new Callable<Integer>() {
////            @Override
////            public Integer call() throws Exception {
////                TimeUnit.SECONDS.sleep(10);
////                return 45;
////            }
////        };    poniżej to samo ale z lambdą
//
//        Callable<Integer> answerToEverything = () -> {
//            System.out.println("Cekam 10 sek i zwracam integer 45 (callable) na wątku :" + Thread.currentThread().getName());
//            TimeUnit.SECONDS.sleep(2);
//            System.out.println("Zrobione!!! wątek : " + Thread.currentThread().getName());
//            return 45;
//        };
//
//        Callable<Integer> callable2 = () -> {
//            System.out.println("Cekam 2 sek i zwracam integer 55 (callable2) na wątku :" + Thread.currentThread().getName());
//            TimeUnit.SECONDS.sleep(8);
//            System.out.println("Zrobione!!! wątek : " + Thread.currentThread().getName());
//            return 55;
//        };
//
//        Future<Integer> result = executor.submit(answerToEverything);
//        Future<Integer> result2 = executor.submit(callable2);
//
//        while (!result.isDone()) {
//            System.out.println("Czekam na dane 1");
//            TimeUnit.SECONDS.sleep(1);
//        }
//
//        //executor.submit(worker1);
//        Integer przekazana = result.get();
//        System.out.println("Zwrócona wartość z wątku callable wynisi: " + przekazana);
//        Integer przekazana2 = null;
//        try {
//            przekazana2 = result2.get(4, TimeUnit.SECONDS);
//        } catch (TimeoutException e) {
//            System.out.println("Zabrakło czasu na odebranie danej przekazywana2");
//            e.printStackTrace();
//        }
//        System.out.println("Zwrócona wartość z wątku callable2 wynisi: " + przekazana2);
//
//        executor.shutdown();
//        //  executor.shutdownNow();  //kończy natychmiast wszystko poprzez wyjatek "InterruptedException"
//
//    }


//--------------------------------------------------------------------------------------------------------------------

//---------------------------------------EXECUTOR WĄTKÓW Callable-----------------------------------------------------
//------------------------------------- kolejka wątków za pomocą Callable ------ExecutorSERVICE--------------------
        // wątke zwraca wartość do wykorzystania opóźniej po objekcie klasy Future
        // callabe wstrzymuje realizację na innych wątkach aż sam nie skończy pracy.
        // używamy invokeAll poprzez listę<Callable<E>> tworzymy asList dodając wszystkie callable natępnie
        // Listę<Future><E> = executor.invokeAll
        // w ten sposób otrzymujemy jednocześnie wszystkie zwracane wartości po czasie wykonania najdłuższego wątku
        // przy metodzie invokeAny zwracana jest wartość wątku najszybciej wykonanaego. Nie wiadomo jak dostać się do
        // pozostałych przekazywanych danych

//        long startTime = System.currentTimeMillis();
//        LocalTime start = LocalTime.now();
//        System.out.println(start);
//        System.out.println("Główny wątek 1 aplikacji : " + Thread.currentThread().getName());
//
//        ExecutorService executor = Executors.newFixedThreadPool(5);
//
//
//        //        Callable<Integer> answerToEverything = new Callable<Integer>() {
////            @Override
////            public Integer call() throws Exception {
////                TimeUnit.SECONDS.sleep(10);
////                return 45;
////            }
////        };    poniżej to samo ale z lambdą
//
//        Callable<LocalTime> Start = () -> {
//            LocalTime start1 = LocalTime.now();
//            System.out.println(start1);
//            System.out.println("Cekam 10 sek i zwracam integer 45 (callable) na wątku :" + Thread.currentThread().getName());
//            TimeUnit.SECONDS.sleep(10);
//            System.out.println("Zrobione!!! wątek : " + Thread.currentThread().getName());
//            return start1;
//        };
//
//        Callable<Integer> answerToEverything = () -> {
//            System.out.println("Cekam 10 sek i zwracam integer 45 (callable) na wątku :" + Thread.currentThread().getName());
//            TimeUnit.SECONDS.sleep(10);
//            System.out.println("Zrobione!!! wątek : " + Thread.currentThread().getName());
//            return 45;
//        };
//
//        Callable<Integer> anoterAnswerToEverything = () -> {
//            System.out.println("Cekam 13 sek i zwracam integer 55 (callable2) na wątku :" + Thread.currentThread().getName());
//            TimeUnit.SECONDS.sleep(13);
//            System.out.println("Zrobione!!! wątek : " + Thread.currentThread().getName());
//            return 55;
//        };
//
//        Callable<Integer> finalAnswerToEverything = () -> {
//            System.out.println("Cekam 5 sek i zwracam integer 65 (callable2) na wątku :" + Thread.currentThread().getName());
//            TimeUnit.SECONDS.sleep(5);
//            System.out.println("Zrobione!!! wątek : " + Thread.currentThread().getName());
//            return 65;
//        };
///*  //invokeAll
//        List<Callable<Integer>> callableList = Arrays.asList(answerToEverything,
//                anoterAnswerToEverything,
//                finalAnswerToEverything);
//        List<Future<Integer>> futures = executor.invokeAll(callableList);
//        for (Future<Integer> f : futures) {
//            System.out.println(f.get());
//        }
//*/   //invokeAny
//
//        List<Callable<Integer>> callableList = Arrays.asList(answerToEverything,
//                anoterAnswerToEverything,
//                finalAnswerToEverything);
//
//        Integer result = executor.invokeAny(callableList);
//
//        System.out.println(result);
//
//
//
//
///*  //tradycyjny sposób 13 s
//        Future r1 = executor.submit(answerToEverything);
//        Future r2 = executor.submit(anoterAnswerToEverything);
//        Future r3 = executor.submit(finalAnswerToEverything);
//        System.out.println(r1.get());
//        System.out.println(r2.get());
//        System.out.println(r3.get());
//*/
//
//        long stopTime = System.currentTimeMillis();
//        System.out.println("Czas wykonania: " + ((stopTime - startTime) / 1000) + "s");
//        executor.shutdown();
//        //  executor.shutdownNow();  //kończy natychmiast wszystko poprzez wyjatek "InterruptedException"
//
//    }


//-------------------------------------------------------------------------------------------------------------------

//---------------------------------------EXECUTOR WĄTKÓW CompletableFuture.runAsync  i  supplyAsync--------------------
//------------------------------------- dodatkowo przez lub nie ------ExecutorSERVICE--------------------
        // supplyAsync  przerywa działanie trwających wątków, przekazuje dne i koniec, chyba że przepuścimy go przez
        // executora, wtedy wszystkie wątki dobiegają do końca. (ciekawe)
        //
        //
        //
        //
        //
//
//        long startTime = System.currentTimeMillis();
//        LocalTime start = LocalTime.now();
//        System.out.println(start);
//        System.out.println("Główny wątek aplikacji  --> " + Thread.currentThread().getName());
//
//           ExecutorService executor = Executors.newFixedThreadPool(5);
//
////        Runnable runnable = new Runnable() {
////            @Override
////            public void run() {
////                // treść kodu do wykonania
////            }
////        };   pełna deklaracja Runnable
//
////        Runnable runnable = () -> {
////            // treść kodu do wykonania
////        };   wersja Runnable przez lambde
//
////        CompletableFuture.runAsync(runnable);
////        deklaracja pełna
////        poniżej skrócona deklaracja przez lambde
//
//        CompletableFuture.runAsync(() -> {
//                    System.out.println("Wykonanie runAsync w wątku: " + Thread.currentThread().getName());
//                    try {
//                        TimeUnit.SECONDS.sleep(2);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("Zrobiłem wszystko w runAsync wątku: " + Thread.currentThread().getName());
//                },executor
//        );
//
//        CompletableFuture<String> przekazane = CompletableFuture.supplyAsync(() -> {
//               System.out.println("Wykonanie supplyAsync w wątku: " + Thread.currentThread().getName());
//            try {
//                TimeUnit.SECONDS.sleep(5);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//               System.out.println("Zrobiłem wszystko supplyAsync w wątku: " + Thread.currentThread().getName());
//            return "Skończyłem";
//        },executor);
//
//        System.out.println(przekazane.get());
//
//
//        CompletableFuture.runAsync(() -> {
//                    System.out.println("Wykonanie runAsync2 w wątku: " + Thread.currentThread().getName());
//                    try {
//                        TimeUnit.SECONDS.sleep(13);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("Zrobiłem wszystko w runAsync2 wątku: " + Thread.currentThread().getName());
//                },executor
//        );
//
//        CompletableFuture<String> przekazane2 = CompletableFuture.supplyAsync(() -> {
//            System.out.println("Wykonanie supplyAsync w wątku: " + Thread.currentThread().getName());
//            try {
//                TimeUnit.SECONDS.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Zrobiłem wszystko supplyAsync w wątku: " + Thread.currentThread().getName());
//            return "Skończyłem2";
//        },executor);
//
//        System.out.println(przekazane2.get());
//
//
////   Pełny zapis CompletableFuture.supplyAsync:
////        CompletableFuture<String> przekazane = CompletableFuture.supplyAsync(new Supplier<String>() {
////            @Override
////            public String get() {
////             //   System.out.println("Wykonanie supplyAsync w wątku: " + Thread.currentThread().getName());
////                try {
////                    TimeUnit.SECONDS.sleep(5);
////                } catch (InterruptedException e) {
////                    System.out.println("to tu?");
////                    e.printStackTrace();
////                }
////             //   System.out.println("Zrobiłem wszystko supplyAsync w wątku: " + Thread.currentThread().getName());
////                return "Skończyłem";
////            }
////        });
//
//
//
////        Callable<Integer> answerToEverything = () -> {
////            System.out.println("Czekam 10 sek i zwracam integer 45 (callable) na wątku :" + Thread.currentThread().getName());
////            TimeUnit.SECONDS.sleep(10);
////            System.out.println("Zrobione!!! wątek : " + Thread.currentThread().getName());
////            return 45;
////        };
////
////        Future r1 = executor.submit(answerToEverything);
////        System.out.println(r1.get());
//
////
////        Callable<Integer> anoterAnswerToEverything = () -> {
////            System.out.println("Czekam 13 sek i zwracam integer 55 (callable2) na wątku :" + Thread.currentThread()
////            .getName());
////            TimeUnit.SECONDS.sleep(13);
////            System.out.println("Zrobione!!! wątek : " + Thread.currentThread().getName());
////            return 55;
////        };
////
////        Callable<Integer> finalAnswerToEverything = () -> {
////            System.out.println("Czekam 5 sek i zwracam integer 65 (callable2) na wątku :" + Thread.currentThread()
////            .getName());
////            TimeUnit.SECONDS.sleep(5);
////            System.out.println("Zrobione!!! wątek : " + Thread.currentThread().getName());
////            return 65;
////        };
///*  //invokeAll
//        List<Callable<Integer>> callableList = Arrays.asList(answerToEverything,
//                anoterAnswerToEverything,
//                finalAnswerToEverything);
//        List<Future<Integer>> futures = executor.invokeAll(callableList);
//        for (Future<Integer> f : futures) {
//            System.out.println(f.get());
//        }
//*/   //invokeAny
//
////        List<Callable<Integer>> callableList = Arrays.asList(answerToEverything,
////                anoterAnswerToEverything,
////                finalAnswerToEverything);
////
////        Integer result = executor.invokeAny(callableList);
////
////        System.out.println(result);
//
//
//
//
///*  //tradycyjny sposób 13 s
//        Future r1 = executor.submit(answerToEverything);
//        Future r2 = executor.submit(anoterAnswerToEverything);
//        Future r3 = executor.submit(finalAnswerToEverything);
//        System.out.println(r1.get());
//        System.out.println(r2.get());
//        System.out.println(r3.get());
//*/
//
//
//        executor.shutdown();
//        long stopTime = System.currentTimeMillis();
//        System.out.println("Czas wykonania: " + ((stopTime - startTime) / 1000) + " s  --> " + Thread.currentThread().getName());
//
//        //  executor.shutdownNow();  //kończy natychmiast wszystko poprzez wyjatek "InterruptedException"
//
//    }


//-------------------------------------------------------------------------------------------------------------------

//---------------------------------------EXECUTOR WĄTKÓW CompletableFuture.runAsync  i  supplyAsync--------------------
//------------------------------------- kolejka wątków za pomocą Callable ------ExecutorSERVICE--------------------
        // wywołanie łańcuchowe. get nie będzie blokowało wątków?
        // then.Apply pozwala wykonać operacje na przekazywanych danych w starym wątku.
        // then.Accept pozwala wykonać operacje końcowe na przekazywanych danych w starym wątku.
        // executor zamyka wątki. Główny wątek robi swoje bez zatrzymań.

        startTime = System.currentTimeMillis();
        LocalTime start = LocalTime.now();
        System.out.println(start);
        System.out.println("Główny wątek aplikacji  --> " + Thread.currentThread().getName());

        ExecutorService executor = Executors.newFixedThreadPool(5);

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                // treść kodu do wykonania
//            }
//        };   pełna deklaracja Runnable

//        Runnable runnable = () -> {
//            // treść kodu do wykonania
//        };   wersja Runnable przez lambde

//        CompletableFuture.runAsync(runnable);
//        deklaracja pełna
//        poniżej skrócona deklaracja przez lambde

        CompletableFuture.runAsync(() -> {
                    System.out.println("Wykonanie runAsync w wątku: " + Thread.currentThread().getName());
                    try {
                        TimeUnit.SECONDS.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Zrobiłem wszystko w runAsync wątku: " + Thread.currentThread().getName());
                }, executor
        ).thenAccept(s -> {
            jakisTime = System.currentTimeMillis();
            System.out.println("Ten wątek " + Thread.currentThread().getName() + " trwał: " + (jakisTime - startTime) / 1000 + " s");
        });

        // CompletableFuture<String> przekazane = //enter
        CompletableFuture.supplyAsync(() -> {
            System.out.println("Wykonanie supplyAsync w wątku: " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Zrobiłem wszystko supplyAsync w wątku: " + Thread.currentThread().getName());
            return "Skończyłem";
        }, executor)
                .thenApply(s -> {
                            s = s.replace("S", "Wy");
                            //System.out.println(s + " --> " + Thread.currentThread().getName());
                            return s;
                        }
                ).thenAccept(s -> {
            System.out.println(s + " --> " + Thread.currentThread().getName());
            jakisTime = System.currentTimeMillis();
            System.out.println("Ten wątek " + Thread.currentThread().getName() + " trwał: " + (jakisTime - startTime) / 1000 + " s");
        });

        // String wynik = przekazane.get();

        // System.out.println(wynik + " --> " + Thread.currentThread().getName());


//   Pełny zapis CompletableFuture.supplyAsync:
//        CompletableFuture<String> przekazane = CompletableFuture.supplyAsync(new Supplier<String>() {
//            @Override
//            public String get() {
//             //   System.out.println("Wykonanie supplyAsync w wątku: " + Thread.currentThread().getName());
//                try {
//                    TimeUnit.SECONDS.sleep(5);
//                } catch (InterruptedException e) {
//                    System.out.println("to tu?");
//                    e.printStackTrace();
//                }
//             //   System.out.println("Zrobiłem wszystko supplyAsync w wątku: " + Thread.currentThread().getName());
//                return "Skończyłem";
//            }
//        });

        executor.shutdown();

        stopTime = System.currentTimeMillis();
        System.out.println("Czas wykonania wątku głównego: " + ((stopTime - startTime) / 1000) + " s  --> " + Thread.currentThread().getName());

        //  executor.shutdownNow();  //kończy natychmiast wszystko poprzez wyjatek "InterruptedException"

    }

}
