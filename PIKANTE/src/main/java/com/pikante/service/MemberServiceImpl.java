package com.pikante.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pikante.dao.MemberDAO;
import com.pikante.domain.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDAO dao;
	
	// 게시물 목록 조회
	@Override
	public List<MemberVO> list() throws Exception {
		
		return dao.list();
	}

}
