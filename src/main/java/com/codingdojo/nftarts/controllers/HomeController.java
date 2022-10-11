package com.codingdojo.nftarts.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/nft")
	public String nft() {
		return "index.jsp";
	}

}
