package abstractclass;

public abstract class Subject
{
   //abstract class we can give private
    int marks;
    static final int MIN_MARKS=0;
    // Abstract class we can not create object
    public int totalMarks()
    {
        return 100;
    }
    //If abstract mathod is should be overriding if you extended
    public abstract void tech();
}
