package homeworks.daniel.SixthAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 *  Calculator class , containing the four basic operations and a calculate method to apply them
 */
public class Calculator {

    private  Map<Character,BiFunction<Double,Double,Double>> mathOps = new HashMap<>();
     {
        mathOps.put('+', (a, b)->a+b);
        mathOps.put('-', (a, b)->a-b);
        mathOps.put('*', (a, b)->a*b);
        mathOps.put('/', (a, b)->a/b);
    }

    private String mathOpsRegex="+-/*";

    /**
     * The method receives the numbers a operations between them and returns the resulting value
     * @param instructions String containing the numbers a respective operation between them
     * @return total value resulting from the calculation process , returns a 0 if the input expression is not valid
     */
    public double calculate(String instructions){

        instructions = instructions.replaceAll("\\s","").trim();
        if (!instructions.matches(String.format("(\\d[%s]|\\d)*\\d$",mathOpsRegex) )){
            System.out.println("Invalid Expression");
            return 0;
        }

        String mathSigns = instructions.replaceAll("\\d","");
        String[] numbers = instructions.split(String.format("[%s]",mathOpsRegex));
        double total = Double.parseDouble(numbers[0]);

        for (int i=0;i<mathSigns.length();i++){
            total = mathOps.get(mathSigns.charAt(i)).apply(total,Double.parseDouble(numbers[i+1]));
        }
        return total;
    }

    /**
     * Adds new operations to the calculator
     * @param OpChar Char value representing the operation
     * @param OpImplementation  Operation implementation using a BiFunction to operate two inputs and receive one result
     */
    public void addNewOp(char OpChar,BiFunction<Double,Double,Double> OpImplementation){
        mathOps.put(OpChar,OpImplementation);
        mathOpsRegex=mathOpsRegex+OpChar;
    }
}
