package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamsCollectsMethods
{
    public static void main(String[] args)
    {
        List<String> departments=new ArrayList<>();
        departments.add("Supply Chain Management");
        departments.add("Human Resource Management");
        departments.add("Sales Management");
        departments.add("IT Management");
        departments.add("Operations Management");
        departments.add("Logistics Management");
        departments.add("Marketing Management");
        departments.add("Finance Management");
        departments.add("Customer Relationship Management");
        departments.add("Product Management");
        departments.add("Quality Management");
        departments.add("Purchasing Management");
        departments.add("Accounting Management");
        departments.add("HR Management");
        departments.add("Procurement Management");
        departments.add("Human Resource Management");
        departments.add("Legal Management");
        departments.add("Business Development Management");
        departments.add("Information Technology Management");
       List<String> name= departments.stream().filter(s->s.startsWith("P")).collect(Collectors.toList());
        name.forEach(System.out::println);

        long name1= departments.stream().filter(s1->s1.startsWith("P")).collect(Collectors.counting());

        System.out.println(name1);

        Set<String> name3= departments.stream().filter(s->s.startsWith("P")).collect(Collectors.toSet());
        name3.forEach(System.out::println);

        Set<String> name4= departments.stream().filter(s->s.startsWith("P")).collect(Collectors.toCollection(TreeSet::new));
        name4.forEach(System.out::println);

    }
}
