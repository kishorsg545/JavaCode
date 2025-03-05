package object;

public class ImmutableDemo
{
    public static void main(String[] args) {
        PersonImmutable in=new PersonImmutable("ram","software");

        System.out.println(in.getName());
    }
}

