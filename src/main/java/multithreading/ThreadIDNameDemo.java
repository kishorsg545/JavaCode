package multithreading;

public class ThreadIDNameDemo
{
    public static void main(String[] args)
    {
        Thread t1=new Thread();
        Thread t2=new Thread();
        Thread t3=new Thread();
        t3.setName("MyThread");
        System.out.println("My Thread id:"+ t1.getId() + " name:" + t1.getName());
        System.out.println("My Thread id:"+t2.getId() + " name:" + t2.getName());
        System.out.println("My Thread id:"+t3.threadId() + " name:" + t3.getName());
    }

}
