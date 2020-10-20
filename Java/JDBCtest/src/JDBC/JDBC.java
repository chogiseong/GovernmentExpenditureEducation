package JDBC;

import java.sql.*;

public class JDBC {
   public static void main(String[] args) {
	   Connection conn = null;
	   PreparedStatement pstmt = null;
	   ResultSet rs =null;
      try {
         // 1. JDBC ����̹� (Oracle) �ε�
         Class.forName("oracle.jdbc.driver.OracleDriver");
         String url = "jdbc:oracle:thin:@localhost:1521:xe";
         conn = DriverManager.getConnection(url, "webdb", "0707");
         
         String query = "select author_id, author_name, author_desc" +
        		 		" from author";
         
         pstmt=conn.prepareStatement(query);
         rs=pstmt.executeQuery();
         
         while(rs.next()) {
        	 int authorID = rs.getInt("author_id");
        	 String authorName = rs.getString("author_name");
        	 String authorDesc = rs.getString("author_desc");
        	 
        	 System.out.println(authorID + "\t" + authorName + "\t" + authorDesc);
         }
         // 2. Connection ������
         
         // 3. SQL�� �غ� / ���ε� / ����
         
         // 4. ���ó��
         
      }catch(ClassNotFoundException e) {
         System.out.println("error: ����̹� �ε� ���� - " +e);
      }catch(SQLException e) {
         System.out.println("error."+e);
      }finally {
         //5.�ڿ� ����
         
         //��������� �ݾƾ� �Ѵ�.
         try {
            if(rs != null) {
               rs.close();
            }
            if(pstmt != null) {
               pstmt.close();
            }
            if(conn != null) {
               conn.close();
            }
         }catch(SQLException e) {
            System.out.println("error."+e);
         }
      }
   }
}