package lessons.basics;

import java.util.Arrays;

public class ReferenceType {

//    private static int[] b= new int[]{3, 2, 1};

    public static void main(String[] args) {

        //abc123
        int[] arr = new int[]{1, 2, 3};
//        System.out.println("Before :: " +Arrays.toString(arr));
//        change(arr);
//        System.out.println("After :: " +Arrays.toString(arr));
//
//        changeWitNewRef();
//        System.out.println("b :: " +Arrays.toString(b));

//        System.out.println("Before :: " +Arrays.toString(arr));
//        changeWitNewRef();
//        System.out.println("After :: " +Arrays.toString(arr));


        predict(arr);
        totalSale(arr);

    }

    private static void change (int[] a ){
        a[0]++;
        a[1]++;
    }

//    private static void changeWitNewRef (){
//        //def34
//        b[0]++;
//        b[1]++;
//
//    }

    //abc123
    private static void predict(int[] a) {
        //def23
        a = Arrays.copyOf(a, a.length);
        a[0]++;
        a[1]++;
        System.out.println("Prediction for next month :: " + (a[0] + a[1] + a[2])+ " "+ Arrays.toString(a));
    }

    //abc123
    private static void totalSale(int[] a) {
        //abc123
        System.out.println("Total Sale for this month :: " + (a[0] + a[1] + a[2])+ " "+ Arrays.toString(a));
    }

}
