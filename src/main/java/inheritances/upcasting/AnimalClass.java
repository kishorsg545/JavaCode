package inheritances.upcasting;

public class AnimalClass
{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void eat(String food)
    {
        System.out.println("Animal  eating "+food);
    }

}
