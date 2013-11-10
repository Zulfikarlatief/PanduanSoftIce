/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panduansoftice;

import javax.swing.UIManager;
import panduansoftice.view.FormUtama;

/**
 *
 * @author zword
 */
public class PanduanSoftIce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            com.jtattoo.plaf.noire.NoireLookAndFeel.setTheme("Large-Font",
                                                                "Java Swing","");
            UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
            new FormUtama().setVisible(true);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
