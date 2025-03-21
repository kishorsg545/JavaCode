package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamsAPINullCheckTip
{
    public static void main(String[] args)
    {
       List<String> countryName= Arrays.asList("India","USA",null,"England",null,"Sri lanka",null,"Canada");

        List<String> name=countryName.stream().filter(Objects::nonNull)
                .map(s-> s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(name);

    }
}
