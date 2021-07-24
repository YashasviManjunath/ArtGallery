
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.*;



class Graphlater
{
    public static void main(String args[])
    {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);

        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();
        JPanel panel4=new JPanel();
        JPanel panel5=new JPanel();
        JPanel panel6=new JPanel();
        JPanel panel7=new JPanel();
        JPanel panel8=new JPanel();
        JPanel panel9=new JPanel();
        JPanel panel10=new JPanel();

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.BLUE);
        panel3.setBackground(Color.LIGHT_GRAY);
        panel4.setBackground(Color.ORANGE);
        panel5.setBackground(Color.MAGENTA);
        panel6.setBackground(Color.DARK_GRAY);
        panel7.setBackground(Color.CYAN);
        panel8.setBackground(Color.YELLOW);
        panel9.setBackground(Color.white);
        panel10.setBackground(Color.pink);


        
        frame.setLayout(null);
        
        
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);
        frame.add(panel6);
        frame.add(panel7);
        frame.add(panel8);
        frame.add(panel9);
        frame.add(panel10);
       
         
    }
}