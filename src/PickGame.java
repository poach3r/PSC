import java.awt.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class PickGame extends JFrame
    implements ActionListener
{
    public static Font myFont = new Font("Arial", Font.BOLD, 12);
    public static JFrame f = new JFrame("PSC");

    private static Color[] setTheme() throws FileNotFoundException {
        //File themeDirector = new File("./PSC/themes/theme.txt"); //LINUX
        File themeDirector = new File(".\\themes\\theme.txt"); //WINDOWS
        Scanner directorReader = new Scanner(themeDirector);
        String theme = directorReader.nextLine();
        directorReader.close();
        //File colorFile = new File("./PSC/themes/" + theme + ".txt"); //LINUX
        File colorFile = new File(".\\themes\\" + theme + ".txt"); //WINDOWS
        Scanner colorReader = new Scanner(colorFile);
        Color main = Color.decode(colorReader.nextLine());
        Color text = Color.decode(colorReader.nextLine());
        Color border = Color.decode(colorReader.nextLine());
        Color colorArray[] = {main, text, border};
        colorReader.close();
        return colorArray;
    }

    private static void setLayout(Color colors[]) {
        Container c = f.getContentPane();
        c.setBackground(colors[0]);
        f.setSize(216, 342);
        f.setLayout(null); 
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private static void getSV(Color colors[]) {
        JButton ms = new JButton("Scarlet/Violet");
        ms.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                f.dispose();
                PickMethodSV.main(colors);
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
    
    private static void getSWSH(Color colors[]) {
        JButton sw = new JButton("Sword/Shield");
        sw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                PickMethodSWSH.main(colors);
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

    private static void getGen4(Color colors[]) {
        JButton ob = new JButton("HGSS/DPPt");
        ob.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                f.dispose();
                PickMethodGen4.main(colors);
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

    public static void main(String[] args) throws Exception {
        Color colors[] = setTheme();
        setLayout(colors);
        getSV(colors);
        getSWSH(colors);
        getGen4(colors);
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
