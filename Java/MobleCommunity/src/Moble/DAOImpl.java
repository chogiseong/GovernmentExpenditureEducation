package Moble;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DAOImpl implements DAO {
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

	
	
	//////////////////////////////////upload시 데이터베이스에 파일 입력
	
	@Override
	public List<StudyBoardVO> getListStudyBoard(String study_choice, String study_search) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<StudyBoardVO> list = new ArrayList<>();
		
		try {
			if(study_search == null) {
				conn = getConnection();
				stmt = conn.createStatement();
				String sql = "SELECT study_fileno, study_title, study_content, study_filename, " +
						" to_char(study_date, 'YYYY\"년\" MM\"월\" DD\"일\"') " +
						" FROM studyboard " +
						" order by study_fileno desc ";
				
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					StudyBoardVO vo = new StudyBoardVO(
							rs.getLong(1),
							rs.getString(2),
							rs.getString(3),
							rs.getString(4),
							rs.getString(5)
							);
					list.add(vo);
				}
			} else {
	            conn = getConnection();         
	            String sql = "SELECT study_fileno, study_title, study_content, study_filename, "
	                    + "to_char(study_date, 'YYYY\"년\" MM\"월\" DD\"일\"') "
	                  + "FROM studentboard "
	                    + "WHERE " + study_choice + " like '%" + study_search + "%' "
	                  + "ORDER BY study_fileno desc";
	            pstmt = conn.prepareStatement(sql);
	            
	            System.out.println("쿼리 부분까지 들어옴");
	            rs = pstmt.executeQuery();
	            
	            while(rs.next()) {
	            	StudyBoardVO vo = new StudyBoardVO(
	                     rs.getLong(1),
	                     rs.getString(2),
	                     rs.getString(3),
	                     rs.getString(4),
	                     rs.getString(5)
	                     );
	               list.add(vo);
	               System.out.println("리스트에 담는것 까지 들어옴");
	            }
			}
		}catch (SQLException e) {
			System.err.println("ERROR:" + e.getMessage());
		}
		return list;
	}
	
	@Override
	public boolean selectStudyBoard(String file) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0;
		
		ResultSet rs = null;
		try {
			//sql 실행 기본키 갖고오기
			//rs에 저장
			//변수 = rs.getInt()
			
			//외래키 갖고오기
			conn = getConnection();
			String sql = "SELECT study_filename FROM studyboard WHERE study_filename= ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, file);;

			insertedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.err.println("ERROR:" + e.getMessage());
		}finally {
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
	public boolean insertStudyBoard(StudyBoardVO StudyBoardVO) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0;
		
		ResultSet rs = null;
		try {
			//sql 실행 기본키 갖고오기
			//rs에 저장
			//변수 = rs.getInt()
			
			//외래키 갖고오기
			conn = getConnection();
			String sql = "INSERT INTO studyboard " +
					" VALUES(seq_studyboard.nextval, ?, ?, ?, sysdate) ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, StudyBoardVO.getStudyTitle());
			pstmt.setString(2, StudyBoardVO.getStudyContent());
			pstmt.setString(3, StudyBoardVO.getFile());;

			insertedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.err.println("ERROR:" + e.getMessage());
		}finally {
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
	public boolean deleteStudyBoard(Long fileNo) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		int deletedCount = 0;
		
		try {
			conn = getConnection();
			String sql = "DELETE FROM studyboard WHERE study_fileNo = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, fileNo);
		
			
			
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
	
	
}