package org.aop.gestioncontrat.controller;

import org.aop.gestioncontrat.entity.Contrat;
import org.aop.gestioncontrat.service.IContratService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContratController {

    private IContratService contratService;

    public ContratController(IContratService contratService){
        this.contratService = contratService;
    }

    @PostMapping(path = "contrats/add")
    void add(@RequestBody Contrat contrat){
        contratService.ajouterContrat(contrat);
    }

    @GetMapping(path = "contrats/getByNum/{num}")
    Optional<Contrat> getByNum(@PathVariable(name = "num") Long numeroContrat){
        return contratService.consulterContrat(numeroContrat);
    }

    @GetMapping(path = "contrats/getByCIN/{cin}")
    List<Contrat> getByCIN(@PathVariable(name = "cin") String CINClient){
        return contratService.consulterContratByCINClient(CINClient);
    }
}
