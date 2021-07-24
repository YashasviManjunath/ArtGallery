import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.border.Border;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
//import java.awt.image;;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.*;


public class Grac extends JFrame implements ActionListener{
    JButton button;

    Grac()
    {
    
        
        ImageIcon backimg=new ImageIcon("Backimg2_edit1.jpg");
        //Image image = backimg.getImage(); // transform it 
        //Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        //imageIcon = new ImageIcon(newimg);  // transform it back

        Border border=BorderFactory.createLineBorder(Color.PINK,3);

        button=new JButton();
        button.setBounds(200,450,250,70);
        button.setText("GET STARTED");
        button.setFocusable(false);
        button.setFont(new Font("Forte",Font.BOLD,30));
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.addActionListener(this);

        //JLabel--a GUI display area for a string of text or img
        JLabel label=new JLabel();  //create a label
        JLabel label1=new JLabel();
        label.setText("world of arts");//set text of label
        label1.setText("Welcome to the ");
        label.setIcon(backimg);
        label.setLayout(null);
        label1.setLayout(null);
        label1.setBounds(200,200,700,100);
        label1.setForeground(new Color(0, 0, 0)); 
        label.setHorizontalTextPosition(JLabel.CENTER);  
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setForeground(new Color(0, 0, 0));  //to set the color of text 
        label.setFont(new Font("Snap ITC",Font.BOLD,70));
        label1.setFont(new Font("Snap ITC",Font.BOLD,70));
        //label.setIconTextGap(-10);
        label.setBackground(Color.CYAN); //to set bg colour
        label.setOpaque(true);// to display background colour
        //label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);   //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.LEFT);   //set horizontal position of icon+text within label
        //label.setBounds(0,0,250,250);  //set x,y positions within frame
        //label.setSize(658,458);


        
        label.add(button); 
        //JFrame--a GUI window to add components to
        //JFrame frame=new JFrame();  //creates a frame
        
        this.setTitle("Art Gallery");  //set the tiltle of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //exit on pressing the cross button
        this.setSize(500,500);
        //frame.setResizable(false);
        //frame.setLayout(null);
        


        ImageIcon image=new ImageIcon("Art_logo.png");  //create an ImageIcon
        this.setIconImage(image.getImage());  //to put an icon to the frame

      // frame.getContentPane().setBackground(Color.ORANGE);
        //frame.getContentPane().setBackground(new Color(255,255,255));
        this.add(label1);
        this.add(label);
        
        
        this.setVisible(true);  //makes frame visible

        this.pack();
      
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {
            Grapc grapc=new Grapc();
        }

    }
}


class Demo
{
    public static void main(String args[]) 
    {
        
        Grac frame=new Grac();
    }

}