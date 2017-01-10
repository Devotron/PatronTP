package bebetes;

/**
 *
 * @author  collet
 * @author fmallet Enlève l'héritage de JFrame inutile.
 * @version 1.1
 */

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class LanceBebetes {
    public static void main (String args[]) {
        JFrame frame = new JFrame("Champ de bébêtes");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ChampDeBebetes champ = new ChampDeBebetes(640,480,200);
        frame.getContentPane().add(champ, BorderLayout.CENTER);
    	champ.demarre();
    	
    	frame.pack();
    	frame.setVisible(true);
    }

}
