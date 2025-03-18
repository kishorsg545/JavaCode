package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamMapDemo
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

        //One Way representation of stream
        departments.stream().forEach(System.out::println);
        //Another way representation of stream
        departments.stream().map(s->s.toUpperCase()).forEach(System.out::println);
        //Another way representation of stream
        departments.stream().map(s->s.toUpperCase()).
                map(s->"Department name:-"+s).forEach(System.out::println);
    }
}
