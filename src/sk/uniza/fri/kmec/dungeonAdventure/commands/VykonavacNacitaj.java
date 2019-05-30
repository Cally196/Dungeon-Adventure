/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.uniza.fri.kmec.dungeonAdventure.commands;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sk.uniza.fri.kmec.dungeonAdventure.game.Hrac;
import sk.uniza.fri.kmec.dungeonAdventure.items.Chest;
import sk.uniza.fri.kmec.dungeonAdventure.items.Helmet;
import sk.uniza.fri.kmec.dungeonAdventure.items.Legs;

/**
 * Trieda prikazu nacitaj 
 * @author ASUS_NB
 */
public class VykonavacNacitaj implements IVykonavac {

    public VykonavacNacitaj() {
    }

    @Override
    public boolean vykonaj(Hrac hrac, String parameter) {
        FileInputStream stream = null;
        try {
            File subor = new File("save.bin");
            stream = new FileInputStream(subor);

            DataInputStream citac = new DataInputStream(stream);

            try {
                hrac.setMana(citac.readInt() - hrac.getMana());
                hrac.setEnergy(citac.readInt() - hrac.getEnergia());
                hrac.setIntellect(citac.readInt() - 1);
                hrac.setAgility(citac.readInt() - 1);
                hrac.setHP(citac.readInt() - hrac.getHP());
                
                int intellect = citac.readInt();
                int agility = citac.readInt();
                String nazov = citac.readUTF();
                String info = citac.readUTF();
                if (!nazov.equals("null")) {
                    hrac.setHelma(new Helmet(intellect, agility, nazov, info));
                }

                intellect = citac.readInt();
                agility = citac.readInt();
                nazov = citac.readUTF();
                info = citac.readUTF();
                if (!nazov.equals("null")) {
                    hrac.setChesta(new Chest(intellect, agility, nazov, info));
                }

                intellect = citac.readInt();
                agility = citac.readInt();
                nazov = citac.readUTF();
                info = citac.readUTF();
                if (!nazov.equals("null")) {
                    hrac.setLegs(new Legs(intellect, agility, nazov, info));
                }

            } catch (EOFException ex) {
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(VykonavacNacitaj.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(VykonavacNacitaj.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stream.close();
            } catch (IOException ex) {
                Logger.getLogger(VykonavacNacitaj.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return false;
    }

}
