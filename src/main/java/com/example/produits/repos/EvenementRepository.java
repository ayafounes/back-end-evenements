package com.example.produits.repos;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.produits.entities.Evenement;
import com.example.produits.entities.Genre;

@RepositoryRestResource(path = "rest")

public interface EvenementRepository extends JpaRepository<Evenement, Long> {

    List<Evenement> findByNomEvenement(String nom);
    List<Evenement> findByNomEvenementContains(String nom);
    
    @Query("select e from Evenement e where e.nomEvenement like %:nom and e.prixEvenement > :prix")
    List<Evenement> findByNomPrix(@Param("nom") String nom, @Param("prix") Double prix);
    
    @Query("select e from Evenement e where e.genre =?1")
    List<Evenement> findByGenre(Genre genre);
    @Query("select e from Evenement e where e.genre.idGenre =: idGenre")
    List<Evenement> findByGenreIdGenre(Long idGenre);
    
    List<Evenement> findByOrderByNomEvenementAsc();
    
    @Query("select e from Evenement e order by e.nomEvenement ASC, e.prixEvenement DESC")
    List<Evenement> trierEvenementsNomsPrix();
}
