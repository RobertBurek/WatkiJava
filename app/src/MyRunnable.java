/**
 * Created by Robert Burek
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Wykonywany wątek zapisany w osobnej klasie (runnable) : " + Thread.currentThread().getName());
        // Drugi wątek utworzony inną metodą. Zapomocą interfejsu Runnable.
//        Tworzymy klasę MyRunnable implementującą Runnable i mplementujemy metodę
//        run. W niej będzie kod wykonywany na innyhm wątki
    }
}
