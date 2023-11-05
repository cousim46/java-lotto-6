package lotto;

import java.util.List;
import java.util.stream.Collectors;

public class ListDataTypeConverter {

    public static List<String> integerToString(List<Integer> elements) {
        return elements.stream().map(element -> Integer.toString(element)).collect(Collectors.toList());
    }

    public static List<Integer> stringToInteger(List<String> elements) {
        return elements.stream().map(Integer::parseInt).collect(Collectors.toList());
    }
}
