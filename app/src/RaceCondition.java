import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Robert Burek
 */
public class RaceCondition {

    public static long jakisTime, startTime, stopTime;

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(100);

        Counter counter = new Counter();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; ++i) {
            if (i == 1) startTime = System.currentTimeMillis();
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    counter.increase();
                    System.out.println(counter.getCount() + " na wątku " + Thread.currentThread().getName());
                }
            });
            if (i == 9999) stopTime = System.currentTimeMillis();
        }
        executor.shutdown();
        jakisTime = System.currentTimeMillis();
        System.out.println("Ten wątek " + Thread.currentThread().getName() + " trwał: " + (jakisTime - startTime) / 1000 + " s");
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter.getCount());
        System.out.println("Czas trwania: " + (jakisTime - startTime) + " ms");
        System.out.println("Czas trwania: " + (stopTime - startTime) + " ms");
    }

}

class Counter {

    private AtomicInteger count = new AtomicInteger(0);

    //synchronized
    public void increase() {
        System.out.println("coś tam 1");
        System.out.println("coś tam 2");
        count.getAndIncrement();
      //  synchronized (this) {
         //   count = count + 1;
       // }
        System.out.println("coś tam 3");
    }

    public int getCount() {
        return count.get();
    }
}