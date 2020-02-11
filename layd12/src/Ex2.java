// เรียกดูข้อมูลใน mysql แบบตัวเดียว
import java.sql.*;
class Ex2
{
    public static void main(String[] data) throws Exception
    {
        new com.mysql.cj.jdbc.Driver();
        String url = "jdbc:mysql://localhost/icofee";
        Connection cn = DriverManager.getConnection(url, "james", "bond");
        Statement sm = cn.createStatement();
        ResultSet rs = sm.executeQuery("select * from product");
        rs.next();
        String name = rs.getString("name");
        System.out.println(name);
        rs.close(); sm.close(); cn.close();
    }
}
