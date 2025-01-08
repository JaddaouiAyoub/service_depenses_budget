package com.example.service_depenses_budget.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


public enum Category {
    ALIMENTATION,        // Courses alimentaires
    DIVERTISSEMENT,      // Divertissement (films, concerts, etc.)
    LOYER,               // Loyer ou paiements pour le logement
    FACTURES,            // Factures (électricité, eau, gaz)
    TRANSPORT,           // Transport (essence, transports en commun)
    SANTE,               // Soins de santé
    EDUCATION,           // Éducation (frais de scolarité, livres)
    ACHATS,              // Achats divers (vêtements, gadgets)
    VOYAGE,              // Voyages (billets d'avion, hôtels)
    RESTAURANT,          // Repas au restaurant
}

