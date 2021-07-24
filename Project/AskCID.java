import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.*;
import java.sql.*;

public class AskCID implements ActionListener
{
    JButton submi;
    JTextField artIDval;
    public static int art_ID;
    AskCID()
    {
        JLabel ent=new JLabel("Enter the ART ID of the artwork you wish to update:");
        ent.setFont(new Font("Monotype Corsiva",Font.BOLD,22));
        //ent.setSize(300, 30);
        //ent.setLocation(0, 0);
        ent.setBounds(0, 0, 500, 40);
        //ent.setLineWrap(true);

        artIDval = new JTextField();
        artIDval.setFont(new Font("Arial",Font.PLAIN,25));
        //artIDval.setSize(190, 20);
        artIDval.setBounds(120,50,200,30);

        submi=new JButton("SUBMIT");
        submi.setFont(new Font("Arial", Font.PLAIN, 15));
        //submi.setSize(100, 20);
        submi.setBounds(250, 100, 150, 30);
        submi.setFocusable(false);
        submi.addActionListener(this);

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(ent);
        frame.add(artIDval);
        frame.add(submi);
        frame.setSize(500,250);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

    }

    void conn_dbms() throws Exception
    {
        String url="jdbc:mysql://localhost:3306/project ";
        String uname="root";
        String pass="baby5325";
        Class.forName("com.mysql.jdbc.Driver") ; //helps us to load the class
        Connection con=DriverManager.getConnection(url, uname, pass);

        art_ID=Integer.parseInt(artIDval.getText());
        String query="select art_ID from artwork1 where art_ID=?";
        PreparedStatement st=con.prepareStatement(query);
        st.setInt(1,art_ID);
        ResultSet rs=st.executeQuery();

        if(rs.next()==true)
        {
            UpdateDetails up=new UpdateDetails();
        }
        else//if it is false---when that art_ID is not present in the table(basically when the entered art_ID is wrong)
        {
            JOptionPane.showMessageDialog(null,"Invalid ART ID", "Invalid ID", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==submi)
        {
            try 
            {
                conn_dbms(); 
            } 
            catch (Exception e1) 
            {
                
            }
            
        }

    }


    
}
