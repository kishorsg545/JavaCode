package operator;

public class Operator
{
    public static void main(String[] args)
    {
        String s1=1+2+"Hello";// It will add 1 and 2 and then add Hello
        String s2="Hello"+1+2;//it will consider as string all the values
        System.out.println(s1);
        System.out.println(s2);
        boolean b=false;
        int num=10;
        String s="Hello";
        String s3=b+(num+s);
        System.out.println(s3);
        num += 2;// num=num+2
        System.out.println(num);
        String str=s+num;
        str +=9;
        System.out.println(str);
        int num2=++num+5;
        System.out.println(num2);
        /*&&

        x y output
        0 0 0
        0 1 0
        1 0 0
        1 1 1

         ||
        x y output
        0 1 1
        1 0 1
        1 1 1
        0 0 0

        ^
        x y output
        1 1 0
        1 0 1
        0 1 1
        0 0 0
        */
       // Ternary Operator
        int num3=10;
        int num4=20;
        int num5=num3<num4?num3:num4;
        System.out.println(num5);

    }
}
