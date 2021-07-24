import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;
  
class CuratorForm
    extends JFrame
    implements ActionListener {
  
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel gname;
    private JTextField tgname;
    private JLabel aname;
    private JTextField taname;
    private JLabel add;
    private JTextArea tadd;
    private JLabel pri;
    private JTextField tpri;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
    JLabel year;
    JLabel arttype;
    JTextField yearname;
    JTextField arttypename;
  
    
    CuratorForm()
    {
        setTitle("Art Curator Form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(true);
  
        c = getContentPane();
        c.setLayout(null);
  
        title = new JLabel("Art Curator Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
  
        name = new JLabel("Painting");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);
  
        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);

        /*add = new JLabel("Details");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(100, 150);
        c.add(add);*/

        year= new JLabel("Year");
        year.setFont(new Font("Arial", Font.PLAIN, 20));
        year.setSize(100, 20);
        year.setLocation(100, 150);
        c.add(year);

        yearname = new JTextField();
        yearname.setFont(new Font("Arial", Font.PLAIN, 15));
        yearname.setSize(190, 20);
        yearname.setLocation(200, 150);
        c.add(yearname);

        arttype= new JLabel("Art Type");
        arttype.setFont(new Font("Arial", Font.PLAIN, 20));
        arttype.setSize(100, 20);
        arttype.setLocation(100, 200);
        c.add(arttype);

        arttypename = new JTextField();
        arttypename.setFont(new Font("Arial", Font.PLAIN, 15));
        arttypename.setSize(190, 20);
        arttypename.setLocation(200, 200);
        c.add(arttypename);
  
        /*tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 150);
        tadd.setLineWrap(true);
        c.add(tadd);*/

        gname = new JLabel("Art Gallery Name");
        gname.setFont(new Font("Arial", Font.PLAIN, 20));
        gname.setSize(300, 30);
        gname.setLocation(100, 250);
        c.add(gname);
  
        tgname = new JTextField();
        tgname.setFont(new Font("Arial", Font.PLAIN, 15));
        tgname.setSize(200, 20);
        tgname.setLocation(200, 290);
        c.add(tgname);

        aname = new JLabel("Name of the Artist");
        aname.setFont(new Font("Arial", Font.PLAIN, 20));
        aname.setSize(300, 30);
        aname.setLocation(100, 320);
        c.add(aname);
  
        taname = new JTextField();
        taname.setFont(new Font("Arial", Font.PLAIN, 15));
        taname.setSize(200, 20);
        taname.setLocation(200, 350);
        c.add(taname);

        pri = new JLabel("Price");
        pri.setFont(new Font("Arial", Font.PLAIN, 20));
        pri.setSize(100, 20);
        pri.setLocation(100, 380);
        c.add(pri);
  
        tpri = new JTextField();
        tpri.setFont(new Font("Arial", Font.PLAIN, 15));
        tpri.setSize(150, 20);
        tpri.setLocation(200, 410);
        c.add(tpri);
  
        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 450);
        c.add(term);
  
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 480);
        sub.addActionListener(this);
        c.add(sub);
  
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 480);
        reset.addActionListener(this);
        c.add(reset);
  
        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);
  
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        c.add(res);
  
        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);
  
        setVisible(true);
    }

    void dbms_connect()throws Exception
    {
        String url="jdbc:mysql://localhost:3306/project ";
        String uname="root";
        String pass="baby5325";
        Class.forName("com.mysql.jdbc.Driver") ; //helps us to load the class
        Connection con=DriverManager.getConnection(url, uname, pass);

        String paint_name=tname.getText();
        int paint_year=Integer.parseInt(yearname.getText());
        String art_type=arttypename.getText();
        String art_gallery=tgname.getText();
        String artist_name=taname.getText();
        int art_price=Integer.parseInt(tpri.getText());

        int gallery_id;
        int artist_id;
       
        //int upperbound=300;
        
        String query1="select name from artgallery where name=? ";
        //Statement st=con.createStatement(query1);
        PreparedStatement st1=con.prepareStatement(query1);
        st1.setString(1, art_gallery);
        ResultSet rs= st1.executeQuery();
        //System.out.println(rs.next());

        if(rs.next()==false)          //if that gallery name is'nt present in the table       
        {
            Random rand1=new Random();
            gallery_id=rand1.nextInt(200-150)+150;
            String query2="insert into artgallery(name,id) values (?,?)";
            PreparedStatement st2=con.prepareStatement(query2);
            st2.setString(1, art_gallery);
            st2.setInt(2, gallery_id); 
            int count2=st2.executeUpdate();

        } 
        else
        {
            String query10="select id,name from artgallery where name=? ";
            PreparedStatement st10=con.prepareStatement(query10);
            st10.setString(1, art_gallery);
            ResultSet rs10= st10.executeQuery();
            rs10.next();
            gallery_id =rs10.getInt("id");
        }

        int index=artist_name.indexOf(" ");     //splitting the name into firstname and lastname
        String f_name=artist_name.substring(0,index);
        String l_name=artist_name.substring(index+1);
        
        String query3="select fname,lname from artist where fname=? and lname=?";
        PreparedStatement st3=con.prepareStatement(query3);
        st3.setString(1, f_name);
        st3.setString(2, l_name);
        ResultSet rsa=st3.executeQuery(); 

        if(rsa.next()==false)          //if that artist name is'nt present in the table       
        {
            Random rand2=new Random();
            artist_id=rand2.nextInt(100-11)+11;
            String query4="insert into artist(id,fname,lname) values (?,?,?)";
            PreparedStatement st4=con.prepareStatement(query4);
            st4.setInt(1, artist_id);
            st4.setString(2, f_name);
            st4.setString(3, l_name); 
            int count4=st4.executeUpdate();
        } 
        else
        {
            String query12="select id,fname,lname from artist where fname=? and lname=?";
            PreparedStatement st12=con.prepareStatement(query12);
            st12.setString(1, f_name);
            st12.setString(2, l_name);
            ResultSet rs12=st12.executeQuery(); 
            rs12.next();
            artist_id=rs12.getInt("id");
        }

        Random rand3=new Random();
        int artwork_id=rand3.nextInt(200-120)+120;
        String query5="select year,title,g_id from artwork1 where year=? and title=? and g_id=?";
        PreparedStatement st5=con.prepareStatement(query5);
        st5.setInt(1,paint_year);
        st5.setString(2,paint_name);
        st5.setInt(3,gallery_id);
        ResultSet rsb=st5.executeQuery();

        if(rsb.next()==false)
        {
            System.out.println("YOOO");
            String query6="insert into artwork1(art_id,price,year,title,g_id) values(?,?,?,?,?)";
            PreparedStatement st6=con.prepareStatement(query6);
            st6.setInt(1, artwork_id);
            st6.setInt(2, art_price);
            st6.setInt(3, paint_year);
            st6.setString(4, paint_name);
            st6.setInt(5, gallery_id);
            int count6=st6.executeUpdate();
            System.out.println(count6);
        }

            String query7="insert into artwork2 values(?,?)";
            PreparedStatement st7=con.prepareStatement(query7);
            st7.setString(1,art_type);
            st7.setInt(2,artist_id);
            int count7=st7.executeUpdate();
            System.out.println(count7);

            String query8="insert into features values(?,?)";
            PreparedStatement st8=con.prepareStatement(query8);
            st8.setInt(1,gallery_id);
            st8.setInt(2,artist_id);
            int count8=st8.executeUpdate();
            System.out.println(count8);

            String query9="insert into artwork3 values(?,?)";
            PreparedStatement st9=con.prepareStatement(query9);
            st9.setInt(1,art_price);
            st9.setInt(2,artist_id);
            int count9=st9.executeUpdate();
            System.out.println(count9);



    }
  
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data
                    = "Painting Name : "
                      + tname.getText() + "\n"
                      
                      + "Price : "
                      + tpri.getText() + "\n";
               /* String data1 = "Details :" 
                       + tadd.getText() + "\n";*/
                    String data1="Year : " +yearname.getText()+"\n Art Type : "+arttypename.getText()+"\n";
                String data2 = "Art Gallery Name : "
                     + tgname.getText() + "\n";
                String data3 = "Name of the Artist : " 
                + taname.getText() + "\n";

                tout.setText(data + data1 +data2 +data3);
                tout.setEditable(false);
                res.setText("Details Uploaded Successfully!");
               try {
                    dbms_connect();
                    
                } catch (Exception e1) 
                {
                    
                }
                
            }
            else {
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the"
                            + " terms & conditions..");
            }
        }
  
        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
           // tadd.setText(def);
            tpri.setText(def);
            res.setText(def);
            tout.setText(def);
            arttypename.setText(def);
            yearname.setText(def);
            term.setSelected(false);
            resadd.setText(def);
            tgname.setText(def);
            taname.setText(def);
        }
    }
}
  
// Driver Code
/*class Register {
  
    public static void main(String[] args) throws Exception
    {
        Frame F = new Frame();
    }
}*/