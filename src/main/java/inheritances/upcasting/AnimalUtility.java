package inheritances.upcasting;

public class AnimalUtility
{
    public static void printAnimalName(AnimalClass animalclass)
    {
        System.out.println(animalclass.getName());
        animalclass.eat("eating");
    }

    public static void performancesAction(AnimalClass animalclass)
    {
        animalclass.eat("eating");
        if(animalclass instanceof Dog)
        {
            Dog dog=(Dog)animalclass;
            dog.bark();
        } else if (animalclass instanceof Cat) {
            Cat cat=(Cat)animalclass;
            cat.meow();
        }
    }
}
