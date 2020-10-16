package lessons.algorithms;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InvertBrackets {

    public static void main(String[] args) {
        System.out.println("\n\nResult: " + basicBraketsInverter("ab(cd(1234(5(67)lm)no))"));
    }

    private static String basicBraketsInverter(String dataEntry) {
        List<String> input = Stream.of(dataEntry.split("")).map(s -> new String(s)).collect(Collectors.toList());
        while (IntStream.range(0, input.size()).filter(i -> "(".equals(input.get(i))).max().isPresent()) {
            OptionalInt lastOpen = IntStream.range(0, input.size())
                    .filter(i -> "(".equals(input.get(i))).max();
            OptionalInt firstClose = IntStream.range(lastOpen.getAsInt(), input.size())
                    .filter(i -> ")".equals(input.get(i))).findFirst();
            input.remove(firstClose.getAsInt());
            input.remove(lastOpen.getAsInt());
            IntStream.range(lastOpen.getAsInt(), firstClose.getAsInt() - 1).
                    forEach(i -> input.add(i, input.remove(firstClose.getAsInt() - 2)));
        }
        return String.join("", input);
    }

}
