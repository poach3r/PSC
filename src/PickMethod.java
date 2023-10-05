import java.awt.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class PickMethod extends JFrame
    implements ActionListener
{
    public static Font myFont = new Font("Arial", Font.BOLD, 12);
    public static JFrame f = new JFrame("PSC");
    public static int shinyCharm = 0;

    private static Color[] setTheme() throws FileNotFoundException {
        File themeDirector = new File(".\\themes\\theme.txt");
        Scanner directorReader = new Scanner(themeDirector);
        String theme = directorReader.nextLine();
        directorReader.close();
        File colorFile = new File(".\\themes\\" + theme + ".txt");
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

    private static void getMs(Color colors[]) {
        JButton ms = new JButton("Masuda Method");
        ms.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                f.dispose();
                new FileShit();
                FileShit.main(shinyCharm, 1, 0, 0, 0, colors);
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
    
    private static void getSw(Color colors[]) {
        JButton sw = new JButton("Sandwich");
        sw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new FileShit();
                FileShit.main(shinyCharm, 0, 1, 0, 0, colors);
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

    private static void getOb(Color colors[]) {
        JButton ob = new JButton("Outbreak");
        ob.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                f.dispose();
                new FileShit();
                FileShit.main(shinyCharm, 0, 0, 1, 0, colors);
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

    private static void getSr(Color colors[]) {
        JButton sr = new JButton("Soft Reset");
        sr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                f.dispose();
                new FileShit();
                FileShit.main(shinyCharm, 0, 0, 0, 1, colors);
            }
        });
        sr.setFocusPainted(false);
        sr.setBorder(new MatteBorder(2, 2, 2, 2, colors[2]));
        sr.setBounds(0, 200, 200, 52);
        sr.setFont(myFont);
        sr.setBackground(colors[0]);
        sr.setForeground(colors[1]);
        f.add(sr);
    }

    private static void getObsw(Color colors[]) {
        JButton obsw = new JButton("Outbreak + Sandwich");
        obsw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                f.dispose();
                new FileShit();
                FileShit.main(shinyCharm, 0, 0, 0, 0, colors);
            }
        });
        obsw.setFocusPainted(false);
        obsw.setBorder(new MatteBorder(2, 2, 2, 2, colors[2]));
        obsw.setBounds(0, 150, 200, 52);
        obsw.setFont(myFont);
        obsw.setBackground(colors[0]);
        obsw.setForeground(colors[1]);
        f.add(obsw);
    }

    private static void getSc(Color colors[]) {
        JButton sc = new JButton("Shiny Charm");
        sc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                shinyCharm = 1;
            }
        });
        sc.setFocusPainted(false);
        sc.setBorder(new MatteBorder(2, 2, 2, 2, colors[2]));
        sc.setBounds(0, 250, 200, 52);
        sc.setFont(myFont);
        sc.setBackground(colors[0]);
        sc.setForeground(colors[1]);
        f.add(sc);
    }

    public static void main(String[] args) throws Exception {
        Color colors[] = setTheme();
        setLayout(colors);
        getMs(colors);
        getSw(colors);
        getOb(colors);
        getSr(colors);
        getObsw(colors);
        getSc(colors);
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
