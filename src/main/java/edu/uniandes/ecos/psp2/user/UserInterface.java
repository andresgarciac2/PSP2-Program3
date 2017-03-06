package edu.uniandes.ecos.psp2.user;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * Clase principal del programa para la ejecucion
 * @author AndrésGarcía
 *
 */
public class UserInterface {
	
	
	
	/**
	 * entrada princial del programa
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    JFrame frame = new JFrame("");
	    Applet panel = new Applet();
	    frame.addWindowListener(
	      new WindowAdapter() {
	        public void windowClosing(WindowEvent e) {
	          System.exit(0);
	          }
	        }
	      );
	    frame.setLocation(600, 300);
	    frame.getContentPane().add(panel,"Center");
	    frame.setSize(panel.getPreferredSize());
	    frame.setVisible(true);
	}
}
