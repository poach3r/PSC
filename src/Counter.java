import java.awt.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.event.*;
import java.util.Scanner;
import java.io.*;

public class Counter extends JFrame
    implements ActionListener
{
    public static JFrame f = new JFrame("PSC");
    public static int i = 0; //shiny encounters
    public static int n = 0; //hunting method
    public static Font myFont = new Font("Arial", Font.BOLD, 12);

    private static void setDisplay() {
        Container c = f.getContentPane();
        c.setBackground(Color.BLACK);  
        f.setSize(216, 242);
        f.setLayout(null); 
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private static void getReader(String fileString) throws FileNotFoundException {
        File file = new File(fileString);
        Scanner reader = new Scanner(file);
        reader.hasNextLine();
        i = reader.nextInt();
        reader.close();
    }

    private static JLabel getCount() {
        JLabel count = new JLabel("" + i);
        count.setBounds(0, 0, 200, 52);
        count.setFont(myFont);
        count.setBorder(new MatteBorder(2, 2, 2, 2, Color.WHITE));
        count.setForeground(Color.WHITE);
        f.add(count);
        return count;
    }

    private static void getPlus(String fileString, JLabel count) {
        JButton plus = new JButton("+");
        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                i++;
                writeFile(i, fileString);
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
    }

    private static void getMinus(String fileString, JLabel count) {
        JButton minus = new JButton("-");
        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                i--;
                writeFile(i, fileString);
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
    }

    private static void getEh(int shinyCharm, int ms, int sw, int ob) {
        JButton eh = new JButton("End Hunt");
        eh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                if(ms == 1) {
                    if(shinyCharm == 1)
                        n = 512;
                    else
                        n = 682;
                }
                else if(sw == 1) {
                    if(shinyCharm == 1)
                        n = 683;
                    else
                        n = 1024;
                }
                else if(ob == 1) {
                    if(shinyCharm == 1)
                        n = 512;
                    else
                        n = 819;
                }
                else {
                    if(shinyCharm == 1)
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
    }

    public static void writeFile(int i, String fileString) {
        File file = new File(fileString);
        String iString = String.valueOf(i);
        file.delete();
        try {
            FileWriter writer = new FileWriter(fileString);;
            file.createNewFile();
            writer.write(iString);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e) {
    }

    public static void main(int shinyCharm, int ms, int sw, int ob, int sr, String fileString) throws IOException {
        getReader(fileString);
        setDisplay();
        JLabel count = getCount();
        getPlus(fileString, count);
        getMinus(fileString, count);
        getEh(shinyCharm, ms, sw, ob);
    }
}