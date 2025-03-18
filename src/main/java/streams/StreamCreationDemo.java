package streams;

import methodrefrences.InterfaceProduct;
import methodrefrences.Product;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationDemo
{
    public static void main(String[] args) {
        List<String> departments = List.of("development", "HR", "Testing", "QA");
        departments.forEach(a -> System.out.println(a));

        Stream<String> depstream = departments.stream();
        depstream.forEach(System.out::println);

        Stream<String> names=Stream.of("kishor","ram","raj");
        names.forEach(System.out::println);

        Stream<String> stringStream = departments.parallelStream();
        stringStream.forEach(System.out::println);

        Stream<String> parallel = names.parallel();
        parallel.forEach(System.out::println);

        String[] names1={"kishor","ram","raj"};
        Stream<String> stream = Arrays.stream(names1);
        stream.forEach(System.out::println);

        Stream<Object> empty = Stream.empty();
        empty.forEach(System.out::println);

        // Stream.generate(new Random()::nextInt).forEach(System.out::println);
        // Stream.iterate(1,n -> n+1).forEach(System.out::println);
    }
}
