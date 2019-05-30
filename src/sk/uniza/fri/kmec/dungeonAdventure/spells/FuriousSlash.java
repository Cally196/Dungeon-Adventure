/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.uniza.fri.kmec.dungeonAdventure.spells;

import sk.uniza.fri.kmec.dungeonAdventure.NPC.INPC;
import sk.uniza.fri.kmec.dungeonAdventure.game.Hrac;

/**
 * Implementuje ISpell a obsahuje info o Furious Slashi
 * @author ASUS_NB
 */
public class FuriousSlash implements ISpell {

    private int damage;

    public FuriousSlash() {
        this.damage = 30;
    }
    
    
    @Override
    public String getNazov() {
        return "Furious Slash";
    }

    @Override
    public int getDamage() {
        return this.damage;
    }

    @Override
    public boolean utok(Hrac hrac, INPC NPC) {
        INPC npc = NPC;
        
        if (!(npc == null)) {
            if (hrac.getEnergia() >= 20) {
                npc.setHP(this.damage * hrac.getAgility());
                hrac.setEnergy(-20);
                hrac.setHP(-NPC.getDMG());
                return true;
            }
        }
        
        return false;
    }
    
}
