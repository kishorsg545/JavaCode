package inheritances.is_a_has_a;

import inheritances.inherit.Person;

public class Is_aHas_aRelationship
{
   // Has_a relationship- Aggregation, Composition
    Person person;
    Is_aHas_aRelationship (Person person)
    {
        this.person=person;
    }

}
//is_a relationship
class Animal
{

}

class dog extends Animal
{

}
