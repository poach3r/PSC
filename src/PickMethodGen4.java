import java.awt.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.event.*;

public class PickMethodGen4 extends JFrame
    implements ActionListener
{
    public static Font myFont = new Font("Arial", Font.BOLD, 12);
    public static JFrame f = new JFrame("PSC");
    public static int n;

    private static void setLayout(Color colors[]) {
        Container c = f.getContentPane();
        c.setBackground(colors[0]);
        f.setSize(216, 190);
        f.setLayout(null); 
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    //pokeradar button
    private static void getPr(Color colors[]) {
        JButton ms = new JButton("Poke Radar");
        ms.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                f.dispose();
                n = 200;
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
    //wild encounter button
    private static void getWe(Color colors[]) {
        JButton sw = new JButton("Wild Encounters");
        sw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                n = 4096;
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
        sr.setBounds(0, 100, 200, 52);
        sr.setFont(myFont);
        sr.setBackground(colors[0]);
        sr.setForeground(colors[1]);
        f.add(sr);
    }

    public static void main(Color colors[]) {
        setLayout(colors);
        getPr(colors);
        getWe(colors);
        getSr(colors);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
