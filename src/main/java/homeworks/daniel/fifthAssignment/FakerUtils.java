package homeworks.daniel.fifthAssignment;

import com.github.javafaker.Faker;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * lambda utils created to select and element or group of elements randomly from defined Lists
 */
public class FakerUtils {
    static Faker faker = new Faker();
    public static Map<String,List<String>> statesAndCities = new HashMap<>();
    static {
        statesAndCities.put("NCR", new ArrayList<>(Arrays.asList("Delhi","Gurgaon","Noida")));
        statesAndCities.put("Uttar Pradesh", new ArrayList<>(Arrays.asList("Agra","Lucknow","Merrut")));
        statesAndCities.put("Haryana", new ArrayList<>(Arrays.asList("Karnal","Panipat")));
        statesAndCities.put("Rajasthan", new ArrayList<>(Arrays.asList("Jaipur","Jaiselmer")));
    }
    public static List<String> subjectsList =
            new ArrayList<>(Arrays.asList("Maths"
                    ,"Chemistry"
                    ,"Computer Science"
                    ,"Commerce"
                    ,"Economics"));
    public static List<String> hobbiesList =
            new ArrayList<>(Arrays.asList("Sports"
                    ,"Reading"
                    ,"Music"));
    /**
     * Supplier that returns a random a random gender
     */
    static Supplier<String> genderSelector = ()->{
        int randNumber = faker.number().numberBetween(1,3);
        switch (randNumber){
            case 1:return "Female";
            case 2:return "Male";
            case 3:return "Other";
        }
        return "Other";
    };
    /**
     * Lambda function which receives a List containing Subjects or a List containing hobbies and returns some of them in a List
     */
     static Function<List<String>,List<String>> listSelector = (inputList)->{
         int randNumber=0;
         if (inputList.equals(subjectsList)){
             randNumber = faker.number().numberBetween(1,4);
         }
         if (inputList.equals(hobbiesList)){
             randNumber = faker.number().numberBetween(0,3);
         }
         List<String> selectedList = new ArrayList<>();
         selectedList.addAll(inputList);
         for (int i=randNumber;i>0;i--) {
             selectedList.remove(selectedList.get(faker.number().numberBetween(0,selectedList.size())));
         }
         return selectedList;
     };
    /**
     *
     */
    static Supplier<String> selectState = ()->{
        Set<String> states = statesAndCities.keySet();
        return (String) states.toArray()[faker.number().numberBetween(0,states.size())];
    };
    /**
     *
     */
    static Function<String,String> selectCity = (state)->{
        List<String> cities = statesAndCities.get(state);
        return cities.get(faker.number().numberBetween(0,cities.size()));
    };
}
