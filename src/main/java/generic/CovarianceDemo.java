package generic;

import generic.model.Devloper;
import generic.model.Employee;
import generic.model.Manager;

import java.util.ArrayList;
import java.util.List;

public class CovarianceDemo
{
    public static void main(String[] args)
    {
      Employee[] array={new Employee(),new Employee()};
      printArray(array);
        Devloper[] array1={new Devloper(),new Devloper()};
        printArray(array1);
        Manager[] array2={new Manager(),new Manager()};
        printArray(array2);

        String s = "Generics";
        Object o = s;

        String[] sArray = {"Generics", "Collections"};
        Object[] objArray = sArray;

        List<String> sList = new ArrayList<>();
        List<Object> oList = new ArrayList<>();
        // oList = sList;

        Number[] numArray = {1,2,3};
        Object[] objectArray = numArray; // Covariances accepted
        objectArray[0] = "String";// Give Run time error

        List<Employee> employees1 = List.of(new Employee(), new Employee());
        printArray1(employees1);
        List<Devloper> developers1 = List.of(new Devloper(), new Devloper());
        // printArray1(developers1);
    }

    public static void printArray(Employee[] array)
    {
        for(Employee s : array)
        {
            System.out.println(s);
        }
    }
    public static  void printArray1(List<Employee> employees) {
        for(Employee employee: employees) {
            System.out.println(employee);
        }
    }
}
