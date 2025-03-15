package methodrefrences;

public class StaticMethodReferences
{
    public static void main(String[] args)
    {
        ArithmeticOperation operation=(a,b)->{
            int sum=a+b;
            System.out.println(sum);
            return sum;
        };
        operation.performOperation(10,20);
        ArithmeticOperation adding=StaticMethodReferences::performOperation1;
        adding.performOperation(10,20);
    }
    public static int performOperation1(int a,int b)
    {
        int result=a+b;
        System.out.println(result);
        return result;
    }
}
