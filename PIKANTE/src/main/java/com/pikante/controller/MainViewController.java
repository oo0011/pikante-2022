package com.pikante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/main/*")
public class MainViewController {
	// 게시물 작성
	@RequestMapping(value = "/mainview", method = RequestMethod.GET)
	public void getWrite() throws Exception {

	}
}
