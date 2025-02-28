package exceptionhandling;

import java.util.Scanner;
import java.util.logging.Logger;

public class AcceptAgeDetails
{
    private static final Logger logger=Logger.getLogger(AcceptAgeDetails.class.getName());
    public static void main(String[] args) throws InvalidAgeException {

            Scanner sc=new Scanner(System.in);
            logger.info("Enter your age");
            int age=sc.nextInt();
            if(age<0 || age>100)
            {
                throw new InvalidAgeException("Please enter a valid age");
            }
            logger.info("Your age is "+age);
    }
}
