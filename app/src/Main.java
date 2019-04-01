import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Robert Burek
 */
public class Main {

    public static int[] sortArray2(final int[] array) {

        // Sort the odd numbers only
        final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();

        // Then merge them back into original array
        for (int j = 0, s = 0; j < array.length; j++) {
            if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
        }
        for (int i = 0; i< array.length; ++i)
            System.out.print("  "+ array[i]);
        return array;
    }


    public static int[] sortArray(int[] array) {
        boolean posortowane = false;
        int[] nieparzyste = new int[array.length];
        int[] key= new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; ++i){
            key[i]=-1;
            if (array[i]%2!=0) {
                nieparzyste[j]=array[i];
                key[j]=i;
                ++j;
            }}
             do {
                    posortowane = false;
                    for (int i = 1; i < nieparzyste.length; i++){
                        if (key[i]!=-1){
                    if (nieparzyste[i-1] > nieparzyste[i]) {
                        int pomocnicza = nieparzyste[i-1];
                        nieparzyste[i-1] = nieparzyste[i];
                        nieparzyste[i] = pomocnicza;
                        posortowane = true;
                    }}
                }}while (posortowane);
        for (int i = 0; i < array.length; ++i){
            if (key[i]!=-1)
            array[key[i]]=nieparzyste[i];
            }
        return array;
    }



    public static void main(String[] args){

            sortArray(new int[]{ 5, 3, 2, 8, 1, 4 });
            sortArray2(new int[]{ 5, 3, 2, 8, 1, 4 });

            System.out.println("");
/*

        System.out.println("Główny wątek aplikacji : " + Thread.currentThread().getName());

        Thread thread = new MyThread("My-Tread-1");
//        Thread secondthread = new MyThread("My-Tread-2");
        thread.start();
//        secondthread.start();

//        Runnable runnable = new MyRunnable();
//        lub w taki sposób

        /* zamiast tego lambda
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
