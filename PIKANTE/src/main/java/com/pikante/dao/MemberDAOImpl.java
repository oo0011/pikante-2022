package com.pikante.dao;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pikante.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	final Logger LOG = LogManager.getFormatterLogger(getClass());
	
	private static String namespace = "com.pikante.mappers.member";
	final String DOT = ".";
	
	@Autowired
	SqlSessionTemplate sql;
	
	// 게시물 목록 조회
	@Override
	public List<MemberVO> list() throws Exception {
		
		return sql.selectList(namespace + DOT + "list");
	}

}
