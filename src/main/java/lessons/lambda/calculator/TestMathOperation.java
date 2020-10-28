package lessons.lambda.calculator;

public class TestMathOperation {

//   public static void main(String[] args) {
//
//        MathOperation add = (doug, las) -> doug + las;
//        MathOperation substract = (a, b) -> a - b;
//        MathOperation multiply = (a, b) -> a * b;
//        MathOperation divide = (a, b) -> a / b;
//
//        System.out.println(calculate(add));
//        System.out.println(calculate(substract));
//        System.out.println(calculate(multiply));
//        System.out.println(calculate(divide));
//    }
//
//    private static int calculate(MathOperation mathOperation) {
//        int a = 100;
//        int b = 5;
//        return mathOperation.operate(a, b);
//    }


//Example #2
//    public static void main(String[] args) {
//        System.out.println(add().operate(5,6));
//
//        MathOperation substract = (a, b) -> a-b;
//        System.out.println(substract.operate(5,6));
//
//        MathOperation adding = add();
//        System.out.println(adding.operate(5,6));
//
//    }
//
//    public static MathOperation add(){
//        return (a, b) -> a+b;
//    }



        //Example #3
    public static void main(String[] args) {
        int firstNum= 100;
        int secondNum = 5;
        
        MathOperation add = (a, b) -> a + b;
        MathOperation substract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

        System.out.println(calculate(100, add, 25));
        System.out.println(calculate(firstNum, substract, 231321));
        System.out.println(calculate(firstNum, multiply, secondNum));
        System.out.println(calculate(firstNum, divide, secondNum));
    }

    private static int calculate(int firstNum, MathOperation mathOperation, int secondNum) {
        return mathOperation.operate(firstNum, secondNum);
    }


}
