package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class IncrementList
{
    public static List<Integer> incrementList(List<Integer> numbers, int incrementValue) {

        // Define a lambda expression using the UnaryOperator functional interface

        UnaryOperator<Integer> increment =num->num+incrementValue;

        // Apply the lambda expression to each integer in the list
        List<Integer> incrementedList=new ArrayList<>();
        for(Integer num:numbers)
        {
            incrementedList.add(increment.apply(num));
        }
        System.out.println(incrementedList);
        return incrementedList;
    }

    public static void main(String[] args)
    {
        incrementList(List.of(1,2,3,4,5),1);

    }

}
