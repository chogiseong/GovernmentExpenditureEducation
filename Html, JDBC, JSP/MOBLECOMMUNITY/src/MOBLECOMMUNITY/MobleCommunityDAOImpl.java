package MOBLECOMMUNITY;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MobleCommunityDAOImpl implements MobleCommunityDAO {
	private Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dburl, "Moble", "123");
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC 드라이버 로드 실패!");
		}
		return conn;
	}
	
	@Override
	public List<FreeBoardVO> getList() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		//	데이터 전송을 위한 리스트
		List<FreeBoardVO> list = new ArrayList<>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT no, password " +
				"FROM Moble";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				FreeBoardVO FreeBoardVO = new FreeBoardVO(
						rs.getLong(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5)
						);
				list.add(FreeBoardVO);
			}
		} catch (SQLException e) {
			System.err.println("ERROR:" + e.getMessage());
		}
		
		return list;
	}

	@Override
	public FreeBoardVO get(Long id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		FreeBoardVO MobleCommunityVO = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			String sql = "SELECT no, password" +
					"FROM Moble " +
					"WHERE no=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				MobleCommunityVO = new FreeBoardVO(
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
		return MobleCommunityVO;
	}
	
	@Override
	//자유게시판 insert
	public boolean freeInsert(FreeBoardVO FreeBoardVO) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0;
		
		try {
			conn = getConnection();
			String sql =
					"insert into student_freeboard" + 
					"(student_number, ?, ?, free_date)" + 
					"select free.student_number, free.free_title, free.free_text, free.free_date" + 
					"from student_freeboard free, student_table stu" + 
					"where free.student_number= stu.student_number;";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, FreeBoardVO.getFreeTitle());
			pstmt.setString(2, FreeBoardVO.getFreeContent());
			
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
}
