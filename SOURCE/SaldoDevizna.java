/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applet;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Sukov
 */
public class SaldoDevizna extends javax.swing.JApplet {
    private static void dodadi(Container container, Component component, 
int gridx, int gridy, int gridwidth, int gridheight, int anchor, 
int fill) { 
GridBagConstraints gbc = new GridBagConstraints(gridx, gridy, 
gridwidth, gridheight, 1.0, 1.0, anchor, fill, new Insets(0,0,0,0), 0, 0); 
container.add(component, gbc); 
    }
    /**
     * Initializes the applet SaldoDevizna
     */
    CardLayout c;
    JButton kopce1,kopce2;
    JPanel karta;
    @Override
    public void init() {
       
           setLayout(new GridBagLayout());
           setSize(480,200);
JPanel panela1=new JPanel();
    JPanel panela2=new JPanel();
    JPanel panela3=new JPanel();
    karta=new JPanel();
    panela1.setLayout(new GridBagLayout());
    panela2.setLayout(new GridBagLayout());
    panela3.setLayout(new GridBagLayout());
    
    
    kopce1=new JButton("Momentalna sostojba");
    kopce2=new JButton("Promet vo period");
    
    
    kopce1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                c.show(karta,"prva");
            }
        });
    
     kopce2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                c.show(karta, "vtora");
            }
        });
    dodadi(panela3,kopce1,0,0,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    dodadi(panela3,kopce2,1,0,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    //add(panela3);
    
    
     c=new CardLayout();
    karta.setLayout(c);
    c.show(karta,"prva");
    
    JLabel momentalna=new JLabel("Momentalna sostojba:");
    JLabel momentalnipari=new JLabel(Integer.toString(new Random().nextInt(50000)+5000)+"$");
    
    JLabel rezervirani=new JLabel("Rezervirani sredstva:");
    JLabel rezerviranipari=new JLabel(Integer.toString(new Random().nextInt(5000))+"$");
    
    JLabel raspolozivi=new JLabel("Raspolozivi sredstva:");
    JLabel raspolozivipari=new JLabel(Integer.toString(-Integer.parseInt(rezerviranipari.getText().substring(0, rezerviranipari.getText().indexOf('$')))+Integer.parseInt(momentalnipari.getText().substring(0, momentalnipari.getText().indexOf('$'))))+"$");
    
    dodadi(panela1,momentalna,0,0,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    dodadi(panela1,momentalnipari,1,0,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    dodadi(panela1,rezervirani,0,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    dodadi(panela1,rezerviranipari,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    dodadi(panela1,raspolozivi,0,2,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    dodadi(panela1,raspolozivipari,1,2,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    
    
    JLabel nalog=new JLabel("Nalogodavac");
    JLabel opis =new JLabel("Opis");
    JLabel iznos=new JLabel("Iznos");
     JLabel datum=new JLabel("Datum");
     
    dodadi(panela2,nalog,0,0,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    dodadi(panela2,opis,1,0,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    dodadi(panela2,iznos,2,0,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    dodadi(panela2,datum,3,0,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    
    JLabel nalog1=new JLabel("Bank Of America");
    JLabel opis1 =new JLabel("Bank Of America");
    JLabel iznos1=new JLabel("-300"+"$");
    JLabel datum1=new JLabel("10.09.2012");
    
    dodadi(panela2,nalog1,0,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    dodadi(panela2,opis1,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    dodadi(panela2,iznos1,2,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    dodadi(panela2,datum1,3,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    
    JLabel nalog2=new JLabel("Bendigo Bank");
    JLabel opis2 =new JLabel("Bendigo Bank");
    JLabel iznos2=new JLabel("-150"+"$");
    JLabel datum2=new JLabel("10.09.2012");
    
    dodadi(panela2,nalog2,0,2,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    dodadi(panela2,opis2,1,2,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    dodadi(panela2,iznos2,2,2,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    dodadi(panela2,datum2,3,2,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    
    JLabel nalog3=new JLabel("PayPal");
    JLabel opis3 =new JLabel("Ebay PayPal #Toys");
    JLabel iznos3=new JLabel("-200"+"$");
    JLabel datum3=new JLabel("10.09.2012");
    
    dodadi(panela2,nalog3,0,3,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    dodadi(panela2,opis3,1,3,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    dodadi(panela2,iznos3,2,3,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    dodadi(panela2,datum3,3,3,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    
    dodadi(this,panela3,0,0,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    
    
    karta.add(panela1,"prva");
    karta.add(panela2,"vtora");
    dodadi(this,karta,0,1,3,3,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    //add(karta);
    
     
  
}
    

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
