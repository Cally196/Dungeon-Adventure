/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.uniza.fri.kmec.dungeonAdventure.environment;

import sk.uniza.fri.kmec.dungeonAdventure.NPC.NPC;
import sk.uniza.fri.kmec.dungeonAdventure.items.CathedralKey1;
import sk.uniza.fri.kmec.dungeonAdventure.items.CathedralKey2;
import sk.uniza.fri.kmec.dungeonAdventure.items.Chest;
import sk.uniza.fri.kmec.dungeonAdventure.items.EnergyPotion;
import sk.uniza.fri.kmec.dungeonAdventure.items.Helmet;
import sk.uniza.fri.kmec.dungeonAdventure.items.Legs;
import sk.uniza.fri.kmec.dungeonAdventure.items.MajorEnergyPotion;
import sk.uniza.fri.kmec.dungeonAdventure.items.MajorManaPotion;
import sk.uniza.fri.kmec.dungeonAdventure.items.ManaPotion;
import sk.uniza.fri.kmec.dungeonAdventure.items.Mapa;
import sk.uniza.fri.kmec.dungeonAdventure.items.MinorEnergyPotion;
import sk.uniza.fri.kmec.dungeonAdventure.items.MinorManaPotion;
import sk.uniza.fri.kmec.dungeonAdventure.items.PotionOfTriton;
import sk.uniza.fri.kmec.dungeonAdventure.items.WinnerToken;

/**
 * Trieda obsahuje všetky miestnosti predmety a NPC ktore sa do nich vkladaju
 * @author ASUS_NB
 */
public class MapaHry {

    private Miestnost startovaciaMiestnost;

