package com.codingdojo.nftarts.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.codingdojo.nftarts.models.Art;
import com.codingdojo.nftarts.services.ArtService;
//import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@Autowired
	private ArtService artservice;
	
	@GetMapping("/nft")
	public String nft(Model artModel) {
		
		List<Art> arts = artservice.getAll();
		
		String artName = "Rockie Mountain Landscape";
		
		artModel.addAttribute("name", artName);
		artModel.addAttribute("arts", arts);
		
		return "index.jsp";
	}

}
