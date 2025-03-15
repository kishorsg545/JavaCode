package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StringLengthTransformer
{
    public static void main(String[] args)
    {
        transformStringLengths(List.of("hello", "world", "java", "lambda"));

    }

    public static List<Integer> transformStringLengths(List<String> strings)
    {
        Function<String,Integer> worldLength= input->input.length();
        List<Integer> storingLength=new ArrayList<>();
        for(String length:strings)
        {
            storingLength.add(worldLength.apply(length));
        }
        // Apply the lambda expression to each string in the list
        System.out.println(storingLength);
        return storingLength;
    }
}
