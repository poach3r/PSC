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
                file = enterFilename.getText();
                File myObj = new File(enterFilename.getText());
                try {
                    if (myObj.createNewFile()) {
                        System.out.println("File created: " + myObj.getName());
                    } 
                    else {
                         System.out.println("File already exists.");
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                try (FileReader test = new FileReader(file)) {
                    BufferedReader br = new BufferedReader(test);
                    int value = Integer.parseInt(br.readLine());
                    new Counter().Initial(shinycharm, 0, 1, 0);
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