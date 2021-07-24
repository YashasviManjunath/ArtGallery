import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Cart implements ActionListener
{
    JButton button;

    Cart()
    {
        Integer total=0;

        JLabel label1=new JLabel();
        JLabel label2=new JLabel();
        JLabel label3=new JLabel();
        JLabel label4=new JLabel();
        JLabel label5=new JLabel();
        JLabel label6=new JLabel();
        JLabel label7=new JLabel();
        JLabel label8=new JLabel();
        JLabel label9=new JLabel();
        JLabel label10=new JLabel();
        JLabel label=new JLabel();
        JLabel label0=new JLabel();


        button=new JButton();
        button.setBounds(200,420,200,40);
        button.setText("Proceed to pay");
        button.setFocusable(false);
        button.setFont(new Font("Monotype Corsiva",Font.BOLD,30));
        button.setBackground(new Color(0X123456));
        button.setForeground(new Color(255, 255, 255));
        button.setBorder(BorderFactory.createEtchedBorder());
        button.addActionListener(this);
        

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500,600);
        frame.setTitle("CART");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        label1.setLayout(null);
        label2.setLayout(null);
        label3.setLayout(null);
        label4.setLayout(null);
        label5.setLayout(null);
        label6.setLayout(null);
        label7.setLayout(null);
        label8.setLayout(null);
        label9.setLayout(null);
        label10.setLayout(null);
        label.setLayout(null);
        label0.setLayout(null);

        label1.setFont(new Font("",Font.BOLD,15));
        label2.setFont(new Font("",Font.BOLD,15));
        label3.setFont(new Font("",Font.BOLD,15));
        label4.setFont(new Font("",Font.BOLD,15));
        label5.setFont(new Font("",Font.BOLD,15));
        label6.setFont(new Font("",Font.BOLD,15));
        label7.setFont(new Font("",Font.BOLD,15));
        label8.setFont(new Font("",Font.BOLD,15));
        label9.setFont(new Font("",Font.BOLD,15));
        label10.setFont(new Font("",Font.BOLD,15));
        label.setFont(new Font("",Font.BOLD,15));
        label0.setFont(new Font("",Font.BOLD,25));

        label.setForeground(Color.RED);

        label1.setBounds(0, 0, 500, 25);
        label2.setBounds(0, 25, 500, 50);
        label3.setBounds(0, 50, 500, 75);
        label4.setBounds(0, 75, 500, 100);
        label5.setBounds(0, 100, 500, 125);
        label6.setBounds(0, 125, 500, 150);
        label7.setBounds(0, 150, 500, 175);
        label8.setBounds(0, 175, 500, 200);
        label9.setBounds(0, 200, 500, 225);
        label10.setBounds(0, 225, 500, 250);
        label.setBounds(0, 250, 500, 275);
        label0.setBounds(150,0,400,350);

        int size=Graph.painting.size();
        if(size==0)
        {
            label0.setText("Your cart is empty");
            frame.add(label0);
        }
        if(size==1)
        {
            label1.setText(Graph.painting.get(0)+"        "+Graph.price.get(0));
            frame.add(label1);
            frame.add(label);
            frame.add(button);
        }
        if(size==2)
        {
            label1.setText(Graph.painting.get(0)+"        "+Graph.price.get(0));
            label2.setText(Graph.painting.get(1)+"        "+Graph.price.get(1));
            frame.add(label1);
            frame.add(label2);
            frame.add(label);
            frame.add(button);
        }
        if(size==3)
        {
            label1.setText(Graph.painting.get(0)+"        "+Graph.price.get(0));
            label2.setText(Graph.painting.get(1)+"        "+Graph.price.get(1));
            label3.setText(Graph.painting.get(2)+"        "+Graph.price.get(2));
            frame.add(label1);
            frame.add(label2);
            frame.add(label3);
            frame.add(label);
            frame.add(button);
        }
        if(size==4)
        {
            label1.setText(Graph.painting.get(0)+"        "+Graph.price.get(0));
            label2.setText(Graph.painting.get(1)+"        "+Graph.price.get(1));
            label3.setText(Graph.painting.get(2)+"        "+Graph.price.get(2));
            label4.setText(Graph.painting.get(3)+"        "+Graph.price.get(3));
            frame.add(label1);
            frame.add(label2);
            frame.add(label3);
            frame.add(label4);
            frame.add(label);
            frame.add(button);
        }
        if(size==5)
        {
            label1.setText(Graph.painting.get(0)+"        "+Graph.price.get(0));
            label2.setText(Graph.painting.get(1)+"        "+Graph.price.get(1));
            label3.setText(Graph.painting.get(2)+"        "+Graph.price.get(2));
            label4.setText(Graph.painting.get(3)+"        "+Graph.price.get(3));
            label5.setText(Graph.painting.get(4)+"        "+Graph.price.get(4));
            frame.add(label1);
            frame.add(label2);
            frame.add(label3);
            frame.add(label4);
            frame.add(label5);
            frame.add(label);
            frame.add(button);
        }
        if(size==6)
        {
            label1.setText(Graph.painting.get(0)+"        "+Graph.price.get(0));
            label2.setText(Graph.painting.get(1)+"        "+Graph.price.get(1));
            label3.setText(Graph.painting.get(2)+"        "+Graph.price.get(2));
            label4.setText(Graph.painting.get(3)+"        "+Graph.price.get(3));
            label5.setText(Graph.painting.get(4)+"        "+Graph.price.get(4));
            label6.setText(Graph.painting.get(5)+"        "+Graph.price.get(5));
            frame.add(label1);
            frame.add(label2);
            frame.add(label3);
            frame.add(label4);
            frame.add(label5);
            frame.add(label6);
            frame.add(label);
            frame.add(button);
        }
        if(size==7)
        {
            label1.setText(Graph.painting.get(0)+"        "+Graph.price.get(0));
            label2.setText(Graph.painting.get(1)+"        "+Graph.price.get(1));
            label3.setText(Graph.painting.get(2)+"        "+Graph.price.get(2));
            label4.setText(Graph.painting.get(3)+"        "+Graph.price.get(3));
            label5.setText(Graph.painting.get(4)+"        "+Graph.price.get(4));
            label6.setText(Graph.painting.get(5)+"        "+Graph.price.get(5));
            label7.setText(Graph.painting.get(6)+"        "+Graph.price.get(6));
            frame.add(label1);
            frame.add(label2);
            frame.add(label3);
            frame.add(label4);
            frame.add(label5);
            frame.add(label6);
            frame.add(label7);
            frame.add(label);
            frame.add(button);
        }
        if(size==8)
        {
            label1.setText(Graph.painting.get(0)+"        "+Graph.price.get(0));
            label2.setText(Graph.painting.get(1)+"        "+Graph.price.get(1));
            label3.setText(Graph.painting.get(2)+"        "+Graph.price.get(2));
            label4.setText(Graph.painting.get(3)+"        "+Graph.price.get(3));
            label5.setText(Graph.painting.get(4)+"        "+Graph.price.get(4));
            label6.setText(Graph.painting.get(5)+"        "+Graph.price.get(5));
            label7.setText(Graph.painting.get(6)+"        "+Graph.price.get(6));
            label8.setText(Graph.painting.get(7)+"        "+Graph.price.get(7));
            frame.add(label1);
            frame.add(label2);
            frame.add(label3);
            frame.add(label4);
            frame.add(label5);
            frame.add(label6);
            frame.add(label7);
            frame.add(label8);
            frame.add(label);
            frame.add(button);
        }
        if(size==9)
        {
            label1.setText(Graph.painting.get(0)+"        "+Graph.price.get(0));
            label2.setText(Graph.painting.get(1)+"        "+Graph.price.get(1));
            label3.setText(Graph.painting.get(2)+"        "+Graph.price.get(2));
            label4.setText(Graph.painting.get(3)+"        "+Graph.price.get(3));
            label5.setText(Graph.painting.get(4)+"        "+Graph.price.get(4));
            label6.setText(Graph.painting.get(5)+"        "+Graph.price.get(5));
            label7.setText(Graph.painting.get(6)+"        "+Graph.price.get(6));
            label8.setText(Graph.painting.get(7)+"        "+Graph.price.get(7));
            label9.setText(Graph.painting.get(8)+"        "+Graph.price.get(8));
            frame.add(label1);
            frame.add(label2);
            frame.add(label3);
            frame.add(label4);
            frame.add(label5);
            frame.add(label6);
            frame.add(label7);
            frame.add(label8);
            frame.add(label9);
            frame.add(label);
            frame.add(button);
        }
        if(size==10)
        {
            label1.setText(Graph.painting.get(0)+"        "+Graph.price.get(0));
            label2.setText(Graph.painting.get(1)+"        "+Graph.price.get(1));
            label3.setText(Graph.painting.get(2)+"        "+Graph.price.get(2));
            label4.setText(Graph.painting.get(3)+"        "+Graph.price.get(3));
            label5.setText(Graph.painting.get(4)+"        "+Graph.price.get(4));
            label6.setText(Graph.painting.get(5)+"        "+Graph.price.get(5));
            label7.setText(Graph.painting.get(6)+"        "+Graph.price.get(6));
            label8.setText(Graph.painting.get(7)+"        "+Graph.price.get(7));
            label9.setText(Graph.painting.get(8)+"        "+Graph.price.get(8));
            label10.setText(Graph.painting.get(9)+"        "+Graph.price.get(9));
            frame.add(label1);
            frame.add(label2);
            frame.add(label3);
            frame.add(label4);
            frame.add(label5);
            frame.add(label6);
            frame.add(label7);
            frame.add(label8);
            frame.add(label9);
            frame.add(label10);
            frame.add(label);
            frame.add(button);
        }
        Iterator<Integer> iterator=Graph.price.iterator();
        while(iterator.hasNext())
        {
            total+=iterator.next();
            
        }

        label.setText("TOTAL AMOUNT:                             "+total);
        
        
        Iterator<String> iterator1=Graph.painting.iterator();
        Iterator<Integer> iterator2=Graph.price.iterator();
        String newline="\n";
        byte nl[]=newline.getBytes();
        FileOutputStream fout;
        try 
        {
            fout=new FileOutputStream("BILL.txt");
            String titl="                BILL         ";
            byte tit[]=titl.getBytes();
            fout.write(tit);
            fout.write(nl);
            while(iterator1.hasNext())
            {
                byte p[]=iterator1.next().getBytes();
                try 
                {
                    fout.write(p);
                } 
                catch (IOException e1) 
                {
                    System.out.println("IOException has occured");
                }
                String pr=iterator2.next().toString();
                byte pri[]=pr.getBytes();
                try 
                {
                    fout.write(pri);
                    fout.write(nl);
                } 
                catch (IOException e2) {
                    
                }
                
            }
            String tot="TOTAL AMOUNT:                             "+total;
            byte tota[]=tot.getBytes();
            fout.write(tota);
            
        } 
        catch (Exception e) 
        {
            
        }
       
        

        frame.setVisible(true);
        frame.setBackground(Color.WHITE);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {
            Customerform cufo=new Customerform();
        }
    }
    
}
