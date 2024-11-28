package com.example.produits.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomEvent", types = { Evenement.class })

public interface EvenementProjection {
public String getNomEvenement();
}
