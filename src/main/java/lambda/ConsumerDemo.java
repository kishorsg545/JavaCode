package lambda;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo
{
    public static void main(String[] args)
    {
        Consumer<String> upperCase=input-> System.out.println(input.toUpperCase());
        upperCase.accept("RajaRamMohan Rao");

        Consumer<Integer> squareOfNumber=input-> System.out.println(input*input);
        List<Integer> number=List.of(1,2,3,4,5,6,7,8,9,10);
        number.forEach(squareOfNumber);
        Consumer<String> appendInput = input -> System.out.println("New value after appending is : HELLO " + input);
        appendInput.andThen(upperCase).accept("Lambda Expression");
    }
}
