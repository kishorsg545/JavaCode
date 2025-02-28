package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class TryWithResources {
    private static Logger logger = Logger.getLogger(TryWithResources.class.getName());

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            logger.info("Enter your name");
            String s = sc.nextLine();
            logger.info("Enter your age");
            int age = sc.nextInt();
        } catch (InputMismatchException ex) {
            logger.info("Please enter a valid number");
        }

       /* Below mention three ways we can write try with resources and try catch

       try{

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        ----------------
        try{

        }finally {

        }
        -------------------
        try
        {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        ------------------------
        try(Scanner sc = new Scanner(System.in)){

        }*/
    }
}
