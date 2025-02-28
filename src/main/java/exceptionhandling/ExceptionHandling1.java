package exceptionhandling;

import java.util.logging.Logger;

public class ExceptionHandling1
{
    private static Logger logger= Logger.getLogger(ExceptionHandling1.class.getName());
    public static void main(String[] args)
    {
        try {
            int[] num = {1, 2, 3, 4, 5};
            logger.info(String.valueOf(num[5]));
        }catch (ArrayIndexOutOfBoundsException ex)
        {
            logger.severe("Please enter a valid index");
        }finally {
            logger.info("Program executed successfully");
        }
    }
}
