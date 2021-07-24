import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.*;

class AskCIDd implements ActionListener
{
    JTextField artIDfield;
    JButton submi;
    
    AskCIDd()
    {
        JLabel ent=new JLabel("Enter the ART ID of the artwork you wish to delete:");
        ent.setFont(new Font("Monotype Corsiva",Font.BOLD,22));
        //ent.setSize(300, 30);
        //ent.setLocation(0, 0);
        ent.setBounds(0, 0, 500, 40);
        //ent.setLineWrap(true);

        artIDfield=new JTextField();
        artIDfield.setFont(new Font("Arial",Font.PLAIN,25));
        //artIDval.setSize(190, 20);
        artIDfield.setBounds(120,50,200,30);


        submi=new JButton();
        submi.setFocusable(false);
        submi.setFont(new Font("Arial", Font.PLAIN, 15));
        //submi.setSize(100, 20);
        submi.setBounds(250, 100, 150, 30);
        submi.setText("SUBMIT");
        submi.addActionListener(this);

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(ent);
        frame.add(artIDfield);
        frame.add(submi);
        frame.setSize(500, 250);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    void dbms_conn()throws ClassNotFoundException, SQLException
    {
        String url="jdbc:mysql://localhost:3306/project ";
        String uname="root";
        String pass="baby5325";
        Class.forName("com.mysql.jdbc.Driver") ; //helps us to load the class
        Connection con=DriverManager.getConnection(url, uname, pass);
        

        int artID=Integer.parseInt(artIDfield.getText());
        String query="select art_id from artwork1 where art_id=?";
        PreparedStatement st=con.prepareStatement(query);
        st.setInt(1,artID);
        ResultSet rs=st.executeQuery();
        if(rs.next()==true)
        {
           int ans= JOptionPane.showConfirmDialog(null,"Are you sure you want to delete the painting details of art Id"+ artID , "Confirmation ",JOptionPane.YES_NO_OPTION);
           if(ans==0)
           {
            String query1="delete from artwork1 where art_id=?";
            PreparedStatement st1=con.prepareStatement(query1);
            st1.setInt(1, artID);
            int count1=st1.executeUpdate();
            JOptionPane.showMessageDialog(null,"Details deleted successfully","Delete successful",JOptionPane.INFORMATION_MESSAGE);

           }
            
        }

        else
        {
            JOptionPane.showMessageDialog(null,"Invalid ART ID", "Invalid ID",JOptionPane.ERROR_MESSAGE);
        }

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==submi)
        {
            try 
            {
                dbms_conn();
            } 
            catch (ClassNotFoundException | SQLException e1) 
            {
                
                
            }
        }


    }
    
}
