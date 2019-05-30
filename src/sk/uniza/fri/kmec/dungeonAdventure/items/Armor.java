/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.uniza.fri.kmec.dungeonAdventure.items;

/**
 * Trieda armor poskytuje info o equipe pre hraca
 * @author ASUS_NB
 */
public class Armor {

    private int intellect;
    private int agility;

    public Armor(int intellect, int agility) {
        this.intellect = intellect;
        this.agility = agility;
    }

    public int getIntellect() {
        return this.intellect;
    }

    public int getAgility() {
        return this.agility;
    }

}
