import java.awt.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.event.*;

public class PickMethod extends JFrame
    implements ActionListener
{
    public static Font myFont = new Font("Arial", Font.BOLD, 12);
    public static JFrame f = new JFrame("PSC");
    public static int shinyCharm = 0;

    private static void setLayout() {
        Container c = f.getContentPane();
        c.setBackground(Color.BLACK);  
        f.setSize(216, 342);
        f.setLayout(null); 
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private static void getMs() {
        JButton ms = new JButton("Masuda Method");
        ms.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                f.dispose();
                new FileShit();
                FileShit.main(shinyCharm, 1, 0, 0, 0);
            }
        });
        ms.setFocusPainted(false);
        ms.setBorder(new MatteBorder(2, 2, 2, 2, Color.WHITE));
        ms.setBounds(0, 0, 200, 52);
        ms.setFont(myFont);
        ms.setForeground(Color.WHITE);
        ms.setBackground(Color.BLACK);
        f.add(ms);
    }
    
    private static void getSw() {
        JButton sw = new JButton("Sandwich");
        sw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new FileShit();
                FileShit.main(shinyCharm, 0, 1, 0, 0);
            }
        });
        sw.setFocusPainted(false);
        sw.setBorder(new MatteBorder(2, 2, 2, 2, Color.WHITE));
        sw.setBounds(0, 50, 200, 52);
        sw.setFont(myFont);
        sw.setForeground(Color.WHITE);
        sw.setBackground(Color.BLACK);
        f.add(sw);
    }

    private static void getOb() {
        JButton ob = new JButton("Outbreak");
        ob.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                f.dispose();
                new FileShit();
                FileShit.main(shinyCharm, 0, 0, 1, 0);
            }
        });
        ob.setFocusPainted(false);
        ob.setBorder(new MatteBorder(2, 2, 2, 2, Color.WHITE));
        ob.setBounds(0, 100, 200, 52);
        ob.setFont(myFont);
        ob.setForeground(Color.WHITE);
        ob.setBackground(Color.BLACK);
        f.add(ob);
    }

    private static void getSr() {
        JButton sr = new JButton("Soft Reset");
        sr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                new FileShit();
                FileShit.main(shinyCharm, 0, 0, 0, 1);
            }
        });
        sr.setFocusPainted(false);
        sr.setBorder(new MatteBorder(2, 2, 2, 2, Color.WHITE));
        sr.setBounds(0, 200, 200, 52);
        sr.setFont(myFont);
        sr.setForeground(Color.WHITE);
        sr.setBackground(Color.BLACK);
        f.add(sr);
    }

    private static void getObsw() {
        JButton obsw = new JButton("Outbreak + Sandwich");
        obsw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                f.dispose();
                new FileShit();
                FileShit.main(shinyCharm, 0, 0, 0, 0);
            }
        });
        obsw.setFocusPainted(false);
        obsw.setBorder(new MatteBorder(2, 2, 2, 2, Color.WHITE));
        obsw.setBounds(0, 150, 200, 52);
        obsw.setFont(myFont);
        obsw.setForeground(Color.WHITE);
        obsw.setBackground(Color.BLACK);
        f.add(obsw);
    }

    private static void getSc() {
        JButton sc = new JButton("Shiny Charm");
        sc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                shinyCharm = 1;
            }
        });
        sc.setFocusPainted(false);
        sc.setBorder(new MatteBorder(2, 2, 2, 2, Color.WHITE));
        sc.setBounds(0, 250, 200, 52);
        sc.setFont(myFont);
        sc.setForeground(Color.WHITE);
        sc.setBackground(Color.BLACK);
        f.add(sc);
    }

    public static void main(String[] args) throws Exception {
        setLayout();
        getMs();
        getSw();
        getOb();
        getSr();
        getObsw();
        getSc();
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
