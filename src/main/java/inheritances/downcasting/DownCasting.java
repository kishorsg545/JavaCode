package inheritances.downcasting;


import inheritances.upcasting.AnimalClass;
import inheritances.upcasting.AnimalUtility;
import inheritances.upcasting.Cat;
import inheritances.upcasting.Dog;

public class DownCasting
{
    public static void main(String[] args) {
        AnimalClass anm;
        Dog dog=new Dog();
        anm=dog;
        //downcasting

        dog=(Dog)anm;
        AnimalUtility.performancesAction(dog);

        // Instanceof
        if(anm instanceof Cat cat)
        {

            String name=cat.getName();
            System.out.println(name);
        }
    }
}
