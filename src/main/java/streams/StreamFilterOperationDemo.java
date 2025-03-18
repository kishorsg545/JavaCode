package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamFilterOperationDemo
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
        departments.stream()
                .map(s->s.toUpperCase())
                .filter(s->s.startsWith("P"))
                .forEach(System.out::println);
    }
}
