package optional;

import java.util.Optional;
import java.util.Random;

public class OptionalDemo
{
    public static void main(String[] args)
    {
        String message=sayHello();
        if(message !=null) {
            System.out.println(message.toUpperCase());
        }

        Optional<String> world=sayHi();
        if(world.isPresent())
        {
            System.out.println(world.get().toUpperCase());
        }

        world.ifPresent(s-> System.out.println(s.toUpperCase()));
        world.ifPresentOrElse(z-> System.out.println(z.toUpperCase()),
                ()-> System.out.println("Value is absent"));

        String msg=world.orElse("Value is absent");
        System.out.println(msg);

        String msg1=world.orElseGet(()->"Value is absent");
        System.out.println(msg1);

//       String msg2= world.orElseThrow();
//        System.out.println(msg2);
//
//        String msg3= world.orElseThrow(()->new IllegalStateException() );
//        System.out.println(msg3);

        Optional<String> msg4=world.map(String::toUpperCase);
        System.out.println(msg4);

        Optional<String> filterOptionalStr = world.filter(value -> value.length()>5);
        System.out.println(filterOptionalStr);

    }
    public static String sayHello()
    {
        int i = new Random().nextInt();
        System.out.println(i);
        if(i%2==0)
        {
            return "Hello World";
        }
        return null;
    }

    public static Optional<String> sayHi()
    {
        int i = new Random().nextInt();
        String msg=null;
        if(i%2==0)
        {
            msg="Hi,How are you?";

        }
        return Optional.ofNullable(msg);
    }
}
