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
    public static Font myFont = new Font("Arial", Font.BOLD, 12);

    private static void setDisplay(Color colors[]) {
        Container c = f.getContentPane();
        c.setBackground(colors[0]);
        f.setSize(216, 242);
        f.setLayout(null); 
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private static void getReader(String fileString, Color colors[]) throws FileNotFoundException {
        File file = new File(fileString);
        Scanner reader = new Scanner(file);
        reader.hasNextLine();
        i = reader.nextInt();
        reader.close();
    }

    private static JLabel getCount(Color colors[]) {
        JLabel count = new JLabel("" + i);
        count.setBounds(0, 0, 200, 52);
        count.setFont(myFont);
        count.setBorder(new MatteBorder(2, 2, 2, 2, colors[2]));
        count.setForeground(colors[1]);
        f.add(count);
        return count;
    }

    private static void getPlus(String fileString, JLabel count, Color colors[]) {
        JButton plus = new JButton("+");
        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                i++;
                writeFile(i, fileString);
                count.setText("" + i);
            }
        });
        plus.setFocusPainted(false);
        plus.setBorder(new MatteBorder(2, 2, 2, 2, colors[2]));
        plus.setBounds(0, 50, 200, 52);
        plus.setFont(myFont);
        plus.setForeground(colors[1]);
        plus.setBackground(colors[0]);
        f.add(plus);
    }

    private static void getMinus(String fileString, JLabel count, Color colors[]) {
        JButton minus = new JButton("-");
        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                i--;
                writeFile(i, fileString);
                count.setText("" + i);
            }
        });
        minus.setFocusPainted(false);
        minus.setBorder(new MatteBorder(2, 2, 2, 2, colors[2]));
        minus.setBounds(0, 100, 200, 52);
        minus.setFont(myFont);
        minus.setForeground(colors[1]);
        minus.setBackground(colors[0]);
        f.add(minus);
    }

    private static void getEh(int n, Color colors[]) {
        JButton eh = new JButton("End Hunt");
        eh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                if(i > n)
                    eh.setText("You went " + (i - n) + " over odds!");
                else if(i < n) 
                    eh.setText("You went " + (n - i) + " under odds!");
                else
                    eh.setText("You were at odds!");
            }
        });
        eh.setFocusPainted(false);
        eh.setBorder(new MatteBorder(2, 2, 2, 2, colors[2]));
        eh.setBounds(0, 150, 200, 52);
        eh.setFont(myFont);
        eh.setForeground(colors[1]);
        eh.setBackground(colors[0]);
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

    public static void main(int n, String fileString, Color colors[]) throws IOException {
        getReader(fileString, colors);
        setDisplay(colors);
        JLabel count = getCount(colors);
        getPlus(fileString, count, colors);
        getMinus(fileString, count, colors);
        getEh(n, colors);
    }
}