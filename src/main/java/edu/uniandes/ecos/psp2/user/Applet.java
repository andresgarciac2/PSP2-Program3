package edu.uniandes.ecos.psp2.user;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import edu.uniandes.ecos.psp2.reader.Reader;



/**
 * Esta clase se encarga de desplegar interfaz grafica para seleccionar un archivo
 * @author AndrésGarcía
 * @version 0.0.1
 *
 */
public class Applet extends JPanel
   implements ActionListener {
	
	/**
	 * 
	 * 
	 * Variables publicas
	 */
   JButton go;
   JLabel output;
   Reader reader = new Reader();
   JFileChooser chooser;
   String choosertitle;

  /**
 * Constructor de la clase
 */
public Applet() {
    go = new JButton("Buscar folder");
    go.setSize(100,100);
    go.addActionListener(this);
    add(go);
   }

  /* (non-Javadoc)
 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
 */
public void actionPerformed(ActionEvent e) {
    chooser = new JFileChooser(); 
    chooser.setCurrentDirectory(new java.io.File("."));
    chooser.setDialogTitle(choosertitle);
    chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    chooser.setAcceptAllFileFilterUsed(false);
    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
    	reader.listFilesForFolder(chooser.getSelectedFile());
    	String rta = "Parametro de regresion B0= " + reader.getResults()[0] + "\n";
    	rta += "Parametro de regresion B1= " + reader.getResults()[1] + "\n";
    	rta += "Coeficiente r= " + reader.getResults()[2] + "\n";
    	rta += "Coeficiente r^2= " + reader.getResults()[3] + "\n";
    	rta += "Prediccion= " + reader.getResults()[4] + "\n";
    	System.out.println(rta);
    	JOptionPane.showMessageDialog (null, rta, "Resultado", JOptionPane.INFORMATION_MESSAGE);
      }
     }

   /**
    * 
    * Retorna el archivo seleccionado
 * @return
 */
public String getSelectedFolder(){
	   return chooser.getSelectedFile().getPath();
   }

  /* (non-Javadoc)
 * @see javax.swing.JComponent#getPreferredSize()
 */
public Dimension getPreferredSize(){
    return new Dimension(550, 550);
    }
}