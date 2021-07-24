import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;


class Grap
{
    public static void main(String args[])
    {

       
       // Border border=BorderFactory.createLineBorder(Color.WHITE,5);
        Border border1=BorderFactory.createMatteBorder(0, 10, 20, 20, Color.WHITE);
        Border border2=BorderFactory.createMatteBorder(0, 20, 20, 10, Color.WHITE);
        ImageIcon curimg=new ImageIcon("cur4_ee1.jpg");

        JLabel llabel=new JLabel();
        llabel.setIcon(curimg);
        llabel.setBounds(0, 0, 683, 768);
        //llabel.setVerticalAlignment(JLabel.TOP);
        llabel.setBorder(border1);

        JPanel leftpanel=new JPanel();
        //leftpanel.setBackground(Color.red);
        leftpanel.setBounds(0,0,683,768);
        leftpanel.setLayout(null);
        

        ImageIcon custimg=new ImageIcon("cust2__eee2.jpg");
        
        JLabel rlabel=new JLabel();
        rlabel.setIcon(custimg);
        //rlabel.setVerticalAlignment(JLabel.TOP);
        rlabel.setBounds(683, 0, 683, 768);
        rlabel.setBorder(border2);

        JPanel rightpanel=new JPanel();
        rightpanel.setBackground(Color.green);
        rightpanel.setBounds(683,0,683,768);
        rightpanel.setLayout(null);
        

        JButton button1=new JButton();
        button1.setBounds(200,100,250,50);
        button1.setText("ART CURATOR");
        button1.setFocusable(false);
        button1.setFont(new Font("Forte",Font.BOLD,30));
        button1.setBackground(Color.CYAN);
        button1.setBorder(BorderFactory.createEtchedBorder());

        JButton button2=new JButton();
        button2.setBounds(950,100,200,50);
        button2.setText("CUSTOMER");
        button2.setFocusable(false);
        button2.setFont(new Font("Forte",Font.BOLD,30));
        button2.setBackground(Color.CYAN);

        JFrame frame=new JFrame();  //creates a frame
        frame.setVisible(true);  //makes frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       // frame.setLayout(null);
        leftpanel.add(llabel);
        rightpanel.add(rlabel);
     
        frame.add(button1);
        frame.add(button2);
        frame.add(leftpanel);
        frame.add(rightpanel);
        //frame.setSize(250,250);
        

       
        frame.pack();
    

    }
}
