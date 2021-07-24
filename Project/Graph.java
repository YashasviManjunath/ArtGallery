import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.util.ArrayList;

public class Graph implements ActionListener
{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    
    public static ArrayList<String> painting=new ArrayList<String>();
    public static ArrayList<Integer> price=new ArrayList<Integer>();
    Graph()
    {
        ImageIcon icon1=new ImageIcon("C:\\Users\\yasha\\OneDrive\\Desktop\\Just_pics\\Girl_f.jpg");
        ImageIcon icon2=new ImageIcon("C:\\Users\\yasha\\OneDrive\\Desktop\\Just_pics\\American_Gothic_f.jpg");
        ImageIcon icon3=new ImageIcon("C:\\Users\\yasha\\OneDrive\\Desktop\\Just_pics\\The_weeping_woman_f.jpg");
        ImageIcon icon4=new ImageIcon("C:\\Users\\yasha\\OneDrive\\Desktop\\Just_pics\\Whistler's_mother_f.jpg");
        ImageIcon icon5=new ImageIcon("C:\\Users\\yasha\\OneDrive\\Desktop\\Just_pics\\THe_Starry_night_f.jpg");
        ImageIcon icon6=new ImageIcon("C:\\Users\\yasha\\OneDrive\\Desktop\\Just_pics\\GUERNICA_f.jpg");
        ImageIcon icon7=new ImageIcon("C:\\Users\\yasha\\OneDrive\\Desktop\\Just_pics\\Wanderer_above_the_sea_of_fog_f.jpg");
        ImageIcon icon8=new ImageIcon("C:\\Users\\yasha\\OneDrive\\Desktop\\Just_pics\\Marriage_of_the_virgin_f.jpg");
        ImageIcon icon9=new ImageIcon("C:\\Users\\yasha\\OneDrive\\Desktop\\Just_pics\\Sistine_Chapel_ceiling_f.jpg");
        ImageIcon icon10=new ImageIcon("C:\\Users\\yasha\\OneDrive\\Desktop\\Just_pics\\Arnolfini_f.jpg");

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(2,5,20,20));

        
        

        b1=new JButton("Girl with a Pearl earing");
        b2=new JButton("American Gothic");
        b3=new JButton("The Weeping Woman");
        b4=new JButton("Whistler's Mother");
        b5=new JButton("The Starry Night");
        b6=new JButton("Guernica");
        b7=new JButton("Wanderer above the sea of fog");
        b8=new JButton("The Marriage of the Virgin");
        b9=new JButton("Sistine Chapel ceiling");
        b10=new JButton("Arnolfini Portrait");
        

        b1.setFocusable(false);
        b2.setFocusable(false);
        b3.setFocusable(false);
        b4.setFocusable(false);
        b5.setFocusable(false);
        b6.setFocusable(false);
        b7.setFocusable(false);
        b8.setFocusable(false);
        b9.setFocusable(false);
        b10.setFocusable(false);

        b1.setIcon(icon1);
        b2.setIcon(icon2);
        b3.setIcon(icon3);
        b4.setIcon(icon4);
        b5.setIcon(icon5);
        b6.setIcon(icon6);
        b7.setIcon(icon7);
        b8.setIcon(icon8);
        b9.setIcon(icon9);
        b10.setIcon(icon10);

        b1.setVerticalTextPosition(JButton.BOTTOM);
        b1.setHorizontalTextPosition(JButton.CENTER);
        b2.setVerticalTextPosition(JButton.BOTTOM);
        b2.setHorizontalTextPosition(JButton.CENTER);
        b3.setVerticalTextPosition(JButton.BOTTOM);
        b3.setHorizontalTextPosition(JButton.CENTER);
        b4.setVerticalTextPosition(JButton.BOTTOM);
        b4.setHorizontalTextPosition(JButton.CENTER);
        b5.setVerticalTextPosition(JButton.BOTTOM);
        b5.setHorizontalTextPosition(JButton.CENTER);
        b6.setVerticalTextPosition(JButton.BOTTOM);
        b6.setHorizontalTextPosition(JButton.CENTER);
        b7.setVerticalTextPosition(JButton.BOTTOM);
        b7.setHorizontalTextPosition(JButton.CENTER);
        b8.setVerticalTextPosition(JButton.BOTTOM);
        b8.setHorizontalTextPosition(JButton.CENTER);
        b9.setVerticalTextPosition(JButton.BOTTOM);
        b9.setHorizontalTextPosition(JButton.CENTER);
        b10.setVerticalTextPosition(JButton.BOTTOM);
        b10.setHorizontalTextPosition(JButton.CENTER);

        b1.setFont(new Font("Monotype Corsiva",Font.BOLD,20));
        b2.setFont(new Font("Monotype Corsiva",Font.BOLD,20));
        b3.setFont(new Font("Monotype Corsiva",Font.BOLD,20));
        b4.setFont(new Font("Monotype Corsiva",Font.BOLD,20));
        b5.setFont(new Font("Monotype Corsiva",Font.BOLD,20));
        b6.setFont(new Font("Monotype Corsiva",Font.BOLD,20));
        b7.setFont(new Font("Monotype Corsiva",Font.BOLD,18));
        b8.setFont(new Font("Monotype Corsiva",Font.BOLD,20));
        b9.setFont(new Font("Monotype Corsiva",Font.BOLD,20));
        b10.setFont(new Font("Monotype Corsiva",Font.BOLD,20));

        //b1.setBackground(new Color(64,9,32));
        /*b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.WHITE);
        b10.setBackground(Color.BLACK);
        b10.setForeground(Color.WHITE);*/
        b1.setBackground(new Color(64,9,32));
        b1.setForeground(Color.WHITE);
        b2.setBackground(new Color(64,9,32));
        b2.setForeground(Color.WHITE);
        b3.setBackground(new Color(64,9,32));
        b3.setForeground(Color.WHITE);
        b4.setBackground(new Color(64,9,32));
        b4.setForeground(Color.WHITE);
        b5.setBackground(new Color(64,9,32));
        b5.setForeground(Color.WHITE);
        b6.setBackground(new Color(64,9,32));
        b6.setForeground(Color.WHITE);
        b7.setBackground(new Color(64,9,32));
        b7.setForeground(Color.WHITE);
        b8.setBackground(new Color(64,9,32));
        b8.setForeground(Color.WHITE);
        b9.setBackground(new Color(64,9,32));
        b9.setForeground(Color.WHITE);
        b10.setBackground(new Color(64,9,32));
        b10.setForeground(Color.WHITE);
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b10);

        
        

        /*frame.add(new JButton("1"));   //shortcut for creating and adding buttons to the frame
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));*/


        frame.setVisible(true);
        frame.setTitle("Paintings");

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            Girl girl=new Girl();
        }
        if(e.getSource()==b2)
        {
            American_Gothic amer=new American_Gothic();
        }
        if(e.getSource()==b3)
        {
            The_weeping_woman wee=new The_weeping_woman();
        }
        if(e.getSource()==b4)
        {
            Whistlers_mother whis=new Whistlers_mother();
        }
        if(e.getSource()==b5)
        {
            THe_Starry_Night star=new THe_Starry_Night();
        }
        if(e.getSource()==b6)
        {
            Guernica guer=new Guernica();
        }
        if(e.getSource()==b7)
        {
            Wanderer wan=new Wanderer();
        }
        if(e.getSource()==b8)
        {
            The_Marriage mar=new The_Marriage();
        }
        if(e.getSource()==b9)
        {
            Sistine sis=new Sistine();
        }
        if(e.getSource()==b10)
        {
            Arnolfini arno=new Arnolfini();
        }


    }

}
