/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.uniza.fri.kmec.dungeonAdventure.NPC;

import java.util.HashMap;
import sk.uniza.fri.kmec.dungeonAdventure.items.IPredmet;

/**
 * Trieda interface pre NPC
 * @author ASUS_NB
 */
public interface INPC {

    String getMeno();

    int getHP();

    void setHP(int HP);

    void setPredmet(IPredmet predmet);

    HashMap getPredmety();

    int getDMG();

}
