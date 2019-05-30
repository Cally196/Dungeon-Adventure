/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.uniza.fri.kmec.dungeonAdventure.environment;

import java.util.HashMap;
import sk.uniza.fri.kmec.dungeonAdventure.items.IPredmet;
import java.util.Set;
import sk.uniza.fri.kmec.dungeonAdventure.NPC.INPC;

/**
 * Trieda miestnosti, implementuje IMiestnost
 * @author ASUS_NB
 */
public class Miestnost implements IMiestnost {

    private HashMap<String, IPredmet> predmety;
    private HashMap<String, IMiestnost> vychody;
    private HashMap<String, INPC> NPC;
    private String nazov;

    public Miestnost(String nazov) {
        this.nazov = nazov;
        this.vychody = new HashMap<>();
        this.predmety = new HashMap<>();
        this.NPC = new HashMap<>();
    }

    @Override
    public void setVychod(String nazov, IMiestnost vychod) {
        this.vychody.put(nazov, vychod);
    }

    @Override
    public IPredmet zoberPredmet(String nazov) {
        return this.predmety.remove(nazov);
    }

    @Override
    public String vypisInfo() {
        Set<String> info = this.vychody.keySet();
        String aa = null;
        for (String string : info) {
            aa = aa + string;
        }

        return aa;
    }

    @Override
    public String getNazov() {
        return this.nazov;
    }

    @Override
    public void setPredmet(IPredmet predmet) {
        this.predmety.put(predmet.getMeno(), predmet);
    }

    @Override
    public IMiestnost getVychod(String nazov) {
        return this.vychody.get(nazov);
    }

    @Override
    public HashMap getPredmety() {
        return this.predmety;
    }

    @Override
    public HashMap getVychody() {

        return this.vychody;
    }

    @Override
    public void setNPC(INPC NPC) {
        this.NPC.put(NPC.getMeno(), NPC);
    }

    @Override
    public HashMap getNPCs() {
        return this.NPC;
    }

    @Override
    public INPC getNPC(String nazov) {
        return this.NPC.get(nazov);
    }

    @Override
    public void removeNPC(String nazov) {
        this.NPC.remove(nazov);
    }

    @Override
    public IPredmet getPredmet(String nazov) {
        return this.predmety.get(nazov);
    }

}
