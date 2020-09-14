package algorithms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class fileNaming {

    public static void main(String[] args) {

        System.out.println("fileNaming(names) = " +
                Arrays.toString(fileNamingChecker(new String[]{"doc", "doc", "image", "doc(1)", "doc"})));
    }

    //WIP
    static String[] fileNamingChecker(String[] names) {
        for (int i = 0; i < names.length; i++) {
            int finalI = i;
            int counter = 0;
            if (IntStream.range(0, i).filter(j -> names[finalI].equals(names[j])).findAny().isPresent()) {
                if (IntStream.range(0, i).filter(j -> (names[finalI] + "(1)").equals(names[j])).findAny().isPresent()) {
                    while (IntStream.range(0, i).filter(j -> (names[finalI] + "(" + j + ")").equals(names[j])).findAny().isPresent()) {
                        //System.out.println(i +" "+j +" "+counter);
                        counter++;
                    }
                    names[finalI]= names[finalI] +"(" + counter + ")";
                }
                else names[finalI]= names[finalI] +"(1)";
            }
        }
        return names;
    }

}
