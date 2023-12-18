import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentFilter {
    public static void main(String[] args) {
        List<String> studentNames = Arrays.asList("Alice", "Bob", "Anna", "Alex", "Amy", "Andrew", "Amanda", "David", "Daniel", "Emily");

        List<String> studentsWithA = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Students with names starting with 'A':");
        for (String student : studentsWithA) {
            System.out.println(student);
        }
    }
}
