package interfacepackeges.imp;

import interfacepackeges.SuperHero;

public class IronMan implements SuperHero {
    @Override
    public String usePower() {
    return "Iron will use power";
    }


    public String stopKill(char c)
    {
        if(c == 'y')
        {
            return"Iron will kill";
        }else
        {
            return "Iron will save";
        }

    }
}
