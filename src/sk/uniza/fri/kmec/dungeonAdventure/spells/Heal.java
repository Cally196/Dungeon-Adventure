/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.uniza.fri.kmec.dungeonAdventure.spells;

import sk.uniza.fri.kmec.dungeonAdventure.NPC.INPC;
import sk.uniza.fri.kmec.dungeonAdventure.game.Hrac;

/**
 * Implementuje ISpell ma info o spelli heals
 * @author ASUS_NB
 */
public class Heal implements ISpell {
    private int heal;

    public Heal() {
        this.heal = 30;
    }
    
    @Override
    public String getNazov() {
        return "Heal";
    }

    @Override
    public int getDamage() {
        return this.heal;
    }

    @Override
    public boolean utok(Hrac hrac, INPC NPC) {
        if (hrac.getMana() >= 35) {                
            hrac.setMana(-35);
            hrac.setHP(this.heal * hrac.getIntellect());
            return true;
        }
        return false;
    }
    
}
