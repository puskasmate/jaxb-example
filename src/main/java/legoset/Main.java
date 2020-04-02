package legoset;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;


import jaxb.JAXBHelper;



public class Main {

    public static void main(String[] args) throws Exception {

        LegoSet legoset=new LegoSet();

        legoset.setNumber("75211");
        legoset.setName("Imperial TIE Fighter");
        legoset.setTheme("Star Wars");
        legoset.setSubtheme("Solo");
        legoset.setYear(Year.of(2018));
        legoset.setPieces(519);
        legoset.setTags(List.of("Starfighter", "Stromtrooper", "Star Wars", "Solo"));
        ArrayList <Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig(2, "Imperial Mudtrooper"));
        minifigs.add(new Minifig(1, "Imperial Pilot"));
        minifigs.add(new Minifig(1, "Mimban Stormtrooper"));
        legoset.setMinifigs(minifigs);
        Weight weight=new Weight("kg", 0.89);
        legoset.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");

        JAXBHelper.toXML(legoset, System.out);

    }




}
