import java.sql.*;

//1.import ----java.sql
//2.load and register the driver
//3.Create connection
//4.Create statement
//5.execute the query
//6.process the results
//7.Close

public class ExampleDemo 
{
    public static void main(String args[])throws Exception
    {
       
        String url="jdbc:mysql://localhost:3306/simply ";
        String uname="root";
        String pass="baby5325";
        String query="select * from sample where name='Milana'";

        Class.forName("com.mysql.jdbc.Driver") ; //helps us to load the class
        Connection con=DriverManager.getConnection(url, uname, pass);
        Statement st=con.createStatement();
        ResultSet rs= st.executeQuery(query);  //ResultSet is capable of holding the whole table
        rs.next();
        String name=rs.getString("name");
        System.out.println(name);

        String query1="select * from sample";
        String userdata;
        ResultSet rs1= st.executeQuery(query1);
        while(rs1.next())
        {
            userdata=rs1.getInt(1)+"  "+rs1.getString(2);
            System.out.println(userdata);
        }

        String query2="insert into sample values(4,'Swasti')";
        int count=st.executeUpdate(query2);


        int user_id=5;
        String user_name="Yashasvi";
        String query3="insert into sample values (?,?)";
        PreparedStatement sta=con.prepareStatement(query3);
        sta.setInt(1, user_id);  //1st questionmark,value to be put there
        sta.setString(2, user_name);
        int count1=sta.executeUpdate();
        System.out.println(count+ "row/s affected");


        st.close();
        con.close();

    }
    
}
