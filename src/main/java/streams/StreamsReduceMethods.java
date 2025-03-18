package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class StreamsReduceMethods
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
        System.out.println(departments.stream().count());

        List<Integer> number=List.of(1,2,3,4,5,6,7,8);
        int sum=number.stream().reduce(1,Integer::sum);// 1 number adding to sum
        System.out.println(sum);
        long numbres=number.stream().mapToLong(num->num).sum();
        System.out.println(numbres);

        OptionalInt result1 = number.stream().mapToInt(num -> num).max();
        System.out.println(result1.getAsInt());

        OptionalInt result = number.stream()
                .filter(num -> num%2==0)
                .mapToInt(num -> num).max();
        System.out.println(result.getAsInt());

    }
}
