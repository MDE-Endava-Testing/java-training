package homeworks.daniel.thirdAssigment;

import java.util.List;
/**
 * Functional interface (SAM) helpful add numeric elements to a list using different implementations
 */
@FunctionalInterface
public interface NumberAdder {
    /**
     * The abstract method has
     * @param list an integer list which the values are going to be added to.
     * @return output list with integer values added.
     */
    List<Integer> addNumbers(List<Integer> list);
}
