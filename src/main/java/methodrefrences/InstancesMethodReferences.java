package methodrefrences;

public class InstancesMethodReferences
{
    public static void main(String[] args)
    {
        ArithmeticOperation operation=(a,b)->{
            int sum=a+b;
            System.out.println(sum);
            return sum;
        };
        InstancesMethodReferences instancesMethodReferences=new InstancesMethodReferences();
        ArithmeticOperation adding=instancesMethodReferences::performOperationAdding;
        adding.performOperation(10,20);
        ArithmeticOperation subtract=instancesMethodReferences::performOperationSubtract;
        subtract.performOperation(10,20);
    }

    public int performOperationAdding(int a,int b)
    {
        int result=a+b;
        System.out.println(result);
        return result;
    }
    public int performOperationSubtract(int a,int b)
    {
        int result1=a-b;
        System.out.println(result1);
        return result1;

    }
}
