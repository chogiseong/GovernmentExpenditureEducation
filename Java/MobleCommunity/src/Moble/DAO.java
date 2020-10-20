package Moble;

import java.util.List;

public interface DAO {
	public List<StudyBoardVO> getListStudyBoard(String study_choice, String study_search);
	public boolean selectStudyBoard(String file);
	public boolean insertStudyBoard(StudyBoardVO StudyBoardVO);
	public boolean deleteStudyBoard(Long fileNo);
}
