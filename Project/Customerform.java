import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;


  
class Customerform extends JFrame implements ActionListener 
{
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel add;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
    JLabel city;
    JLabel loc;
    JLabel pin;
    JTextField cityname;
    JTextField locname;
    JTextField pinname;

  
    
    public Customerform()
    {
        setTitle("Customer Details Form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
  
        c = getContentPane();
        c.setLayout(null);
  
        title = new JLabel("Customer Details Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(400, 30);
        title.setLocation(300, 30);
        c.add(title);
  
        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);
  
        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);
  
        mno = new JLabel("Mobile");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(100, 150);
        c.add(mno);
  
        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(200, 150);
        c.add(tmno);
  
        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 200);
        c.add(gender);
  
        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 200);
        c.add(male);
  
        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 200);
        c.add(female);
  
        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);
  
        /*add = new JLabel("Address");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(100, 300);
        c.add(add);*/
        city = new JLabel("City");
        city.setFont(new Font("Arial", Font.PLAIN, 20));
        city.setSize(100, 20);
        city.setLocation(100, 250);
        c.add(city);
        
        cityname = new JTextField();
        cityname.setFont(new Font("Arial", Font.PLAIN, 15));
        cityname.setSize(190, 20);
        cityname.setLocation(200, 250);
        c.add(cityname);

        loc = new JLabel("Location");
        loc.setFont(new Font("Arial", Font.PLAIN, 20));
        loc.setSize(100, 20);
        loc.setLocation(100, 300);
        c.add(loc);
        
        locname = new JTextField();
        locname.setFont(new Font("Arial", Font.PLAIN, 15));
        locname.setSize(190, 20);
        locname.setLocation(200, 300);
        c.add(locname);

        pin = new JLabel("Pincode");
        pin.setFont(new Font("Arial", Font.PLAIN, 20));
        pin.setSize(100, 20);
        pin.setLocation(100, 350);
        c.add(pin);
        
        pinname = new JTextField();
        pinname.setFont(new Font("Arial", Font.PLAIN, 15));
        pinname.setSize(190, 20);
        pinname.setLocation(200, 350);
        c.add(pinname);
  
  
        /*tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 300);
        tadd.setLineWrap(true);
        c.add(tadd);*/
  
        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 400);
        c.add(term);
  
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);
  
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
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

    void connectdbms() throws Exception
    {
        String url="jdbc:mysql://localhost:3306/project";
        String uname="root";
        String pass="baby5325";
        Class.forName("com.mysql.jdbc.Driver") ; //helps us to load the class
        Connection con=DriverManager.getConnection(url, uname, pass);
        
        Random rand=new Random();
        int upperbound=300;
        String cust_name=tname.getText();
        int cust_id=rand.nextInt(upperbound);
        String city=cityname.getText();
        String locat=locname.getText();
        long mob=Long.parseLong(tmno.getText());
        int pin=Integer.parseInt(pinname.getText());

        
        String query="insert into customer values(?,?,?,?,?)";
        PreparedStatement sta=con.prepareStatement(query);
        sta.setString(1, cust_name);  //1st questionmark,value to be put there
        sta.setInt(2, cust_id);
        sta.setString(3, city);
        sta.setString(4, locat);
        sta.setInt(5, pin);
        int counta=sta.executeUpdate();
        System.out.println(counta+ "row/s affected");

        String query1="insert into cust_details values(?,?)";
        PreparedStatement stb=con.prepareStatement(query1);
        stb.setInt(1,cust_id);
        stb.setLong(2,mob);
        int countb=stb.executeUpdate();
        System.out.println(countb+ "row/s affected"); 

    }
  
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1;
                String data
                    = "Name : "
                      + tname.getText() + "\n"
                      + "Mobile : "
                      + tmno.getText() + "\n";
                if (male.isSelected())
                    data1 = "Gender : Male"
                            + "\n";
                else
                    data1 = "Gender : Female"
                            + "\n";
             
  
                //String data2 = "Address : " + tadd.getText();
                String data3 = "City : " + cityname.getText();
                String data4 = "Location : " + locname.getText();
                String data5 = "Pincode : " + pinname.getText();
                //tout.setText(data + data1 + data2);
                tout.setText(data + data1 + data3 +"\n"+ data4 +"\n"+ data5);
                tout.setEditable(false);
                res.setText("Registration Successful");
                try 
                {
                    connectdbms();
                } 
                catch (Exception e1) 
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
            //tadd.setText(def);
            tmno.setText(def);
            cityname.setText(def);
            locname.setText(def);
            pinname.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            resadd.setText(def);
        }
    }
}
  
// Driver Code
/*class Registration {
  
    public static void main(String[] args) throws Exception
    {
        MyFrame f = new MyFrame();
    }
}*/