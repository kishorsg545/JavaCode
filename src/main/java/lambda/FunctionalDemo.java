package lambda;

import java.util.function.Function;

public class FunctionalDemo
{
    public static void main(String[] args)
    {
        Function<String,String> upperCaseStr=input->input.toUpperCase();
        System.out.println( upperCaseStr.apply("Kishor"));
        Function<String,Integer> lengthString=input->input.length();
        System.out.println( lengthString.apply("Kishor"));
        Function<String,String> name=Function.identity();
        System.out.println(name.apply("ram"));

        Function<Integer,Integer> doubleNum=num->num*2;
        Function<Integer,Integer> addThree=num->num+3;

        Function<Integer, Integer> output1 = doubleNum.andThen(addThree);
        Function<Integer, Integer> output2 = doubleNum.compose(addThree);
        System.out.println(output1.apply(5));
        System.out.println(output2.apply(4));
    }
}
