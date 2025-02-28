package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class ExceptionHandling
{
    private static Logger logger=Logger.getLogger(ExceptionHandling.class.getName());
    public static void main(String[] args)
    {
        Scanner sc=null;
        try {
                sc = new Scanner(System.in);
            logger.info("Enter your name");
            String s = sc.nextLine();
            logger.info("Enter your age");
            int age = sc.nextInt();

        } catch (InputMismatchException ex)
        {
        logger.info("Please enter a valid number");

        }catch (Exception ex)
        {
            logger.info("Please check your code");
        }finally {
            if(sc!=null)
            sc.close();
            logger.info("Program executed successfully");
        }
    }
}
