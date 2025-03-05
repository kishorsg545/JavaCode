package collectionarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSortingDemo
{
    public static void main(String[] args)
    {
        var student=new ArrayList<Student>();
        student.add(new Student("ram",101,80));
        student.add(new Student("lam",101,87));
        student.add(new Student("jam",101,60));
        System.out.println(student);
        Collections.sort(student);
        var student1=new ArrayList<Student>();
        student1.add(new Student("ram",101,80));
        student1.add(new Student("lam",101,87));
        student1.add(new Student("jam",101,60));
        Collections.sort(student1,new StudentMarkComparator());
        System.out.println(student1);
    }
}
