package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMapDemo
{
    public static void main(String[] args)
    {
        String[] name={"Kishor","Ram","Lam"};
        Stream<String> names=Arrays.stream(name);
        Stream<String[]>names1=names.map(s->s.split(""));
        names1.flatMap(Arrays::stream).forEach(System.out::println);

        List<Person> person=Arrays.asList(new Person("kishor", Arrays.asList("123","456")),
                new Person("ram", Arrays.asList("789","1011")));
        List<List<String>> mobilenumber1=person.stream().map(Person::getMobileNumber).collect(Collectors.toList());
        System.out.println(mobilenumber1);

        List<String> mobilenumber=person.stream().flatMap(p->p.getMobileNumber().stream()).collect(Collectors.toList());
        System.out.println(mobilenumber);
    }
}
