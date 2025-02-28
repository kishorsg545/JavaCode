package inheritances.inherit;

import java.util.logging.Logger;

public class Person
{
    String name;
    int age;

    public static final Logger logger= Logger.getLogger(Person.class.getName());
    void eat(String food)
    {
        logger.info("I am eating "+food);
    }
    void walk()
    {
    logger.info("I am walking");
    }
    void sleep()
    {
    logger.info("I am sleeping");
    }
}
