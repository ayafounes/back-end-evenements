package com.example.produits.service;

import java.util.List;

import com.example.produits.entities.Evenement;
import com.example.produits.entities.Genre;

public interface EvenementService {
	Evenement saveEvenement(Evenement e);
	Evenement updateEvenement(Evenement e);
	void deleteEvenement(Evenement e);
	void deleteEvenementById(Long id);
	Evenement getEvenement(Long id);
	List<Evenement> getAllEvenement();
	List<Evenement> findByNomEvenement(String nom);
	List<Evenement> findByNomEvenementContains(String nom);
	List<Evenement> findByNomPrix (String nom, Double prix);
	List<Evenement> findByGenre (Genre genre);
	List<Evenement> findByGenreIdGenre(Long idGenre);
	List<Evenement> findByOrderByNomEvenementAsc();
	List<Evenement> trierEvenementsNomsPrix();
}
