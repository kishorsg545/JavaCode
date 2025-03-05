package object;

public class PersonMutable
{
    private String name;
    private String accupation;

    public PersonMutable(String name, String accupation) {
        this.name = name;
        this.accupation = accupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccupation() {
        return accupation;
    }

    public void setAccupation(String accupation) {
        this.accupation = accupation;
    }
}
