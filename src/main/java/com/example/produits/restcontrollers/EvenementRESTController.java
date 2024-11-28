package com.example.produits.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.produits.entities.Evenement;
import com.example.produits.service.EvenementService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EvenementRESTController {

    @Autowired
    EvenementService evenementService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Evenement> getAllEvenement() {
        return evenementService.getAllEvenement();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Evenement getEvenementById(@PathVariable("id") Long id) {
        return evenementService.getEvenement(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    public Evenement createProduit(@RequestBody Evenement evenement) {
    return evenementService.saveEvenement(evenement);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public Evenement updateEvenement(@RequestBody Evenement evenement) {
    	return evenementService.updateEvenement(evenement);
    }
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteEvenement(@PathVariable("id") Long id)
    {
    evenementService.deleteEvenementById(id);
    }
    
    @RequestMapping(value="/eventgenre/{idGenre}",method = RequestMethod.GET)
    public List<Evenement> getEvenementsByGenreId(@PathVariable("idGenre") Long idGenre) {
    return evenementService.findByGenreIdGenre(idGenre);
    }

}
