package com.codingdojo.nftarts.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

	@GetMapping("/nft/new")
	public String newArt(@ModelAttribute("newArt") Art newArt) {
		return "new.jsp";
	}
	
	@PostMapping("/nft/create")
	public String createArt(@Valid @ModelAttribute("newArt") Art newArt, BindingResult results) {
		if(results.hasErrors()) {
			return "new.jsp";
		}
		artservice.createArt(newArt);
		return "redirect:/nft";
	}
	
	
}
