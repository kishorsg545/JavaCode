package streams;

import java.util.List;

public class Person
{
    private String name;
    private List<String> mobileNumber;

    public Person(String name, List<String> mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public List<String> getMobileNumber() {
        return mobileNumber;
    }
}
