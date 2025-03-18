package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamLimitMethods
{
    public static void main(String[] args) {
        Stream.generate(new Random()::nextInt).limit(10).forEach(System.out::println);

        //Skip
        Stream.iterate(1,n->n+1).skip(3).limit(10).forEach(System.out::println);
    }
}
