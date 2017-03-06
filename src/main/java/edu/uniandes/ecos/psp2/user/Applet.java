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


public class Applet extends JPanel
   implements ActionListener {
   JButton go;
   JLabel output;
   Reader reader = new Reader();
   JFileChooser chooser;
   String choosertitle;

  public Applet() {
    go = new JButton("Buscar folder");
    go.setSize(100,100);
    go.addActionListener(this);
    add(go);
   }

  public void actionPerformed(ActionEvent e) {
    chooser = new JFileChooser(); 
    chooser.setCurrentDirectory(new java.io.File("."));
    chooser.setDialogTitle(choosertitle);
    chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    chooser.setAcceptAllFileFilterUsed(false);
    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
    	reader.listFilesForFolder(chooser.getSelectedFile());
    	System.out.println(reader.getResults()[2]);
      }
     }
   public String getSelectedFolder(){
	   return chooser.getSelectedFile().getPath();
   }
  public Dimension getPreferredSize(){
    return new Dimension(550, 550);
    }
}