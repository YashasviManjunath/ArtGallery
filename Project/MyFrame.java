import javax.swing.JFrame;


import java.awt.Color;

import javax.swing.ImageIcon;


public class MyFrame extends JFrame
{
    MyFrame()
    {
        this.setVisible(true);  //makes frame visible
        this.setTitle("Art Gallery");  //set the tiltle of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //exit on pressing the cross button
        this.setSize(500,500);

        ImageIcon image=new ImageIcon("Art_logo.png");  //create an ImageIcon
        this.setIconImage(image.getImage());  //to put an icon to the frame

       // frame.getContentPane().setBackground(Color.ORANGE);
       this.getContentPane().setBackground(new Color(23,45,66));

    }
    public static void main(String args[])
    {
        MyFrame fr=new MyFrame();
    }
}
