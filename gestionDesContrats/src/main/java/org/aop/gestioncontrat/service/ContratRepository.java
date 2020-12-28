package org.aop.gestioncontrat.service;

import org.aop.gestioncontrat.entity.Contrat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ContratRepository extends JpaRepository<Contrat, Long> {
    List<Contrat> findByCINClient(String CINClient);
}
