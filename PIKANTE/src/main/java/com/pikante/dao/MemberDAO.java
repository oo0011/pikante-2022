package com.pikante.dao;

import java.util.List;

import com.pikante.domain.MemberVO;

public interface MemberDAO {
	
	// 게시물 목록 조회
	public List<MemberVO> list() throws Exception;
}
