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
	// 도서목록 넣기
	public int insert(java.util.Map<String, Object> map) {
	return this.sqlSessionTemplate.insert("book.insert",map);
	}
	//도서목록 확인하기
	public Map<String, Object> selectDetail(Map<String, Object> map){
		return this.sqlSessionTemplate.selectOne("book.select_detail",map);
	}
	//도서목록 수정하기
	public int update(Map<String, Object> map) {
		return this.sqlSessionTemplate.update("book.update",map);
	}
	//도서목록 삭제하기
	public int delete(Map<String, Object> map) {
		return this.sqlSessionTemplate.delete("book.delete",map);
	}
	//도서목록 보기
	public List<Map<String,Object>> selectList(Map<String, Object> map){
		return this.sqlSessionTemplate.selectList("book.select_list",map);
	}
	
}

