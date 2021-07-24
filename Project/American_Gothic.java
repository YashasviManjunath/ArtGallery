import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;

class American_Gothic implements ActionListener
{

    
   
        JFrame frame;
        JPanel leftpanel;
        JPanel rightpanel;
        JButton button,but;
        American_Gothic()
        {
        ImageIcon img=new ImageIcon("C:\\Users\\yasha\\OneDrive\\Desktop\\Just_pics\\American_Gothic_pg.jpg");

        
        frame=new JFrame();
        leftpanel=new JPanel();
        rightpanel=new JPanel();
        button=new JButton();
        but=new JButton();

        button.setBounds(420,380,250,50);
        button.setText("Add to Cart");
        button.setFocusable(false);
        button.setFont(new Font("Berlin Sans FB",Font.BOLD,30));
        button.setBackground(Color.BLUE);
        button.setForeground(Color.BLACK);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.addActionListener(this);

        but.setBounds(420,10,250,50);
        but.setText("View Cart");
        but.setFocusable(false);
        but.setFont(new Font("Berlin Sans FB",Font.BOLD,30));
        but.setBackground(Color.GRAY);
        but.setForeground(Color.BLACK);
        but.setBorder(BorderFactory.createEtchedBorder());
        but.addActionListener(this);


        JLabel llabel=new JLabel();
        JLabel rlabel1=new JLabel();
        JLabel rlabel2=new JLabel();
        JLabel rlabel3=new JLabel();
        JLabel rlabel4=new JLabel();

        llabel.setIcon(img);
        llabel.setBounds(0,0,400,500);
        rlabel1.setLayout(null);
        rlabel2.setLayout(null);
        rlabel3.setLayout(null);
        rlabel4.setLayout(null);
        
        rlabel1.setText("Artist: Grant Wood");
       
        rlabel2.setText("Gallery: Stone Art");
        rlabel3.setText("Price: Rs.600000");
        rlabel4.setText("<HTML><b> Description: </b>It is a 1930  painting by<br> Grant Wood.He was inspired to paint this <br>American Gothic House in Eldon, Iowa,<br> along with the kind of people he fancied<br> should live in that house. It depicts<br> a farmer standing beside his daughter.<br>It is named for the house's<br> architectural style.</HTML>");
       
        rlabel1.setBounds(400,50,200,100);
        rlabel2.setBounds(400,100,200,100);
        rlabel3.setBounds(400,300,200,100);
        rlabel4.setBounds(400,150, 300,200 );
        rlabel1.setFont(new Font("Times New Roman",Font.PLAIN,20));
        rlabel2.setFont(new Font("Times New Roman",Font.PLAIN,20));
        rlabel3.setFont(new Font("Times New Roman",Font.BOLD,20));
        rlabel4.setFont(new Font("",Font.PLAIN,15));


        //leftpanel.setLayout(null);
        //rightpanel.setLayout(null);
        
        //leftpanel.setPreferredSize(new Dimension(50,50));
        //rightpanel.setPreferredSize(new Dimension(50,50));
        leftpanel.setBackground(Color.green);
       // rightpanel.setBackground(Color.red);
        leftpanel.setLayout(null);
        rightpanel.setLayout(null);
        
        rightpanel.setBounds(400,0,300,500);
        leftpanel.setBounds(0,0,400,500);

        leftpanel.add(llabel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(but);
        frame.add(button);

        frame.add(rlabel1);
        frame.add(rlabel2);
        frame.add(rlabel3);
        frame.add(rlabel4);
        
        frame.add(leftpanel);
        frame.add(rightpanel);
        
        
        
        frame.setSize(700,500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("American Gothic");
        //frame.pack();

        
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {
            Graph.painting.add("American Gothic                        ");
            Graph.price.add(600000);
            button.setEnabled(false);
        }
        if(e.getSource()==but)
        {
          Cart ca=new Cart();
        }
    }
   
}