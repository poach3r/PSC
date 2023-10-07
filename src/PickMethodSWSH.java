import java.awt.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.event.*;

public class PickMethodSWSH extends JFrame
    implements ActionListener
{
    public static Font myFont = new Font("Arial", Font.BOLD, 12);
    public static JFrame f = new JFrame("PSC");
    public static boolean shinyCharm = false;
    public static int n;

    private static void setLayout(Color colors[]) {
        Container c = f.getContentPane();
        c.setBackground(colors[0]);
        f.setSize(216, 291);
        f.setLayout(null); 
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    //masuda method button
    private static void getMs(Color colors[]) {
        JButton ms = new JButton("Masuda Method");
        ms.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                f.dispose();
                if(shinyCharm)
                    n = 512;
                else
                    n = 682;
                FileShit.main(n, colors);
            }
        });
        ms.setFocusPainted(false);
        ms.setBorder(new MatteBorder(2, 2, 2, 2, colors[2]));
        ms.setBounds(0, 0, 200, 52);
        ms.setFont(myFont);
        ms.setBackground(colors[0]);
        ms.setForeground(colors[1]);
        f.add(ms);
    }
    //brilliant button
    private static void getBr(Color colors[]) {
        JButton sw = new JButton("Brilliant");
        sw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                if(shinyCharm)
                    n = 455;
                else
                    n = 585;
                FileShit.main(n, colors);
            }
        });
        sw.setFocusPainted(false);
        sw.setBorder(new MatteBorder(2, 2, 2, 2, colors[2]));
        sw.setBounds(0, 50, 200, 52);
        sw.setFont(myFont);
        sw.setBackground(colors[0]);
        sw.setForeground(colors[1]);
        f.add(sw);
    }
    //dynamax adventures button
    private static void getDa(Color colors[]) {
        JButton ob = new JButton("Dynamax Adventures");
        ob.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                f.dispose();
                if(shinyCharm)
                    n = 100;
                else
                    n = 300;
                FileShit.main(n, colors);
            }
        });
        ob.setFocusPainted(false);
        ob.setBorder(new MatteBorder(2, 2, 2, 2, colors[2]));
        ob.setBounds(0, 100, 200, 52);
        ob.setFont(myFont);
        ob.setBackground(colors[0]);
        ob.setForeground(colors[1]);
        f.add(ob);
    }
    //soft reset button
    private static void getSr(Color colors[]) {
        JButton sr = new JButton("Soft Reset");
        sr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                f.dispose();
                n = 4096;
                FileShit.main(n, colors);
            }
        });
        sr.setFocusPainted(false);
        sr.setBorder(new MatteBorder(2, 2, 2, 2, colors[2]));
        sr.setBounds(0, 150, 200, 52);
        sr.setFont(myFont);
        sr.setBackground(colors[0]);
        sr.setForeground(colors[1]);
        f.add(sr);
    }

    private static void getSc(Color colors[]) {
        JButton sc = new JButton("Shiny Charm");
        sc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                shinyCharm = true;
            }
        });
        sc.setFocusPainted(false);
        sc.setBorder(new MatteBorder(2, 2, 2, 2, colors[2]));
        sc.setBounds(0, 200, 200, 52);
        sc.setFont(myFont);
        sc.setBackground(colors[0]);
        sc.setForeground(colors[1]);
        f.add(sc);
    }

    public static void main(Color colors[]) {
        setLayout(colors);
        getMs(colors);
        getBr(colors);
        getDa(colors);
        getSr(colors);
        getSc(colors);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
