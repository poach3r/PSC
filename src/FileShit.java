import java.awt.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.event.*;
import java.io.*;

public class FileShit extends JFrame
    implements ActionListener
{
    public static JFrame f = new JFrame("PSC");
    public static JTextField enterFilename;
    public static String file;
    public static Font myFont = new Font("Arial", Font.BOLD, 12);

    private static void setDisplay(Color colors[]) {
        Container c = f.getContentPane();
        c.setBackground(colors[0]);
        f.setSize(216, 192);
        f.setLayout(null); 
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private static void enterFilenameLabel(Color colors[]) {
        JLabel filenameLabel = new JLabel("Enter Filename: ");
        filenameLabel.setBounds(0, 0, 200, 52);
        filenameLabel.setFont(myFont);
        filenameLabel.setBorder(new MatteBorder(2, 2, 2, 2, colors[2]));
        filenameLabel.setBackground(colors[0]);
        filenameLabel.setForeground(colors[1]);
        f.add(filenameLabel);
    }

    private static void enterFilename(Color colors[]) {
        enterFilename = new JTextField(5);
        enterFilename.setBounds(0, 50, 200, 52);
        enterFilename.setFont(myFont);
        enterFilename.setBorder(new MatteBorder(2, 2, 2, 2, colors[2]));
        enterFilename.setBackground(colors[0]);
        enterFilename.setForeground(colors[1]);
        f.add(enterFilename);
    }

    private static void getEnter(int n, Color colors[]) {
        JButton enter = new JButton("Enter");
        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                //String fileString = ("./hunts/" + enterFilename.getText() + ".txt"); //LINUX
                String fileString = (".\\hunts\\" + enterFilename.getText() + ".txt"); //WINDOWS
                File file = new File(fileString);
                try {
                    if(file.createNewFile() == true) {
                        FileWriter writer = new FileWriter(fileString);
                        writer.write("0");
                        writer.close();
                    }
                    f.dispose();
                    new Counter();
                    Counter.main(n, fileString, colors);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        enter.setFocusPainted(false);
        enter.setBorder(new MatteBorder(2, 2, 2, 2, colors[2]));
        enter.setBounds(0, 100, 200, 52);
        enter.setFont(myFont);
        enter.setBackground(colors[0]);
        enter.setForeground(colors[1]);
        f.add(enter);
    }

    public static void main(int n, Color colors[]) {
        setDisplay(colors);
        enterFilenameLabel(colors);
        enterFilename(colors);
        getEnter(n, colors);
    }

    public void actionPerformed(ActionEvent e) {
    }
}