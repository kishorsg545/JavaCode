package org.methods;

public class ThrowsExpection
{
    // age should be greater than 18
    public void vote(int age) throws RuntimeException
    {
        if(age<18)
        {
            throw new RuntimeException("Age should be greater than 18 then you can vote");
        }
        else
        {
            System.out.println("Eligible to vote");
        }
    }

   /* If we throw an unchecked exception from a method, it is not required to handle the
    exception or declare it in throws clause. However, for checked exceptions, handling or declaration
    in the throws clause is mandatory."*/
    public static void main(String[] args)  {
        ThrowsExpection vote = new ThrowsExpection();
        vote.vote(15);

    }

}
