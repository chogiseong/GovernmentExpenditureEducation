package emaillist;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class emaillistDAOlmpl implements emaillistDAO {
	private Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dburl, "webdb", "0707");
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC 드라이버 로드 실패!");
		}
		return conn;
	}
	
	@Override
	public List<emaillistVO> getList() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		//	데이터 전송을 위한 리스트
		List<emaillistVO> list = new ArrayList<>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT no, first_name, " +
				"last_name, email FROM emaillist";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				emaillistVO emaillistVO = new emaillistVO(
						rs.getLong(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4)
						);
				list.add(emaillistVO);
			}
		} catch (SQLException e) {
			System.err.println("ERROR:" + e.getMessage());
		}
		
		return list;
	}

	@Override
	public emaillistVO get(Long id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		emaillistVO emaillistVO = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			String sql = "SELECT no, " +
					"first_name, last_name, email " +
					"FROM emaillist " +
					"WHERE no=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				emaillistVO = new emaillistVO(
						rs.getLong(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4)
						);
			}
		} catch (SQLException e) {
			System.err.println("ERROR:" + e.getMessage());
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				System.err.println("ERROR:" + e.getMessage());
			}
		}
		return emaillistVO;
	}

	@Override
	public boolean insert(emaillistVO emaillistVO) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0;
		
		try {
			conn = getConnection();
			String sql = "INSERT INTO emaillist " +
					"VALUES(SEQ_emaillist_no.NEXTVAL, " +
					"?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emaillistVO.getlast_name());
			pstmt.setString(2, emaillistVO.getfirst_name());
			pstmt.setString(3, emaillistVO.getemail());
			
			insertedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.err.println("ERROR:" + e.getMessage());
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				System.err.println("ERROR:" + e.getMessage());
			}
		}
		return insertedCount == 1;
	}

	@Override
	public boolean delete(Long id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int deletedCount = 0;
		
		try {
			conn = getConnection();
			String sql = "DELETE FROM emaillist WHERE emaillist_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);
			
			deletedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.err.println("ERROR:" + e.getMessage());
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				System.err.println("ERROR:" + e.getMessage());
			}
		}
		return deletedCount == 1;
	}

	@Override
	public boolean update(emaillistVO emaillistVO) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int updatedCount = 0;
		
		try {
			conn = getConnection();
			String sql = "UPDATE emaillist SET " +
					"first_name=?, last_name=?, email=? " +
					"WHERE no=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, emaillistVO.getno());
			pstmt.setString(2, emaillistVO.getfirst_name());
			pstmt.setString(3, emaillistVO.getlast_name());
			pstmt.setString(4, emaillistVO.getemail());
			
			updatedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.err.println("ERROR:" + e.getMessage());
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				System.err.println("ERROR:" + e.getMessage());
			}
		}
		return 1 == updatedCount;
	}

}
