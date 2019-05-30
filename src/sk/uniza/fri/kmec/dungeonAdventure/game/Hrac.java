/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.uniza.fri.kmec.dungeonAdventure.game;

import java.util.HashMap;
import sk.uniza.fri.kmec.dungeonAdventure.NPC.INPC;
import sk.uniza.fri.kmec.dungeonAdventure.items.IPredmet;
import sk.uniza.fri.kmec.dungeonAdventure.environment.IMiestnost;
import sk.uniza.fri.kmec.dungeonAdventure.items.Chest;
import sk.uniza.fri.kmec.dungeonAdventure.items.Helmet;
import sk.uniza.fri.kmec.dungeonAdventure.items.Legs;

/**
 * Trieda hrac obsahuje informacie o hracovi 
 * @author ASUS_NB
 */
public class Hrac {

    private int mana;
    private int energia;
    private int intellect;
    private int agility;
    private int HP;
    private IPredmet helma;
    private IPredmet chesta;
    private IPredmet legs;
    private IMiestnost aktualnaMiestnost;
    private HashMap<String, IPredmet> inventar;
    private INPC target;
    private boolean vyhra;

    public Hrac(IMiestnost aktualnaMiestnost) {
        this.mana = 200;
        this.energia = 200;
        this.intellect = 1;
        this.agility = 1;
        this.aktualnaMiestnost = aktualnaMiestnost;
        this.inventar = new HashMap<>();
        this.target = null;
        this.helma = null;
        this.chesta = null;
        this.legs = null;
        this.vyhra = false;
        this.HP = 100;
    }

    public int getHP() {
        return this.HP;
    }

    public void setHP(int HP) {
        this.HP = this.HP + HP;
    }

    public int getIntellect() {
        return this.intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = this.intellect + intellect;
    }

    public int getAgility() {
        return this.agility;
    }

    public void setAgility(int agility) {
        this.agility = this.agility + agility;
    }

    public int getMana() {
        return this.mana;
    }

    public int getEnergia() {
        return this.energia;
    }

    public void setMana(int mana) {
        this.mana = this.mana + mana;
    }

    public void setEnergy(int energia) {
        this.energia = this.energia + energia;
    }

    /**
     * @param nazov
     * @return boolean Hrac prejde do novej mietnosti
     */
    public boolean chod(String nazov) {
        IMiestnost novaMiestnost = this.aktualnaMiestnost.getVychod(nazov);

        if (novaMiestnost == null) {
            return false;
        }
        this.aktualnaMiestnost = novaMiestnost;
        return true;
    }

    /**
     * Pridanie predmetu z miestnosti do inventára
     */
    public boolean zoberPredmet(String nazov) {
        IPredmet predmet = this.aktualnaMiestnost.zoberPredmet(nazov);

        if (predmet == null) {
            return false;
        }

        this.inventar.put(nazov, predmet);

        return true;
    }

    /**
     * Metoda pre zlúčenie 2 HashMapov s predmetami
     */
    public boolean zoberPredmety(HashMap predmety) {

        if (predmety == null) {
            return false;
        }

        this.inventar.putAll(predmety);

        return true;
    }

    /**
     * Vyhodenie predmetu z inventára do miestnosti
     */
    public boolean polozPredmet(String nazov) {
        IPredmet predmet = this.inventar.get(nazov);
        this.inventar.remove(nazov);

        if (predmet == null) {
            return false;
        }

        this.aktualnaMiestnost.setPredmet(predmet);
        return true;
    }

    /**
     * Vzmaze vybrany predmet z inventara
     */
    public boolean vymazPredmet(IPredmet predmet) {
        if (predmet == null) {
            return false;
        }
        this.inventar.remove(predmet.getMeno());
        return true;
    }

    public IMiestnost getAktualnaMiestnost() {
        return this.aktualnaMiestnost;
    }

    /**
     * Vráti HashMap s predmetami ktore su v inventári
     */
    public HashMap getInventar() {
        return this.inventar;
    }

    /**
     * Vráti predmet z inventára
     */
    public IPredmet getPredmetZInventara(String nazov) {
        return this.inventar.get(nazov);
    }

    /**
     * Priradí NPC do targetu hráča
     */
    public void setTarget(String nazov) {
        this.target = this.aktualnaMiestnost.getNPC(nazov);
    }

    /**
     * Vráti NPC ktoré je v targete
     */
    public INPC getTarget() {
        return this.target;
    }

    /**
     * Odstráni NPC z targetu
     */
    public void removeTarget(String nazov) {
        this.target = null;
    }

    /**
     * Metoda pre použitie predmetu z inventára
     */
    public boolean pouziPredmet(String parameter) {
        IPredmet predmet = this.inventar.get(parameter);
        if (predmet == null) {
            return false;
        }
        predmet.pouzi(this);
        return true;
    }

    /**
     * Vráti equipnutú helmu
     */
    public Helmet getHelma() {
        return (Helmet)this.helma;
    }

    /**
     * Priradí helmu z inventára hráčovi
     */
    public void setHelma(IPredmet helma) {
        if (this.helma != null) {
            this.inventar.put(this.helma.getMeno(), this.helma);

        }
        this.helma = helma;
        this.inventar.remove(helma.getMeno());

    }

    /**
     * Vráti equipnutu chestu
     */
    public Chest getChesta() {
        return (Chest)this.chesta;
    }

    /**
     * Priradí chestu z inventára hráčovi
     */
    public void setChesta(IPredmet chesta) {
        if (this.chesta != null) {
            this.inventar.put(this.chesta.getMeno(), this.chesta);
        }
        this.chesta = chesta;
        this.inventar.remove(chesta.getMeno());
    }

    /**
     * Vráti equipnuté legy
     */
    public Legs getLegs() {
        return (Legs)this.legs;
    }

    /**
     * Priradí legy z inventára hráčovis
     */
    public void setLegs(IPredmet legs) {
        if (this.legs != null) {
            this.inventar.put(this.legs.getMeno(), this.legs);
        }
        this.legs = legs;
        this.inventar.remove(legs.getMeno());
    }

    /**
     * Skontroluje ci hrac ma potrebne kluce pre vstup do miestnosti
     */
    public boolean maKluce() {
        if ((this.inventar.containsKey("Cathedral key 1") && (this.inventar.containsKey("Cathedral key 2")))) {
            return true;
        }

        return false;
    }

    /**
     * Kontroluje ci su vsetky NPC zabite pre postup do dalšej miestnosti
     */
    public boolean vsetkoZabite(String parameter) {
        IMiestnost novaMiestnost = this.aktualnaMiestnost.getVychod(parameter);

        if (this.aktualnaMiestnost.getNPCs().isEmpty()) {
            if (novaMiestnost.getNPCs().isEmpty()) {
                return true;
            }
            return true;
        } else {
            if (novaMiestnost.getNPCs().isEmpty()) {
                return true;
            }
        }

        return false;
    }

    /**
     * Vráti true ak parameter je vychod z miestnosti
     */
    public boolean jeParameter(String parameter) {
        IMiestnost novaMiestnost = this.aktualnaMiestnost.getVychod(parameter);

        if (!(novaMiestnost == null)) {
            return true;
        }
        return false;
    }

    public boolean isVyhra() {
        return this.vyhra;
    }

    public void setVyhra(boolean vyhra) {
        this.vyhra = vyhra;
    }

}
