package object;

public class PersonImmutable
{
    private final String name;
    private final String accupation;

    public PersonImmutable(String name, String accupation) {
        this.name = name;
        this.accupation = accupation;
    }

    public String getName() {
        return name;
    }


    public String getAccupation() {
        return accupation;
    }


}
