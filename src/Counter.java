import java.awt.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.event.*;

public class Counter extends JFrame
    implements ActionListener
{
    JFrame f = new JFrame("PSC");
    public int i = 0;
    public int n = 0;
    public void Initial(int shinycharm, int ms, int sw, int ob) {
        Container c = f.getContentPane();
        Font myFont = new Font("Arial", Font.BOLD, 12);
        c.setBackground(Color.BLACK);  

        JLabel count = new JLabel("" + i);
        count.setBounds(0, 0, 200, 52);
        count.setFont(myFont);
        count.setBorder(new MatteBorder(2, 2, 2, 2, Color.WHITE));
        count.setForeground(Color.WHITE);
        f.add(count);

        JButton plus = new JButton("+");
        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                i++;
                count.setText("" + i);
            }
        });
        plus.setFocusPainted(false);
        plus.setBorder(new MatteBorder(2, 2, 2, 2, Color.WHITE));
        plus.setBounds(0, 50, 200, 52);
        plus.setFont(myFont);
        plus.setForeground(Color.WHITE);
        plus.setBackground(Color.BLACK);
        f.add(plus);

        JButton minus = new JButton("-");
        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                i--;
                count.setText("" + i);
            }
        });
        minus.setFocusPainted(false);
        minus.setBorder(new MatteBorder(2, 2, 2, 2, Color.WHITE));
        minus.setBounds(0, 100, 200, 52);
        minus.setFont(myFont);
        minus.setForeground(Color.WHITE);
        minus.setBackground(Color.BLACK);
        f.add(minus);

        JButton eh = new JButton("End Hunt");
        eh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                if(ms == 1) {
                    if(shinycharm == 1)
                        n = 512;
                    else
                        n = 682;
                }
                else if(sw == 1) {
                    if(shinycharm == 1)
                        n = 683;
                    else
                        n = 1024;
                }
                else if(ob == 1) {
                    if(shinycharm == 1)
                        n = 512;
                    else
                        n = 819;
                }
                else {
                    if(shinycharm == 1)
                        n = 512;
                    else
                        n = 683;
                }
                if(i > n) {
                    eh.setText("You went " + (i / n) * 100 + "% over odds!");
                }
                else if(i < n) {

                    eh.setText("You went " + (n / i) * 100 + "% under odds!");
                }
                else
                    eh.setText("You were at odds!");
            }
        });
        eh.setFocusPainted(false);
        eh.setBorder(new MatteBorder(2, 2, 2, 2, Color.WHITE));
        eh.setBounds(0, 150, 200, 52);
        eh.setFont(myFont);
        eh.setForeground(Color.WHITE);
        eh.setBackground(Color.BLACK);
        f.add(eh);

        f.setSize(216, 242);
        f.setLayout(null); 
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
    }
}