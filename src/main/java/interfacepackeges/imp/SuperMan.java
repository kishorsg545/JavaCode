package interfacepackeges.imp;

import interfacepackeges.SuperHero;

public class SuperMan implements SuperHero  {


    public String usePower() {

        return "SuperMan using power";
    }


    public String stopKill(char c) {

        if(c =='y')
        {
            return "Super will kill";
        }else
        {
            return "super will save";
        }

    }

    @Override
    public String trackLiveLocation() {
        String liveLocation = "London";
        System.out.println("I am in "+ liveLocation);
        return  liveLocation;
    }

    //Hinding
    public static String commonCharacteristics () {
        return "Superhuman abilities, Willingness to sacrifice";
    }
}
