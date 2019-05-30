/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.uniza.fri.kmec.dungeonAdventure.commands;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sk.uniza.fri.kmec.dungeonAdventure.game.Hrac;

/**
 * Trieda prikazu uloz
 * @author ASUS_NB
 */
public class VykonavacUloz implements IVykonavac {

    public VykonavacUloz() {
    }

    @Override
    public boolean vykonaj(Hrac hrac, String parameter) {
        FileOutputStream stream = null;
        try {
            File subor = new File("save.bin");
            stream = new FileOutputStream(subor);
            DataOutputStream zapisovac = new DataOutputStream(stream);

            zapisovac.writeInt(hrac.getMana());
            zapisovac.writeInt(hrac.getEnergia());
            zapisovac.writeInt(hrac.getIntellect());
            zapisovac.writeInt(hrac.getAgility());
            zapisovac.writeInt(hrac.getHP());

            try {
                zapisovac.writeInt(hrac.getHelma().getIntellect());
                zapisovac.writeInt(hrac.getHelma().getAgility());
                zapisovac.writeUTF(hrac.getHelma().getMeno());
                zapisovac.writeUTF(hrac.getHelma().vypisInfo());
            } catch (Exception e) {
                zapisovac.writeInt(0);
                zapisovac.writeInt(0);
                zapisovac.writeUTF("null");
                zapisovac.writeUTF("null");
            }

            try {
                zapisovac.writeInt(hrac.getChesta().getIntellect());
                zapisovac.writeInt(hrac.getChesta().getAgility());
                zapisovac.writeUTF(hrac.getChesta().getMeno());
                zapisovac.writeUTF(hrac.getChesta().vypisInfo());
            } catch (Exception e) {
                zapisovac.writeInt(0);
                zapisovac.writeInt(0);
                zapisovac.writeUTF("null");
                zapisovac.writeUTF("null");
            }

            try {
                zapisovac.writeInt(hrac.getLegs().getIntellect());
                zapisovac.writeInt(hrac.getLegs().getAgility());
                zapisovac.writeUTF(hrac.getLegs().getMeno());
                zapisovac.writeUTF(hrac.getLegs().vypisInfo());
            } catch (Exception e) {
                zapisovac.writeInt(0);
                zapisovac.writeInt(0);
                zapisovac.writeUTF("null");
                zapisovac.writeUTF("null");
            }

            zapisovac.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(VykonavacUloz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VykonavacUloz.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stream.close();
            } catch (IOException ex) {
                Logger.getLogger(VykonavacUloz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return false;
    }

}
