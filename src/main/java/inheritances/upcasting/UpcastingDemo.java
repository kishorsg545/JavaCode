package inheritances.upcasting;

import java.util.logging.Logger;



public class UpcastingDemo
{
    private static final Logger logger= Logger.getLogger(UpcastingDemo.class.getName());
    public static void main(String[] args)
    {
        AnimalClass anm=new AnimalClass();
        anm.setName("Scooby");
        AnimalUtility.printAnimalName(anm);
        anm=new Dog();
        anm.setName("Rover");
        AnimalUtility.printAnimalName(anm);

        Cat cat=new Cat();
        cat.setName("Whiskers");
        AnimalUtility.printAnimalName(cat);
    }
}
