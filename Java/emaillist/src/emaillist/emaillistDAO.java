package emaillist;

import java.util.List;

public interface emaillistDAO {
	public List<emaillistVO> getList();
	public emaillistVO get(Long id);
	public boolean insert(emaillistVO emaillistVO);
	public boolean delete(Long id);
	public boolean update(emaillistVO emaillistVO);
}