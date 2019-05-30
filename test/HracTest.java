/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sk.uniza.fri.kmec.dungeonAdventure.environment.Miestnost;
import sk.uniza.fri.kmec.dungeonAdventure.game.Hrac;

/**
 * testovacia trieda
 * @author ASUS_NB
 */
public class HracTest {
    
   // private Hrac hrac;
    public HracTest() {
        //this.hrac = null;
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       // this.hrac = new Hrac(new Miestnost("test"));
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testSetHPPozitivy() {
        Hrac hrac = new Hrac(new Miestnost("test"));
        System.out.println("HP pozitivny");
        int pom = hrac.getHP();
        int parameter = 20;
        hrac.setHP(parameter);
        int vysledok = hrac.getHP();
        int ocakavanyVysledok = pom + parameter;
        assertEquals(vysledok, ocakavanyVysledok);
    }
    
    @Test
    public void testSetHPNegativny() {
        Hrac hrac = new Hrac(new Miestnost("test"));
        System.out.println("HP negativny");
        int pom = hrac.getHP();
        int parameter = 20;
        hrac.setHP(parameter);
        int vysledok = hrac.getHP();
        int ocakavanyVysledok = pom - parameter;
        assertNotEquals(vysledok, ocakavanyVysledok);
    }
    
    @Test
    public void testSetIntellectPozitivy() {
        Hrac hrac = new Hrac(new Miestnost("test"));
        System.out.println("intellect pozitivny");
        int pom = hrac.getIntellect();
        int parameter = 30;
        hrac.setIntellect(parameter);
        int vysledok = hrac.getIntellect();
        int ocakavanyVysledok = pom + parameter;
        assertEquals(vysledok, ocakavanyVysledok);
    }
    
    @Test
    public void testSetIntellectNegativny() {
        Hrac hrac = new Hrac(new Miestnost("test"));
        System.out.println("Intellect negativny");
        int pom = hrac.getIntellect();
        int parameter = 30;
        hrac.setIntellect(parameter);
        int vysledok = hrac.getIntellect();
        int ocakavanyVysledok = pom - parameter;
        assertNotEquals(vysledok, ocakavanyVysledok);
    }
    
    @Test
    public void testSetAgilityPozitivy() {
        Hrac hrac = new Hrac(new Miestnost("test"));
        System.out.println("agility pozitivny");
        int pom = hrac.getAgility();
        int parameter = 40;
        hrac.setAgility(parameter);
        int vysledok = hrac.getAgility();
        int ocakavanyVysledok = pom + parameter;
        assertEquals(vysledok, ocakavanyVysledok);
    }
    
    @Test
    public void testSetAgilityNegativny() {
        Hrac hrac = new Hrac(new Miestnost("test"));
        System.out.println("agility negativny");
        int pom = hrac.getAgility();
        int parameter = 40;
        hrac.setAgility(parameter);
        int vysledok = hrac.getAgility();
        int ocakavanyVysledok = pom - parameter;
        assertNotEquals(vysledok, ocakavanyVysledok);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
