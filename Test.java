
import java.sql.*;  
class Test{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sharad","root","root"); 
if(con!=null)
{
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from student");  
while(rs.next())  
System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+rs.getInt(4)); 
}
con.close();  

}catch(Exception e){ System.out.println(e);}  
}  
}  