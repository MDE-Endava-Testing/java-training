package algorithms;

public class DigitsProduct {

    public static void main(String[] args) {
        System.out.println(digitsProduct(450));
    }

    static int digitsProduct(int product) {
        int number = product;
        int count = 0;
        int result = 0;
        if (product == 0) return 10;
        if (product < 10) return product;
        for (int i = 9; i > 1; i--) {
            if (product % i == 0) {
                product = product / i;
                result = (int) (result + (i * Math.pow(10, count)));
                i++;
                count++;
            }
        }
        return number > result ? -1 : result;
    }
}
