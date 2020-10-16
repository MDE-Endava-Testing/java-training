package lambda;

// SAM - single abstract method

@FunctionalInterface
public interface Authentication {

        void auth(String key);

}
