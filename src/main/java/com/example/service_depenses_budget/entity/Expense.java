package com.example.service_depenses_budget.entity;

import com.example.service_depenses_budget.dto.Devise;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double amount; // Montant de la dépense

    @Enumerated(EnumType.STRING)
    private Category category;

    @Enumerated(EnumType.STRING)
    private Devise devise;

    private String description; // Description de la dépense

    private Date creationdate=new Date(); // Date de la dépense

    private Long portefeuilleId;

}
