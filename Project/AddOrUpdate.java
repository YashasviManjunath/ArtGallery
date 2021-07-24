import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;

public class AddOrUpdate implements ActionListener
{

    JButton button1;
    JButton button2;
    JButton button3;

    AddOrUpdate()
    {
        ImageIcon glitters=new ImageIcon("Glitter2_e.jpg");

        button1=new JButton();
        button2=new JButton();
        button3=new JButton();

        button1.setBounds(900, 120, 300, 60);
        button1.setText("ADD  PAINTING");
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.setFocusable(false);
        button1.setFont(new Font("Jokerman",Font.ITALIC,30));
        button1.addActionListener(this);

        button2.setBounds(880, 250, 340, 60);
        button2.setText("UPDATE  DETAILS");
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setFocusable(false);
        button2.setFont(new Font("Jokerman",Font.ITALIC,30));
        button2.addActionListener(this);

        button3.setBounds(860, 380, 380, 60);
        button3.setText("DELETE  PAINTING");
        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.WHITE);
        button3.setFocusable(false);
        button3.setFont(new Font("Jokerman",Font.ITALIC,30));
        button3.addActionListener(this);

        JLabel label=new JLabel(); 
        label.setLayout(null);
        label.setIcon(glitters);
        label.add(button1);
        label.add(button2);
        label.add(button3);
        //label.setVerticalAlignment(JLabel.CENTER);   //set vertical position of icon+text within label
        //label.setHorizontalAlignment(JLabel.LEFT);
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(label);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.pack();
        

    }

    
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==button1)
        {
            CuratorForm cf=new CuratorForm();
        }
        if(e.getSource()==button2)
        {
            AskCID as=new AskCID();
        }
        if(e.getSource()==button3)
        {
            AskCIDd asd=new AskCIDd();
        }
        
        
    }
    
}
