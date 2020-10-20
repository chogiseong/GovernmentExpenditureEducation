package MOBLECOMMUNITY;

import java.util.List;

public interface MobleCommunityDAO {
	public List<FreeBoardVO> getList();
	public FreeBoardVO get(Long id);
	
	//전체기능 Insert
	public boolean freeInsert(FreeBoardVO FreeBoardVO);
}