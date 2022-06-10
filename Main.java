
/* Soubor je ulozen v kodovani UTF-8.
 * Kontrola kódování: Pøíliš luouèkı kùò úpìl ïábelské ódy. */

import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.FlowLayout;


/*******************************************************************************
 * Tøída {@code Main} je hlavní tøídou projektu,
 * kterı ...
 *
 * @author    Tomáš Duchek
 * @version   2.0
 */

public class Main
{
    /***************************************************************************
     * Metoda, prostøednictvím ní se spouští celá aplikace.
     *
     * @param args Parametry pøíkazového øádku
     */
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowGUI();
            }
        });
    }
    public static void createAndShowGUI()
    {
        
        JFrame frame = new JFrame("JButton frame");
        frame.add(createLayoutPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocation(500, 250);
        frame.setVisible(true);
    }
        public static JPanel createLayoutPanel()
        {
            JPanel panel = new JPanel();
            FlowLayout l = new FlowLayout(FlowLayout.CENTER);
            l.setHgap(50);
            panel.setLayout(l);
            JTextField instance = new JTextField();
            String vstup = instance.getText();
            JPanel.add(instance);
   
            int pocet;
            for(int i=0; i<vstup.length(); i++)
            {
            	String b = charAt(i);
            	int c = Integer.valueOf(b);
            	if(a == 43)
            		pocet++;
            }
            
            int [] pole = new int [pocet];
            String bezMezer = vstup.replace(" ","");
            String [] pole2 = bezMezer.split("\\+");
            
            for(int d=0; d<vstup.length(); d++)
            {
            	String pomocna = charAt(d);
            	int pom = Integer.valueOf(pomocna);
            	pole [d] = pom;
            	System.out.println(pole);
            	
            }
            
            
            JButton tlacitko_secti = new JButton("Secti");
            JButton tlacitko_odecti = new JButton("Odecti");
            panel.add(tlacitko_secti);
            panel.add(tlacitko_odecti);
            tlacitko_secti.addActionListener(new ActionListener(){ 
                public void actionPerformed(ActionEvent e){
                    Calc.secti();
                }
            
        });
            tlacitko_odecti.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Calc.odecti();
                }
            });
        return panel;
    }
}
       
        