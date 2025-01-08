package com.example.service_depenses_budget.client;

import com.example.service_depenses_budget.dto.PortefeuilleDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "service-portefeuilles", url = "https://serviceportefeuilles-production.up.railway.app/api/portefeuilles")
@Component
public interface PortefeuilleClient {
    @GetMapping("/{id}")
    PortefeuilleDTO getPortefeuilleById(@PathVariable("id") Long id);

    @PutMapping("/{id}/{amount}")
    void updatePortefeuille(@PathVariable("id") Long portefeuilleId, @PathVariable("amount") Double amount);

    @PutMapping("{id}/{amount}")
    String debitPortefeuille(@PathVariable Long id, @PathVariable Double amount) ;


//    @PutMapping("/{id}/debit")
//    void debitPortefeuille(@PathVariable("id") Long portefeuilleId, @RequestParam("amount") Double amount);
}
