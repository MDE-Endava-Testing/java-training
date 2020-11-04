package lessons.lambda;

import lessons.lambda.saminterfaces.SingleStringOperations;
import lessons.lambda.saminterfaces.StringOperations;
import lessons.lambda.saminterfaces.booleanOperations;
import lessons.lambda.saminterfaces.intOperations;

import java.util.Objects;

public class MethodReferences {


    public static void main(String[] args) {
        SingleStringOperations upper = String::toUpperCase;
        SingleStringOperations lower = String::toLowerCase;

        StringOperations concat = String::concat;

        System.out.println(upper.accept("UPPER"));
        System.out.println(lower.accept("lower"));
        System.out.println(concat.accept("tog","ether"));
        booleanOperations nullable = Objects::isNull;

        //indirect examples
        String a = "a";
        intOperations compareToIgnore = a::compareToIgnoreCase;
        StringOperations replaceAll = a::replaceAll;

        booleanOperations equal = a::equals;

    }

}
