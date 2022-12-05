package com.pikante.service;

import java.util.List;

import com.pikante.domain.MemberVO;

public interface MemberService {
	
	// 게시물 목록 조회
	public List<MemberVO> list() throws Exception;
}
