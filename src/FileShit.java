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

    private static void setDisplay() {
        Container c = f.getContentPane();
        c.setBackground(Color.BLACK);  
        f.setSize(216, 192);
        f.setLayout(null); 
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private static void enterFilenameLabel() {
        JLabel filenameLabel = new JLabel("Enter Filename: ");
        filenameLabel.setBounds(0, 0, 200, 52);
        filenameLabel.setFont(myFont);
        filenameLabel.setBorder(new MatteBorder(2, 2, 2, 2, Color.WHITE));
        filenameLabel.setForeground(Color.WHITE);
        filenameLabel.setBackground(Color.BLACK);
        f.add(filenameLabel);
    }

    private static void enterFilename() {
        enterFilename = new JTextField(5);
        enterFilename.setBounds(0, 50, 200, 52);
        enterFilename.setFont(myFont);
        enterFilename.setBorder(new MatteBorder(2, 2, 2, 2, Color.WHITE));
        enterFilename.setForeground(Color.WHITE);
        enterFilename.setBackground(Color.BLACK);
        f.add(enterFilename);
    }

    private static void getEnter(int shinyCharm, int ms, int sw, int ob, int sr) {
        JButton enter = new JButton("Enter");
        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                String fileString = ("./PSC/hunts/" + enterFilename.getText() + ".txt");
                File file = new File(fileString);
                File folder = new File("./PSC/hunts");
                folder.mkdir();
                try {
                    if(file.createNewFile() == true) {
                        FileWriter writer = new FileWriter(fileString);
                        writer.write("0");
                        writer.close();
                    }
                    f.dispose();
                    new Counter();
                    Counter.main(shinyCharm, ms, sw, ob, sr, fileString);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        enter.setFocusPainted(false);
        enter.setBorder(new MatteBorder(2, 2, 2, 2, Color.WHITE));
        enter.setBounds(0, 100, 200, 52);
        enter.setFont(myFont);
        enter.setForeground(Color.WHITE);
        enter.setBackground(Color.BLACK);
        f.add(enter);
    }

    public static void main(int shinyCharm, int ms, int sw, int ob, int sr) {
        setDisplay();
        enterFilenameLabel();
        enterFilename();
        getEnter(shinyCharm, ms, sw, ob, sr);
    }

    public void actionPerformed(ActionEvent e) {
    }
}