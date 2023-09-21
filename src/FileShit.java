import java.awt.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.event.*;
import java.io.*;

public class FileShit extends JFrame
    implements ActionListener
{
    JFrame f = new JFrame("PSC");
    JTextField enterFilename;
    String file;
    public void Initial(int shinycharm, int ms, int sw, int ob) {
        Container c = f.getContentPane();
        Font myFont = new Font("Arial", Font.BOLD, 12);
        c.setBackground(Color.BLACK);  

        JLabel filenameLabel = new JLabel("Enter Filename: ");
        filenameLabel.setBounds(0, 0, 200, 52);
        filenameLabel.setFont(myFont);
        filenameLabel.setBorder(new MatteBorder(2, 2, 2, 2, Color.WHITE));
        filenameLabel.setForeground(Color.WHITE);
        filenameLabel.setBackground(Color.BLACK);
        f.add(filenameLabel);

        enterFilename = new JTextField(5);
        enterFilename.setBounds(0, 50, 200, 52);
        enterFilename.setFont(myFont);
        enterFilename.setBorder(new MatteBorder(2, 2, 2, 2, Color.WHITE));
        enterFilename.setForeground(Color.WHITE);
        enterFilename.setBackground(Color.BLACK);
        f.add(enterFilename);

        JButton enter = new JButton("Enter");
        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                String fileString = (enterFilename.getText() + ".txt");
                File file = new File(fileString);
                try {
                    if(file.createNewFile() == true) {
                        FileWriter writer = new FileWriter(fileString);
                        writer.write("0");
                        writer.close();
                    }
                    f.dispose();
                    new Counter().Initial(shinycharm, 0, 1, 0, fileString);
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

        f.setSize(216, 192);
        f.setLayout(null); 
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
    }
}