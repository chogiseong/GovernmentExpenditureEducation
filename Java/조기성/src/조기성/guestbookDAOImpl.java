package 조기성;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class guestbookDAOImpl implements guestbookDAO {
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
	public List<guestbookVO> getList() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		//	데이터 전송을 위한 리스트
		List<guestbookVO> list = new ArrayList<>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT no, name, " +
				"password, content, reg_date FROM guestbook";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				guestbookVO guestbookVO = new guestbookVO(
						rs.getLong(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5)
						);
				list.add(guestbookVO);
			}
		} catch (SQLException e) {
			System.err.println("ERROR:" + e.getMessage());
		}
		
		return list;
	}

	@Override
	public guestbookVO get(Long id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		guestbookVO guestbookVO = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			String sql = "SELECT no, " +
					"name, password, content, reg_date " +
					"FROM guestbook " +
					"WHERE no=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				guestbookVO = new guestbookVO(
						rs.getLong(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5)
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
		return guestbookVO;
	}

	@Override
	public boolean insert(guestbookVO guestbookVO) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0;
		
		try {
			conn = getConnection();
			String sql = "INSERT INTO guestbook " +
					"VALUES(SEQ_guestbook_no.NEXTVAL, " +
					"?, ?, ?, sysdate)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, guestbookVO.getname());
			pstmt.setString(2, guestbookVO.getpassword());
			pstmt.setString(3, guestbookVO.getcontent());
			
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
	public boolean delete(Long no, String password) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int deletedCount = 0;
		
		try {
			conn = getConnection();
			String sql = "DELETE FROM guestbook WHERE no=? and password=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, no);
			pstmt.setString(2, password);
			
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
	public boolean update(guestbookVO guestbookVO) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int updatedCount = 0;
		
		try {
			conn = getConnection();
			String sql = "UPDATE guestbook SET " +
					"name=?, password=?, content=?, getreg_date=? " +
					"WHERE no=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, guestbookVO.getno());
			pstmt.setString(2, guestbookVO.getname());
			pstmt.setString(3, guestbookVO.getpassword());
			pstmt.setString(4, guestbookVO.getcontent());
			pstmt.setString(5, guestbookVO.getreg_date());
			
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
