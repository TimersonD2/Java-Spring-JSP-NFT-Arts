package com.codingdojo.nftarts.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.nftarts.models.Art;
import com.codingdojo.nftarts.services.ArtService;
//import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@Autowired
	private ArtService artservice;
	
//	Get All Art
	@GetMapping("/nft")
	public String nft(Model artModel) {
		
		List<Art> arts = artservice.getAll();
		
		String artName = "Rockie Mountain Landscape";
		
		artModel.addAttribute("name", artName);
		artModel.addAttribute("arts", arts);
		
		return "index.jsp";
	}

//	Add Art
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
	
//	Update Art
	@GetMapping("/nft/edit/{id}")
	public String editArt(@PathVariable Long id, Model model) {
		Art art = artservice.getOneById(id);
		model.addAttribute("art", art);
		return "edit.jsp";
	}
	
	@PutMapping("/nft/update/{id}")
	public String updateArt(@PathVariable Long id, @Valid @ModelAttribute("art") Art art, BindingResult results) {
		if(results.hasErrors()) {
			return "edit.jsp";
		}
		artservice.updateArt(art);
		return "redirect:/nft";
	}
	
//	Delete Art
	@GetMapping("/nft/delete/{id}")
	public String deleteArt(@PathVariable Long id) {
		artservice.deleteArt(id);
		return "redirect:/nft";
	}
	
	
}
