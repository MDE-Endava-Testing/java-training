package lessons.algorithms;

public class AsciiConverter {

    public static void main(String[] args) {
        AsciiConverter asciiConverter = new AsciiConverter();
        int num[] = {65, 120, 98, 75, 115};
        asciiConverter.asciiToString(num);
        System.out.println();
        char chars[] = {'p','u','z','z','z','l','e'};
        asciiConverter.stringtoAscii(chars);
    }
    private void asciiToString(int num[]) {
        String str = null;
        for (int i : num) {
            str = Character.toString((char) i);
            System.out.print(str);
        }
    }
    private void stringtoAscii(char chars[]) {
        int number;
        for (char c : chars) {
            number = (int) c;
            System.out.print(number+" ");
        }
    }
}
