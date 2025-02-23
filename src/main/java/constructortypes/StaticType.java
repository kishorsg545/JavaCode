package constructortypes;

public class StaticType
{
    int num1;
    int num2;
    static final int Number=10;
   /* No, you cannot use the "static" keyword with a constructor in Java; a constructor in
    Java cannot be declared as static, meaning you cannot have a "static constructor" in
    the language.*/

    //instance initializer
    //instance initializer execute before constructor
    {
        System.out.println("My is Rani ");
        System.out.println(this.num2=31);
        // 1-it will print Second,
        // 2-This keyword is used to refer to the current object
        // 3-it runs every time object is created
    }

    //Static initializer
    //static initializer execute before main
    static
    {
        System.out.println("My is Raja");
        // 1-it will print first
        // 2- this keyword is not used to refer to the current object
        // 3-it runs only once when a class load at time
    }

    int sum()
    {
        int reuslt=num1+num2;

        return reuslt;
    }

    public static void main(String[] args) {
        StaticType sumOfTwoNumbers=new StaticType();
        sumOfTwoNumbers.num1=10;
        sumOfTwoNumbers.num2=20;
        System.out.println(sumOfTwoNumbers.sum());
        System.out.println(sumOfTwoNumbers.sum()==StaticType.Number);

        StaticType sumOfTwoNumbers1=new StaticType();
    }

}
