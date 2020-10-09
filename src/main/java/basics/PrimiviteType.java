package basics;

public class PrimiviteType {

    public static void main(String[] args) {
        int i = 5;
        System.out.println("Before :: " + i);
        i = change(i);
        System.out.println("After :: " + i);

    }

    //
    private static int change(int a) {
        //
        return a++; //a=a+1
    }

}
