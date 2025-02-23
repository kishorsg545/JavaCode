package constructortypes;

import java.sql.SQLOutput;

public class Employee
{
    String fistName;
    String lastName;
    int age;
    char gender;



    public Employee()
    {
        this("Lam","Jam",40,'M');
        System.out.println("Default Constructor");
     //constructor chaining
    }

    public Employee(String firstName,String lastName,int age,char gender)
    {
        this.fistName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        System.out.println(this.fistName = firstName);
        System.out.println("Override Constructor");
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
