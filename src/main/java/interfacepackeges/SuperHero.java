package interfacepackeges;



public interface SuperHero extends Person
{
    public String usePower();


    public String stopKill(char c);


    default String trackLiveLocation() {
        String liveLocation = "USA";
        System.out.println("I am in "+ liveLocation);
        return  liveLocation;
    }

    static String commonCharacteristics () {
        return "Superhuman abilities, Willingness to sacrifice";
    }

    @Override
    default void walk() {
        Person.super.walk();
    }
}
