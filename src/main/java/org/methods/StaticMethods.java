package org.methods;

public class StaticMethods
{
    private static void withOutPrameters()
    {

    }
    /*The "this" keyword is used as a reference to an instance. Since the static methods
    doesn't have (belong to) any instance you cannot use the "this" reference within a static method*/

    private static void withPrameters(String firstName, String lastName, int age)
    {

        System.out.println(firstName + " " + lastName + " " + age);
    }

    public static void main(String[] args)
    {
        withOutPrameters();
        withPrameters("samrtha", "bagali", 20);
    }
}
