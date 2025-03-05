package object;

public class DemoClass
{
    public static void main(String[] args) throws CloneNotSupportedException {
        Demo demo=new Demo("Ram",20,'M',123456);
        Demo demo1=new Demo("Ram",20,'M',123456);
        Class aClass = demo.getClass();
        System.out.println(aClass.getName());
        System.out.println(aClass.getClasses());
        System.out.println(aClass.getPackageName());
        // overriding the hascode
        System.out.println(demo.hashCode());
        System.out.println(demo1.hashCode());
        System.out.println(demo.equals(demo1));//false why memory will store in different row

        System.out.println(demo);


        //Clone
        Demo demo2=new Demo("Ram",20,'M',123456);

        Demo demo3=(Demo)demo2.clone();
        System.out.println(demo3.getName());
        demo3.setName("Lam");
        System.out.println(demo3.getName());
        System.out.println(demo2.getName());



    }
}
