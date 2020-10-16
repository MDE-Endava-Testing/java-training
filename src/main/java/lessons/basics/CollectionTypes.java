package lessons.basics;

import java.util.*;

public class CollectionTypes {

    public void listExamples() {
        //Initialization of lists:
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 5);

    }

    public void setExamples() {
        //Initialization of sets:
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        Set<Integer> set2 = new HashSet<>(list1);

        Collections.addAll(set2, 3, 4, 5, 6);
        Set<Integer> set3 = Collections.unmodifiableSet(set2);


    }

    public void mapExamples(){
        //Initialization of maps:
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1,"Alvaro");
        map1 = Collections.unmodifiableMap(map1);
        //map1.put(2,"jose");

        Map<Integer, String> map2 = Collections.emptyMap();
        map2.put(2,"jose");

        Map<String, String> immutableMap = Collections.singletonMap("USA", "Washington");
    }


}
