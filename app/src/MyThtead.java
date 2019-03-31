import java.util.stream.IntStream;

/**
 * Created by Robert Burek
 */
public class MyThtead extends Thread{

    public MyThtead(String name) {
        super(name);
    }

    @Override
    public void run(){
        IntStream.rangeClosed(1,20).forEach( i -> System.out.println(i + " | wątek - " + Thread.currentThread().getName()));

    }
}
