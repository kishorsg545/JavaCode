package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class DemoForPredicate
{
    public static List<User> gettingUsersAdmin(String a)
    {
        List<User> users=new ArrayList<>();
        users.add(new User("Jone","admin"));
        users.add(new User("Lam","tester"));
        return filleting(users,user->user.getAdmin().equals(a));
    }

    public static List<User> filleting(List<User> c, Predicate<User> predicate)
    {
        List<User> itPredicate=new ArrayList<>();
        for(User user:c)
        {
        if(predicate.test(user))
        {
            itPredicate.add(user);
        }
        }
        return itPredicate;

    }

    public static void main(String[] args) {
        System.out.println(gettingUsersAdmin("tester"));
    }
}
