import java.util.ArrayList;

/**
 * Created by Robert Burek
 */
public class Main {

     public static String encode(String text, int shift){
        ArrayList lista = new ArrayList();
        final String ALFABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result = "";
        while (shift < 0) shift+=52;
        for (int i = 0; i < ALFABET.length(); ++i) lista.add(ALFABET.substring(i,i + 1));
        try {
            if (!text.isEmpty()) {
                for (int i = 0; i < text.length(); ++i) {
                    if (lista.indexOf(text.substring(i, i + 1)) != -1) {
                        result += lista.get((lista.indexOf(text.substring(i, i + 1)) + shift) % 52);
                    } else {
                        result += text.substring(i, i + 1);
                    }
                }
            } else result = "";
            if (result.trim().length() == 0) result = "";
        } catch (NullPointerException ex) {
           result = "";
        }
     return result;
    }



    public static void main(String[] args) {

        System.out.println(encode("To metoda szyfrująca tekst!!!", 12));


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
