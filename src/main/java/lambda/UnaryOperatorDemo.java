package lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo
{
    public static void main(String[] args)
    {
        UnaryOperator<String> upperCaseStr= input->input.toUpperCase();
        System.out.println( upperCaseStr.apply("Kishor"));

        UnaryOperator<String> name=UnaryOperator.identity();
        System.out.println(name.apply("ram"));

        UnaryOperator<Integer> doubleNum=num->num*2;
        UnaryOperator<Integer> addThree=num->num+3;

        Function<Integer, Integer> output1 = doubleNum.andThen(addThree);
        Function<Integer, Integer> output2 = doubleNum.compose(addThree);
        System.out.println(output1.apply(5));
        System.out.println(output2.apply(4));
    }
}
