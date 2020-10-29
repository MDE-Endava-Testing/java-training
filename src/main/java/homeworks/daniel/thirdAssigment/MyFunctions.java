package homeworks.daniel.thirdAssigment;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of the SAM interface "NumberAdder" using pure and impure functions as the lambdas implementations
 */
public class MyFunctions {

    static List<Integer> numbers = new ArrayList<Integer>();

    /**
     * The main method will add the numbers:1,2 and 3 to the "numbers" list and then try to add the remaining numbers
     * to reach 10, so resulting list will contain all integer numbers from 1 to 10. This will done implementing
     * a pure and impure method to verify the side effects over the "numbers" list when functional programing is not applied.
     * @param args no arguments needed for execution
     */
    public static void main(String[] args) {
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        /**
         * Pure function implementation
         * As a pure function it doesn't depend on external elements and just uses its own entry parameters
         * also it doesn't modify any external elements, so a new reference, its created (pureList) to not affect
         * the existing reference of "numbers" list.
         */
        NumberAdder numberAdderPure = (list) -> {
            List<Integer> pureList = new ArrayList<>();
            pureList.addAll(list);
            for (int x=4;x<=10;x++){
                pureList.add(x);
            }
            return pureList;
        };
        /**
         * Impure function implementation
         * As an impure function , lambda implementation makes use of the external list "numbers".Also, the method
         * modifies the "numbers" list adding numbers to it and thus modifying the list for anything that may use it
         * finally the output list is the param variable which in this case ,has the same reference as the "numbers" list.
         */
        NumberAdder numberAdderImpure = (list) -> {
            for (int x=4;x<=10;x++){
                numbers.add(x);
            }
            return list;
        };

        numberAdderPure.addNumbers(numbers).forEach(x->{System.out.println("pureList "+x);});
        numberAdderImpure.addNumbers(numbers).forEach(x->{System.out.println("impureList "+x);});


    }

}
