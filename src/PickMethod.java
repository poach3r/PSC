import java.awt.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.event.*;

public class PickMethod extends JFrame
    implements ActionListener
{
    JFrame f = new JFrame("PSC");
    int shinycharm = 0;
    public void Initial() {
        Container c = f.getContentPane();
        Font myFont = new Font("Arial", Font.BOLD, 12);
        c.setBackground(Color.BLACK);  

        JButton ms = new JButton("Masuda Method");
        ms.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                f.dispose();
                new Counter().Initial(shinycharm, 1, 0, 0);
            }
        });
        ms.setFocusPainted(false);
        ms.setBorder(new MatteBorder(2, 2, 2, 2, Color.WHITE));
        ms.setBounds(0, 0, 200, 52);
        ms.setFont(myFont);
        ms.setForeground(Color.WHITE);
        ms.setBackground(Color.BLACK);
        f.add(ms);

        JButton sw = new JButton("Sandwich");
        sw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                f.dispose();
                new Counter().Initial(shinycharm, 0, 1, 0);
            }
        });
        sw.setFocusPainted(false);
        sw.setBorder(new MatteBorder(2, 2, 2, 2, Color.WHITE));
        sw.setBounds(0, 50, 200, 52);
        sw.setFont(myFont);
        sw.setForeground(Color.WHITE);
        sw.setBackground(Color.BLACK);
        f.add(sw);

        JButton ob = new JButton("Outbreak");
        ob.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                f.dispose();
                new Counter().Initial(shinycharm, 0, 0, 1);
            }
        });
        ob.setFocusPainted(false);
        ob.setBorder(new MatteBorder(2, 2, 2, 2, Color.WHITE));
        ob.setBounds(0, 100, 200, 52);
        ob.setFont(myFont);
        ob.setForeground(Color.WHITE);
        ob.setBackground(Color.BLACK);
        f.add(ob);

        JButton obsw = new JButton("Outbreak + Sandwich");
        obsw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                f.dispose();
                new Counter().Initial(shinycharm, 0, 0, 0);
            }
        });
        obsw.setFocusPainted(false);
        obsw.setBorder(new MatteBorder(2, 2, 2, 2, Color.WHITE));
        obsw.setBounds(0, 150, 200, 52);
        obsw.setFont(myFont);
        obsw.setForeground(Color.WHITE);
        obsw.setBackground(Color.BLACK);
        f.add(obsw);

        JButton sc = new JButton("Shiny Charm");
        sc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                shinycharm = 1;
            }
        });
        sc.setFocusPainted(false);
        sc.setBorder(new MatteBorder(2, 2, 2, 2, Color.WHITE));
        sc.setBounds(0, 200, 200, 52);
        sc.setFont(myFont);
        sc.setForeground(Color.WHITE);
        sc.setBackground(Color.BLACK);
        f.add(sc);

        f.setSize(216, 292);
        f.setLayout(null); 
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) throws Exception {
        new PickMethod().Initial();
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
