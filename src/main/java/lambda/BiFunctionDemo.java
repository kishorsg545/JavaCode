package lambda;

import java.sql.SQLOutput;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class BiFunctionDemo
{
    public static void main(String[] args)
    {
        BiPredicate<Integer,Integer> isSumEven=(num1,num2)->(num1+num2)%2==0;
        System.out.println(isSumEven.test(10,9));

        BiFunction<Double,Double,Double> squareOfTwoNumber=(num1,num2)->Math.pow(num1,num2);
        //public static double pow(double base, double exponent)
        System.out.println(squareOfTwoNumber.apply(2.0,8.0));

        BiConsumer<String,String> printNames=(name1,name2)->System.out.println(name1+" "+name2);
        printNames.accept("Kishor","Sharma");

        BiConsumer<String,String> printNames1=(name1,name2)-> System.out.println((name1+name2).length());
        printNames1.accept("kishor","s g");

        BinaryOperator<Double> validator=(num1,num2)->Math.pow(num1,num2);
        //public static double pow(double base, double exponent)
        System.out.println(squareOfTwoNumber.apply(2.0,8.0));

        BinaryOperator<Double> max=BinaryOperator.maxBy((a,b)->Double.compare(a,b));
        //public static double pow(double base, double exponent)
        System.out.println(max.apply(2.0,8.0));
        BinaryOperator<Double> min=BinaryOperator.minBy((a,b)->Double.compare(a,b));
        //public static double pow(double base, double exponent)
        System.out.println(min.apply(2.0,8.0));
    }
}
