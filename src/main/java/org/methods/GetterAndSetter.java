package org.methods;

public class GetterAndSetter
{
    String fistName;
    String lastName;
    int age;

    public void setFirstName(String firstName)
    {
        this.fistName = firstName;
    }

    public String getFirstName()
    {
       return fistName;
    }

    public static void main(String[] args)
    {
        GetterAndSetter nameDetails = new GetterAndSetter();
        nameDetails.setFirstName("Samrtha");
        System.out.println(nameDetails.getFirstName());
    }
}