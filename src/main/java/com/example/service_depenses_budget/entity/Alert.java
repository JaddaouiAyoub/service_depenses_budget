package com.example.service_depenses_budget.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alert {

    private String alertMessage; // Message de l'alerte

    private LocalDate alertDate; // Date de l'alerte
    private boolean status;
}

