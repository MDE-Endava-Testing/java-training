package homeworks.juanpa.thirdAssigment;

import lessons.lambda.calculator.MathOperation;

public class functions {

    /**
     * To get random number between 0.0 and 1.0
     * it's an impure function because we can have different result in different executions
     * @return
     */
    private double impure(){
        return Math.random();
    }

    /**
     * To get a specific number doing an add
     * it's a pure function, we're expecting the same response each execution
     */
    private static MathOperation pure(){
        return (x, y) -> x+y;
    }
}
