import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Demo3 {

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
		
		final String SQL = "insert into users (userid,pwd,uid) values(?,?,?)";
		Connection con = null;
		PreparedStatement pstmt = null;
		//ResultSet rs = null;
		ResourceBundle rb = ResourceBundle.getBundle("db");
		Class.forName(rb.getString("drivername"));
		System.out.println("Driver Loaded...");
		// Step - 2 Create Connection 
		// jdbc:oracle:thin:@localhost:1521:SID
// jdbc:mysql://localhost:3306/dbname
		boolean isFound = false;
		try { 
		con = DriverManager.getConnection(rb.getString("dburl"),   rb.getString("userid"), "");
        con.setAutoCommit(false);
		if(con!=null) {
        	System.out.println("Connection Created...");
        }
        pstmt = con.prepareStatement(SQL);
        //pstmt.add
        pstmt.setString(1, userid);
        pstmt.setString(2, pwd);
        
        pstmt.setInt(3, Integer.parseInt(uid));
        int records = pstmt.executeUpdate();
        if(records>0) {
        //if(records>0 && record2>0 && record3>0) {
        	con.commit();
        	System.out.println("Record Updated..."+records);
        }
        else {
        	con.rollback();
        	System.out.println("Not Updated...");
        }

		}
		finally {
//			if(rs!=null) {
//				rs.close();
//			}
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
			con.close();
			}
		}
	}

}
