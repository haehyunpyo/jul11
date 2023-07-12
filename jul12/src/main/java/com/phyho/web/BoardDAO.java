package com.phyho.web;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
/* 
	@Controller	== Controller
	@Service	== Service
	@Repository == DAO

*/
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {
	// DB랑 연결할겁니다.
	@Autowired
	private SqlSession sqlSession;
}
