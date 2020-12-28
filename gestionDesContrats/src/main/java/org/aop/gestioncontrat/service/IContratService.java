package org.aop.gestioncontrat.service;

import org.aop.gestioncontrat.entity.Contrat;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

public interface IContratService {
    Contrat ajouterContrat(Contrat contrat);
    Optional<Contrat> consulterContrat(Long numeroContrat);
    List<Contrat> consulterContratByCINClient(String CINClient);
}
