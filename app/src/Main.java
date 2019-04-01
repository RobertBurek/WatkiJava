import java.util.Arrays;


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


    abstract class Operation
    {
        double result;
        abstract void execute(double variable1, double variable2);
    }

    public class Add extends Operation{

        @Override
        void execute(double variable1, double variable2) {
            result = variable1 + variable2;
        }
    }



        public static int ConvertBinaryArrayToInt(int[] binary) {
            // Your Code
            int wynik = 0;
            for (int i = 0; i < binary.length; ++i) {
                wynik += Math.pow(2, (binary.length - 1 - i)) * binary[i];
            }
            return wynik;
        }

//        public static String[] wzory = new String[] {"001100","110011","011000","011110","011100","101100","111111",
//                "000110", "011111", "111110","000000"};
//        public static String[] lewy = new String[] {"111", "100"};
//        public static String[] prawy = new String[] {"111\n", "001\n"};
    //public static String[] liczba1 = new String[] {wzory[0],wzory[4],wzory[5],wzory[0],wzory[0],wzory[6]};
//    public static int[] liczba =new int[6];


//    public static int[] liczba0 = new int[] {94,115,115,115,115,94};
//    public static int[] liczba1 = new int[] {76,92,108,76,76,127};
//    public static int[] liczba2 = new int[] {94,115,70,76,88,127};
//    public static int[] liczba3 = new int[] {94,115,70,70,115,94};
//    public static int[] liczba4 = new int[] {115,115,115,95,67,67};
//    public static int[] liczba5 = new int[] {127,112,126,67,67,126};
//    public static int[] liczba6 = new int[] {70,76,94,115,115,94};
//    public static int[] liczba7 = new int[] {127,115,70,76,88,88};
//    public static int[] liczba8 = new int[] {94,115,94,94,115,94};
//    public static int[] liczba9 = new int[] {94,115,115,94,76,88};





    public static void main(String[] args) {

      //  sortArray(new int[]{5, 3, 2, 8, 1, 4});
      //  sortArray2(new int[]{5, 3, 2, 8, 1, 4});
//        int[] temp = new int[] {0, 0, 0, 0, 0, 0};
////        String nazwa;
//        System.out.println("");
//        //for (int i = 0; i < 6; ++i){
//        for (int i = 0; i < 6; ++i) {
//            napiszLiczba(liczba0, i, "&");System.out.print(" ");
//            napiszLiczba(liczba1, i, "&");System.out.print(" ");
//            napiszLiczba(liczba2, i, "&");System.out.print(" ");
//            napiszLiczba(liczba3, i, "&");System.out.print(" ");
//            napiszLiczba(liczba4, i, "&");System.out.print(" ");
//            napiszLiczba(liczba5, i, "&");System.out.print(" ");
//            napiszLiczba(liczba6, i, "&");System.out.print(" ");
//            napiszLiczba(liczba7, i, "&");System.out.print(" ");
//            napiszLiczba(liczba8, i, "&");System.out.print(" ");
//            napiszLiczba(liczba9, i, "&");System.out.print(" ");
//            System.out.println("");
//
//        }
//        System.out.println("");
//        System.out.println("");


        // System.out.println(liczba1[i]);
//            for (int i = (6 - nazwa.length()); i > 6; ++i)
//                temp[i]=nazwa[i];
         //   temp = (String)nazwa;

//        System.out.println(nazwa[3] + "  -  " + nazwa.length());
  //  }
//
//            System.out.println("");
////        System.out.println(Integer.toBinaryString(20));
////        System.out.println(Integer.toBinaryString(44));
//      //  System.out.println(nazwa + "  -  " + nazwa.length());
//     //   System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(0,0,0,1)));
//        System.out.println(ConvertBinaryArrayToInt(new int[]{ 1, 0, 1, 1, 0, 0, 0 }));

//        System.out.println("  XX  ");
//        System.out.println(" XXX  ");
//        System.out.println("X XX  ");
//        System.out.println("  XX  ");
//        System.out.println("  XX  ");
//        System.out.println("XXXXXX");



//        System.out.println("Główny wątek aplikacji : " + Thread.currentThread().getName());
//
//        Thread thread = new MyThread("My-Tread-1");
////        Thread secondthread = new MyThread("My-Tread-2");
//        thread.start();
////        secondthread.start();

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

//        Thread anotherTread = new Thread(/*runnable*/
//                ()-> System.out.println("Wykonywany wątek (runnable) - " + Thread.currentThread().getName()),
//                "My-Runnable-1");
//
//        anotherTread.start();


        System.out.print(wypiszObraz(65895, '@'));

    }

    public static int[][] liczby = new int[][]{
            {94,115,115,115,115,94}, // 94-> 1 0 1 1 1 1 0;  115-> 1 1 1 0 0 1 1;
            {76,92,108,76,76,127},   // 76-> 1 0 0 1 1 0 0;  127-> 1 1 1 1 1 1 1;
            {94,115,70,76,88,127},   // 94-> 1 0 1 1 1 1 0;
            {94,115,70,70,115,94},
            {115,115,115,95,67,67},  // 126-> 1 1 1 1 1 1 0;  88-> 1 0 1 1 0 0 0;
            {127,112,126,67,67,126}, // 112-> 1 1 1 0 0 0 0;  67-> 1 0 0 0 0 1 1;
            {70,76,94,115,115,94},
            {127,115,70,76,88,88},
            {94,115,94,94,115,94},
            {94,115,115,94,76,88}};
    public static String result = "";


    public static String napiszLiczba(int[] liczba, int nrLinii, char ch){
        String wynik = "";
        String temp = Integer.toBinaryString(liczba[nrLinii]);
        for (int z =1; z<7; ++z){
            if (temp.substring(z,z+1).equals("0")) wynik += " ";
            if (temp.substring(z,z+1).equals("1")) wynik += ch;
        }
        return wynik;
    }

    public static String wypiszObraz(int num, char ch) {
        String result = "";
        if ((1 <= num)&&(num < 99999)){
            for (int i = 1; i < 41; ++i) result += ch;
            result += "\n";
            result += ch;
            for (int i = 1; i < 39; ++i) result += " ";
            result += ch + "\n";
            String cyfra = String.valueOf(num);
            while (cyfra.length() < 5) cyfra="0"+cyfra;
            String temp = "";
            for (int i = 0; i < 6; ++i) {
                temp += ch + "  ";
                temp += napiszLiczba(liczby[Integer.valueOf(cyfra.substring(0,1))], i, ch);
                temp += " ";
                temp += napiszLiczba(liczby[Integer.valueOf(cyfra.substring(1,2))], i, ch);
                temp += " ";
                temp += napiszLiczba(liczby[Integer.valueOf(cyfra.substring(2,3))], i, ch);
                temp += " ";
                temp += napiszLiczba(liczby[Integer.valueOf(cyfra.substring(3,4))], i, ch);
                temp += " ";
                temp += napiszLiczba(liczby[Integer.valueOf(cyfra.substring(4,5))], i, ch);
                temp += " ";
                temp += " "+ch + "\n";
            }
            result += temp + ch;
            for (int i = 1; i < 39; ++i) result += " ";
            result += ch + "\n";
            for (int i = 1; i < 41; ++i) result += ch;
    }
    return result;
    }
}
