package com.example.service_depenses_budget.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PortefeuilleDTO {
    private Long id;
    private Double balance;
    private Devise devise;

}
