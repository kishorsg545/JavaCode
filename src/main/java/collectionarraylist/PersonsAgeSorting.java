package collectionarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonsAgeSorting
{
    public  static List<Person> sortPersonsUsingAge()
    {
    var persons = new ArrayList<Person>();
    persons.add(new Person("James", 65));
    persons.add(new Person("Sneha", 34));
    persons.add(new Person("Jenna", 30));
    persons.add(new Person("Harry", 29));
        Collections.sort(persons);
        System.out.println(persons);
    // Sort the Persons based on age and return
        return persons;
}

    public static void main(String[] args) {
        sortPersonsUsingAge();
    }
}
