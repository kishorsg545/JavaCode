package methodrefrences;

import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.println;

public class ClassMethodReferences
{
    public static void main(String[] args)
    {
        List<String> list=List.of("development","HR","Testing","QA");
        list.forEach(department-> System.out.println(department));
        list.forEach(System.out::println);
    }
}
