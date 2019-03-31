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
        System.out.println("Część kodu wykonywana w innym wątku.");
        System.out.println("Nazwa tego wątku : " + Thread.currentThread().getName());
        IntStream.rangeClosed(1,20).forEach(System.out::println);

    }
}
