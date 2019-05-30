/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.uniza.fri.kmec.dungeonAdventure.items;

import sk.uniza.fri.kmec.dungeonAdventure.game.Hrac;

/**
 * Trieda obsahuje info o cheste, dedi Armor a implementuje IPredmet
 * @author ASUS_NB
 */
public class Chest extends Armor implements IPredmet {

    private String nazov;
    private String info;

    public Chest(int intellect, int agility, String nazov, String info) {
        super(intellect, agility);
        this.nazov = nazov;
        this.info = info;
    }

    @Override
    public String getMeno() {
        return this.nazov;
    }

    @Override
    public String vypisInfo() {
        return this.info;
    }

    @Override
    public void pouzi(Hrac hrac) {
        try {
            hrac.setIntellect(super.getIntellect() - hrac.getChesta().getIntellect());
            hrac.setAgility(super.getAgility() - hrac.getChesta().getAgility());
        } catch (Exception e) {
            hrac.setIntellect(super.getIntellect());
            hrac.setAgility(super.getAgility());
        }

        hrac.setChesta(this);
    }

    @Override
    public int getIntellect() {
        return super.getIntellect();
    }

    @Override
    public int getAgility() {
        return super.getAgility();
    }

}
