package object;

public class MutableDemo
{
    public static void main(String[] args) {
        PersonMutable mutableperson=new PersonMutable("Ram","Software" );
        System.out.println(mutableperson.getName());
        mutableperson.setName("Lam");
        System.out.println(mutableperson.getName());

    }
}

