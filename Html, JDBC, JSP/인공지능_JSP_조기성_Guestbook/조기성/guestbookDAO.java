package 조기성;

import java.util.List;

public interface guestbookDAO {
	public List<guestbookVO> getList();
	public guestbookVO get(Long id);
	public boolean insert(guestbookVO guestbookVO);
	public boolean delete(Long no, String password);
	public boolean update(guestbookVO guestbookVO);
}