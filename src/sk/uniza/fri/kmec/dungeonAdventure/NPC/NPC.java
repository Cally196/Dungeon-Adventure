/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.uniza.fri.kmec.dungeonAdventure.NPC;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.HashMap;
import sk.uniza.fri.kmec.dungeonAdventure.items.IPredmet;

/**
 * trieda pre NPC implementuje INPC
 * @author ASUS_NB
 */
public class NPC implements INPC {

    private String meno;
    private int HP;
    private HashMap<String, IPredmet> predmety;
    private int DMG;

    public NPC(String meno, int HP, int DMG) {
        this.meno = meno;
        this.HP = HP;
        this.predmety = new HashMap<>();
        this.DMG = DMG;
    }

    @Override
    public String getMeno() {
        return this.meno;
    }

    @Override
    public int getHP() {
        return this.HP;
    }

    @Override
    public void setHP(int HP) {
        this.HP = this.HP - HP;
    }

    /**
     * Pridá predmet do inventára NPC
     */
    @Override
    public void setPredmet(IPredmet predmet) {
        this.predmety.put(predmet.getMeno(), predmet);
    }

    /**
     * Vráti celý inventár NPC
     */
    @Override
    public HashMap getPredmety() {
        return this.predmety;
    }

    /**
     *
     * @return this.DMG Vráti DMG ktory udeli hračovi
     */
    @Override
    public int getDMG() {
        return this.DMG;
    }

}
