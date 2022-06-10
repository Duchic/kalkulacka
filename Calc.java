
import javax.swing.JOptionPane;

public class Calc
{
    public static void secti()
    {
        String a = JOptionPane.showInputDialog(null,"Zadejte prvni cislo");
        String b = JOptionPane.showInputDialog(null,"Zadejte druhe cislo");
        int aa = Integer.valueOf(a);
        int bb = Integer.valueOf(b);
        int pom = aa + bb;
        JOptionPane.showMessageDialog(null,"Vysledek scitani je: "+pom,"Soucet",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void odecti()
    {
        String c = JOptionPane.showInputDialog(null,"Zadejte prvni cislo");
        String d = JOptionPane.showInputDialog(null,"Zadejte druhe cislo");
        int cc = Integer.valueOf(c);
        int dd = Integer.valueOf(d);
        int pom2 = cc - dd;
        JOptionPane.showMessageDialog(null,"Vysledek odcitani je: "+pom2,"Rozdil",JOptionPane.INFORMATION_MESSAGE);
    }
}
