package org.methods;

public class MethodsdifferentWaysWithReturn
{
    private void withOutPrameters()
    {
    }
    private void withParameters(String firstName, String lastName, int age)
    {
        System.out.println(firstName + " " + lastName + " " + age);
    }
    private String dataType()
    {
       return null;
    }
    public static void main(String[] args)
    {
        MethodsdifferentWaysWithReturn nameDetails = new MethodsdifferentWaysWithReturn();
        nameDetails.withOutPrameters();
        nameDetails.withParameters("samrtha", "bagali", 20);
        nameDetails.dataType();
    }
}
