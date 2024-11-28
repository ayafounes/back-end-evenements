package com.example.produits.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.produits.entities.Genre;
import com.example.produits.repos.GenreRepository;

@RestController
@RequestMapping("/api/genre")
@CrossOrigin("*")

public class GenreRESTController {
	@Autowired
	GenreRepository genreRepository;
	@RequestMapping(method=RequestMethod.GET)
	public List<Genre> getAllGenres()
	{
	return genreRepository.findAll();
	}
	@RequestMapping(value="/{idGenre}",method = RequestMethod.GET)
	public Genre getGenreById(@PathVariable("idGenre") Long id) {
	return genreRepository.findById(id).get();
	}

}
