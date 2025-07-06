import java.sql.*;
public class Demo {


    public static void main(String[] args) throws Exception {


        String url  = "jdbc:mysql://localhost:3306/jdbc";
        String uname = "root";
        String pass = "1234";


    Connection conn  = DriverManager.getConnection(url,uname,pass);

    Statement st = conn.createStatement();
    String str = "select * from employee;";




//        String str2 = "create table result(regno Integer, name varchar(20))";
//
//        st.executeUpdate(str2);
String str3 = "insert into result  values (10 , 'supreeth' )";
        st.executeUpdate(str3);


//    ResultSet res = st.executeQuery(str);
//    res.next();
//        System.out.println(res.getInt(1)+" " +res.getString(2));

    }
}
