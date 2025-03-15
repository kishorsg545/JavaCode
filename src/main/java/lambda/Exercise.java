package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Exercise
{
    public static void main(String[] args)
    {
        transformStringList();
    }

    public static List<String> transformStringList()
    {
      List<String> world=List.of("hello", "world", "java", "lambda");
      //We are storing the world in result
        List<String> result = new ArrayList<>();
        StringTransformer upperCaseTransformer = (String s) -> s.toUpperCase();
        for (String word : world) {
            result.add(upperCaseTransformer.transform(word));

        }
        System.out.println(result);
      return result;
    }
}
