package com.example.produits.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.produits.entities.Evenement;
import com.example.produits.entities.Genre;
import com.example.produits.repos.EvenementRepository;

@Service
public class EvenementServiceImpl implements EvenementService{
	
	@Autowired
	private EvenementRepository evenementRepository;
	
	@Override
	public Evenement saveEvenement(Evenement e) {
		return evenementRepository.save(e);
	}

	@Override
	public Evenement updateEvenement(Evenement e) {
		return evenementRepository.save(e);
	}

	@Override
	public void deleteEvenement(Evenement e) {
		evenementRepository.delete(e);
	}

	@Override
	public void deleteEvenementById(Long id) {
		evenementRepository.deleteById(id);
	}

	@Override
	public Evenement getEvenement(Long id) {
		return evenementRepository.findById(id).get();
	}

	@Override
	public List<Evenement> getAllEvenement() {
		return evenementRepository.findAll();

	}

	@Override
	public List<Evenement> findByNomEvenement(String nom) {
		return evenementRepository.findByNomEvenement(nom);
	}

	@Override
	public List<Evenement> findByNomEvenementContains(String nom) {
		return evenementRepository.findByNomEvenementContains(nom);
	}

	@Override
	public List<Evenement> findByNomPrix(String nom, Double prix) {
		
		return evenementRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Evenement> findByGenre(Genre genre) {
	
		return evenementRepository.findByGenre(genre);
	}

	@Override
	public List<Evenement> findByGenreIdGenre(Long idGenre) {
		
		return evenementRepository.findByGenreIdGenre(idGenre);
	}

	@Override
	public List<Evenement> findByOrderByNomEvenementAsc() {
		
		return evenementRepository.findByOrderByNomEvenementAsc();
	}

	@Override
	public List<Evenement> trierEvenementsNomsPrix() {
		
		return evenementRepository.trierEvenementsNomsPrix();
	}

}
