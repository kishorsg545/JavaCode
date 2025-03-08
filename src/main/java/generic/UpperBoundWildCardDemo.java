package generic;

import generic.model.Devloper;
import generic.model.Employee;

import java.util.List;

public class UpperBoundWildCardDemo
{
    public static void main(String[] args) {
        List<Employee> employees1 = List.of(new Employee(), new Employee());
        printArray(employees1);
        List<Devloper> developers1 = List.of(new Devloper(), new Devloper());
        printArray(developers1);
    }
    public static  void printArray(List< ? extends Employee> employees) {
        for(Employee employee: employees) {
            System.out.println(employee);
        }
    }
}
