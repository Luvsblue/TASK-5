import java.util.Arrays;
import java.util.List;

public class NonEmptyStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> nonEmptyStrings = getNonEmptyStrings(strings);

        System.out.println("List with non-empty strings:");
        for (String str : nonEmptyStrings) {
            System.out.println(str);
        }
    }

    public static List<String> getNonEmptyStrings(List<String> strings) {
        List<String> nonEmptyStrings = new ArrayList<>();
        for (String str : strings) {
            if (!str.isEmpty()) {
                nonEmptyStrings.add(str);
            }
        }
        return nonEmptyStrings;
    }
}
