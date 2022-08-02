package sample.spring.yse;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class BookDao {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public int insert(java.util.Map<String, Object> map) {
	return this.sqlSessionTemplate.insert("book.insert",map);
	}
}

