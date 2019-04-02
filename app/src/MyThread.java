import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * Created by Robert Burek
 */
public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run(){
//        IntStream.rangeClosed(1,20).forEach( i ->
                System.out.println("Wykonany wątek (theard) : " + Thread.currentThread().getName());
// Zawartość kodu wykonywana w drugim wątku za pomocą klasy Thread
// tworzymy klasę MyThread dziedziczącej po Threrad i implemen tujemy metodę
// run. Gdzie umieszczamy kod wykonywany w tym wątku.
        for (int i = 1; i <= 10; ++i) {
            System.out.println(i + " na wątku:  " + Thread.currentThread().getName());
            //    Thread.sleep(1000); // Zamiaste tego to poniżej
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
