package interfacepackeges;

import interfacepackeges.imp.IronMan;
import interfacepackeges.imp.SuperMan;

public class Main
{
    public static void main(String[] args) {
        SuperHero iron=new IronMan();
        invokeMethod(iron);
        SuperHero super1=new SuperMan();
        invokeMethod(super1);

    }

    private static void invokeMethod(SuperHero superHero)
    {
        System.out.println(superHero.usePower());
        System.out.println(superHero.stopKill('n'));
        superHero.trackLiveLocation();
        SuperHero.commonCharacteristics();
    }
}
