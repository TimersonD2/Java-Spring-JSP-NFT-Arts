package com.codingdojo.nftarts.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.nftarts.models.Art;
import com.codingdojo.nftarts.repositories.ArtRepository;

@Service
public class ArtService {
	
	@Autowired
	private ArtRepository artRepo;
	
//	Find all Art
	public List<Art> getAll() {
		//	Business Logic
		return artRepo.findAll();
	}
		
//	Find one Art
	
//	Create Art
	public void createArt(Art art) {
		artRepo.save(art);
	}
	
//	Update Art
	
//	Delete Art

}
