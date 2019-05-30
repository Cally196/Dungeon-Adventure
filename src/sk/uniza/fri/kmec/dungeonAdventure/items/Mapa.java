/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.uniza.fri.kmec.dungeonAdventure.items;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import sk.uniza.fri.kmec.dungeonAdventure.game.Hrac;

/**
 * Mapa implementuje IPredmet a po použití vytvára novy JFrame na ktorom sa zobrazuje mapa hry
 * @author ASUS_NB
 */
public class Mapa implements IPredmet {

    @Override
    public String getMeno() {
        return "Mapa";
    }

    @Override
    public String vypisInfo() {
        return "Mapa miestnosti";
    }

    /**
     * Metoda vztvorí novz JFrame a zobrazí na nom mapu dungeonu
     */
    @Override
    public void pouzi(Hrac hrac) {
        JFrame f = new JFrame(); //creates jframe f

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //this is your screen size

        ImageIcon image = new ImageIcon("Mapa_zme.jpg"); //imports the image

        JLabel lbl = new JLabel(image); //puts the image into a jlabel

        f.getContentPane().add(lbl); //puts label inside the jframe

        f.setSize(image.getIconWidth(), image.getIconHeight()); //gets h and w of image and sets jframe to the size

        int x = (screenSize.width - f.getSize().width) / 2; //These two lines are the dimensions
        int y = (screenSize.height - f.getSize().height) / 2;//of the center of the screen

        f.setLocation(x, y); //sets the location of the jframe
        f.setVisible(true); //makes the jframe visible

    }

}
