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

    }
}
