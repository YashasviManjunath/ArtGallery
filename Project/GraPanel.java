import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;

class GraPanel 
{
    public static void main(String args[])
    {

       
        ImageIcon img=new ImageIcon("thumbs_up_edit.jpg");

        JLabel lab=new JLabel();
        lab.setIcon(img);
        lab.setVerticalAlignment(JLabel.BOTTOM);
        //lab.setHorizontalAlignment(alignment);
        lab.setBounds(0,0,75,75);

        //JPAnel--a GUI component that functions as a container to hold other objects
        JPanel rPanel=new JPanel();
        rPanel.setBackground(Color.red);
        rPanel.setBounds(0,0,250,250);
        //rPanel.setLayout(new BorderLayout());
        rPanel.setLayout(null);

        JPanel bPanel=new JPanel();
        bPanel.setBackground(Color.blue);
        bPanel.setBounds(250, 0, 250, 250);

        JPanel gPanel=new JPanel();
        gPanel.setBackground(Color.green);
        gPanel.setBounds(0, 250, 500, 250);
        gPanel.setLayout(new BorderLayout());


        JFrame frame=new JFrame();  //creates a frame
        frame.setVisible(true);  //makes frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setLayout(null);
        rPanel.add(lab);
        frame.add(rPanel);
        frame.add(bPanel);
        frame.add(gPanel);
    }

    
}