    public MapaHry() {
        Miestnost entrance = new Miestnost("Entrance");
        Miestnost darkCellar = new Miestnost("Dark Cellar");
        Miestnost defiledCrypt = new Miestnost("Defiled Crypt");
        Miestnost hallsOfAgony = new Miestnost("Halls of Agony");
        Miestnost chamberOfSuffering = new Miestnost("Chamber of Suffering");
        Miestnost theOldRuins = new Miestnost("The old Ruins");
        Miestnost cathedralGarden = new Miestnost("Cathedral Garden");
        Miestnost theCathedral = new Miestnost("The Cathedral");

        //inicializacia vychodov        
        entrance.setVychod(darkCellar.getNazov(), darkCellar);

        darkCellar.setVychod(entrance.getNazov(), entrance);
        darkCellar.setVychod(defiledCrypt.getNazov(), defiledCrypt);
        darkCellar.setVychod(chamberOfSuffering.getNazov(), chamberOfSuffering);

        defiledCrypt.setVychod(darkCellar.getNazov(), darkCellar);
        defiledCrypt.setVychod(hallsOfAgony.getNazov(), hallsOfAgony);

        hallsOfAgony.setVychod(defiledCrypt.getNazov(), defiledCrypt);

        chamberOfSuffering.setVychod(darkCellar.getNazov(), darkCellar);
        chamberOfSuffering.setVychod(theOldRuins.getNazov(), theOldRuins);
        chamberOfSuffering.setVychod(cathedralGarden.getNazov(), cathedralGarden);

        theOldRuins.setVychod(chamberOfSuffering.getNazov(), chamberOfSuffering);

        cathedralGarden.setVychod(chamberOfSuffering.getNazov(), chamberOfSuffering);
        cathedralGarden.setVychod(theCathedral.getNazov(), theCathedral);

        theCathedral.setVychod(cathedralGarden.getNazov(), cathedralGarden);

        //inicializácia bossov
        NPC bazzalan = new NPC("Bazzalan", 245, 9);
        NPC doomwalker = new NPC("Doomwalker", 399, 15);
        NPC anraphet = new NPC("Anraphet", 468, 17);
        NPC cenarius = new NPC("Cenarius", 754, 27);
        NPC delvengyr = new NPC("Delvengyr", 961, 39);
        NPC felmyst = new NPC("Felmyst", 1248, 74);
        NPC freya = new NPC("Freya", 2000, 94);

        // priradenie predmetov k NPC        
        bazzalan.setPredmet(new Helmet(2, 1, "Eventide Helmet", "Helma prida 2 intellect a 1 agility"));
        bazzalan.setPredmet(new ManaPotion());

        doomwalker.setPredmet(new Chest(1, 0, "Destiny Chestplate", "Chesta prida 1 intellect"));
        doomwalker.setPredmet(new EnergyPotion());

        anraphet.setPredmet(new Helmet(2, 2, "Vindictive Helmet", "Helma prida 2 intellect a 2 agility"));
        anraphet.setPredmet(new PotionOfTriton());

        cenarius.setPredmet(new Legs(1, 1, "Dreadwyrm Legplates", "Legy pridaju 1 intellect a 1 agility"));
        cenarius.setPredmet(new MajorManaPotion());

        delvengyr.setPredmet(new Chest(3, 2, "Demonsteel Chestplate", "Chesta prida 3 intellect a 2 agility"));
        delvengyr.setPredmet(new PotionOfTriton());

        felmyst.setPredmet(new Legs(2, 2, "Goldrune Legplates", "Legy pridaju 2 intellect a 2 agility"));
        felmyst.setPredmet(new MajorEnergyPotion());

        freya.setPredmet(new WinnerToken());

        //priradenie NPC k miestnostiam 
        darkCellar.setNPC(bazzalan);
        defiledCrypt.setNPC(doomwalker);
        hallsOfAgony.setNPC(anraphet);
        chamberOfSuffering.setNPC(cenarius);
        theOldRuins.setNPC(delvengyr);
        cathedralGarden.setNPC(felmyst);
        theCathedral.setNPC(freya);

        darkCellar.setNPC(new NPC("Ghoul", 211, 10));
        defiledCrypt.setNPC(new NPC("Ghoul", 211, 10));
        hallsOfAgony.setNPC(new NPC("Ghoul", 211, 10));
        hallsOfAgony.setNPC(new NPC("Worm", 289, 8));
        chamberOfSuffering.setNPC(new NPC("Ghoul", 211, 10));
        theOldRuins.setNPC(new NPC("Ghoul", 211, 10));
        theOldRuins.setNPC(new NPC("Worm", 289, 8));
        cathedralGarden.setNPC(new NPC("Ghoul", 211, 10));
        theCathedral.setNPC(new NPC("Ghoul", 211, 10));

        //priradenie predmetov k miestnostiam
        entrance.setPredmet(new Mapa());
        entrance.setPredmet(new ManaPotion());
        darkCellar.setPredmet(new MinorEnergyPotion());
        defiledCrypt.setPredmet(new MinorManaPotion());
        hallsOfAgony.setPredmet(new CathedralKey1());
        chamberOfSuffering.setPredmet(new MinorManaPotion());
        theOldRuins.setPredmet(new CathedralKey2());
        cathedralGarden.setPredmet(new MinorEnergyPotion());

        /**
         * GM predmety pre rychly postup
         */
//        entrance.setPredmet(new Helmet(2, 2, "Vindictive Helmet", "Helma prida 2 intellect a 2 agility"));
//        entrance.setPredmet(new Chest(3, 2,"Demonsteel Chestplate", "Chesta prida 3 intellect a 2 agility"));
//        entrance.setPredmet(new Legs(2, 2, "Goldrune Legplates", "Legy pridaju 2 intellect a 2 agility"));
//        entrance.setPredmet(new MajorEnergyPotion());
//        entrance.setPredmet(new MajorManaPotion());
//        entrance.setPredmet(new PotionOfTriton());
        this.startovaciaMiestnost = entrance;
    }

    /**
     *
     * @return this.startovaciaMiestnost Vráti startovaciu miestnost
     */
    public Miestnost getStartovaciaMiestnost() {
        return this.startovaciaMiestnost;
    }

}
