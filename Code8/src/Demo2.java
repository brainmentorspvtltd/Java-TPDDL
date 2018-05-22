import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Step - 1 Load a DB Driver
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Userid");
		String userid = s.next();
		System.out.println("Enter the Password");
		String pwd = s.next();
		System.out.println("Enter the Uid ");
		s.nextLine();
		String uid = s.nextLine();
		
		final String SQL = "select userid , pwd from users where"
				+ " userid=? and pwd=? and uid=?";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResourceBundle rb = ResourceBundle.getBundle("db");
		Class.forName(rb.getString("drivername"));
		System.out.println("Driver Loaded...");
		// Step - 2 Create Connection 
		// jdbc:oracle:thin:@localhost:1521:SID
// jdbc:mysql://localhost:3306/dbname
		boolean isFound = false;
		try { 
		con = DriverManager.getConnection(rb.getString("dburl"),   rb.getString("userid"), "");
        if(con!=null) {
        	System.out.println("Connection Created...");
        }
        pstmt = con.prepareStatement(SQL);
        pstmt.setString(1, userid);
        pstmt.setString(2, pwd);
        pstmt.setInt(3, Integer.parseInt(uid));
        rs = pstmt.executeQuery();
        while(rs.next()) {
        	isFound = true;
        	System.out.println("Userid is "+rs.getString("userid")+" Password is "+rs.getString("pwd"));
        }
        if(!isFound) {
        	System.out.println("No Record Found...");
        }
		}
		finally {
			if(rs!=null) {
				rs.close();
			}
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
			con.close();
			}
		}
	}

}
