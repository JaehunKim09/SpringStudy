package sample.spring.yse;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class BookDao {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	// ������� �ֱ�
	public int insert(java.util.Map<String, Object> map) {
	return this.sqlSessionTemplate.insert("book.insert",map);
	}
	//������� Ȯ���ϱ�
	public Map<String, Object> selectDetail(Map<String, Object> map){
		return this.sqlSessionTemplate.selectOne("book.select_detail",map);
	}
	//������� �����ϱ�
	public int update(Map<String, Object> map) {
		return this.sqlSessionTemplate.update("book.update",map);
	}
	//������� �����ϱ�
	public int delete(Map<String, Object> map) {
		return this.sqlSessionTemplate.delete("book.delete",map);
	}
	//������� ����
	public List<Map<String,Object>> selectList(Map<String, Object> map){
		return this.sqlSessionTemplate.selectList("book.select_list",map);
	}
	
}

