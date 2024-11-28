package com.example.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.produits.entities.Evenement;
import com.example.produits.entities.Genre;
import com.example.produits.repos.EvenementRepository;

@SpringBootTest
class EvenementsApplicationTests {

	@Autowired
	private EvenementRepository evenementRepository;
	@Test
	public void testCreateEvenement() {
	    Evenement evenement = new Evenement("Taylor Swift", 1000.0, new Date());
	    evenementRepository.save(evenement);
	}
	@Test
	public void testFindEvenement()
	{
	Evenement e = evenementRepository.findById(3L).get();
	System.out.println(e);
	}
	
	@Test
	public void testUpdateEvenement()
	{
	Evenement e = evenementRepository.findById(3L).get();
	e.setPrixEvenement(1000.0);
	evenementRepository.save(e);
	}
	
	@Test
	public void testDeleteEvenement()
	{
	evenementRepository.deleteById(3L);;
	}
	
	@Test
	public void testFindAllEvenement()
	{
	List<Evenement> events = evenementRepository.findAll();
	for (Evenement e : events)
	{
	System.out.println(e);
	}
	}
	
	@Test
	public void testfindByNomEvenement()
	{
	List<Evenement> events = evenementRepository.findByNomEvenement("Taylor Swift");
	for (Evenement e : events)
	{
	System.out.println(e);
	}
	}
	
	@Test
	public void testFindByNomEvenementContains ()
	{
	List<Evenement> events=evenementRepository.findByNomEvenementContains("B");
	for (Evenement e : events)
	{
	System.out.println(e);
	} }
	
	@Test
	public void testfindByNomPrix()
	{
	List<Evenement> events = evenementRepository.findByNomPrix("Bruno Mars", 2200.0);
	for (Evenement e : events)
	{
	System.out.println(e);
	}
	}
	@Test
	public void testfindByGenre()
	{
	Genre genre = new Genre();
	genre.setIdGenre(1L);
	List<Evenement> events = evenementRepository.findByGenre(genre);
	for (Evenement e : events)
	{
	System.out.println(e);
	}
	}
	
	@Test
	public void testfindByGenreIdGenre()
	{
	List<Evenement> events = evenementRepository.findByGenreIdGenre(1L);
	for (Evenement e : events)
	{
	System.out.println(e);
	}
	 }
	
	@Test
	public void testfindByOrderByNomEvenementAsc()
	{
	List<Evenement> events =
	evenementRepository.findByOrderByNomEvenementAsc();
	for (Evenement e : events)
	{
	System.out.println(e);
	}
	}
	
	@Test
	public void testTrierEvenementsNomsPrix() {
	    List<Evenement> events = evenementRepository.trierEvenementsNomsPrix();
	    for (Evenement e : events) {
	        System.out.println(e);
	    }
	}



}
