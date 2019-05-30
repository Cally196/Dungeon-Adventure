/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.uniza.fri.kmec.dungeonAdventure.spells;

import sk.uniza.fri.kmec.dungeonAdventure.NPC.INPC;
import sk.uniza.fri.kmec.dungeonAdventure.game.Hrac;

/**
 * Spell fireball implementuje ISpell a obsahuje info o fireballe
 * @author ASUS_NB
 */
public class Fireball implements ISpell {
    
    private int damage;

    public Fireball() {
        this.damage = 25;
    }
    

    @Override
    public String getNazov() {
        return "Fireball";
    }

    @Override
    public int getDamage() {
        return this.damage;
    }

    /**
     * Skontroluje ci má hrač dosť many a zautočí 
     */
    @Override
    public boolean utok(Hrac hrac, INPC NPC) {        
        INPC npc = NPC;
        
        if (!(npc == null)) {
            if (hrac.getMana() >= 15) {
                npc.setHP(this.damage * hrac.getIntellect());
                hrac.setMana(-15);
                hrac.setHP(-NPC.getDMG());
                return true;
            }
        }
        
        return false;
    }
    
}
