package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo
{
    public static void main(String[] args)
    {
        Predicate<Integer> isEven= num->num%2==0;
        System.out.println(isEven.test(20));

        Predicate<Integer> isGreaterThan50= num->num>50;
        System.out.println(isGreaterThan50.test(20));

        System.out.println(isEven.and(isGreaterThan50).test(60));
        System.out.println(isEven.or(isGreaterThan50).test(13));
        System.out.println(isEven.negate().test(13));

        Predicate<Integer> isOdd = Predicate.not(isEven);
        System.out.println(isOdd.test(14));

        Predicate<String> isEqual = Predicate.isEqual("Ram");
        System.out.println(isEqual.test("Ram"));
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> evenList = list.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(evenList);
    }
}
