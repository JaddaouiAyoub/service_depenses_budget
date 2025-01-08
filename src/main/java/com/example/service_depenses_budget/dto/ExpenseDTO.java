package com.example.service_depenses_budget.dto;

import com.example.service_depenses_budget.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseDTO {
    private Long id;
    private Double amount;
    private Category category; // Référence à la catégorie
    private Devise devise;
    private String description;
    private Long portefeuilleId;
}
