/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.uniza.fri.kmec.dungeonAdventure.environment;

import java.util.HashMap;
import sk.uniza.fri.kmec.dungeonAdventure.NPC.INPC;
import sk.uniza.fri.kmec.dungeonAdventure.items.IPredmet;

/**
 * Interface trieda pre miestnosti
 * @author ASUS_NB
 */
public interface IMiestnost {

    IPredmet zoberPredmet(String nazov);

    String vypisInfo();

    String getNazov();

    void setVychod(String nazov, IMiestnost vychod);

    void setPredmet(IPredmet predmet);

    void setNPC(INPC NPC);

    IPredmet getPredmet(String nazov);

    HashMap getPredmety();

    HashMap getVychody();

    HashMap getNPCs();

    INPC getNPC(String nazov);

    void removeNPC(String nazov);

    IMiestnost getVychod(String nazov);

}
