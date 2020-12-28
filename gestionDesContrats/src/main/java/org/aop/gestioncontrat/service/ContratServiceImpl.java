package org.aop.gestioncontrat.service;

import org.aop.gestioncontrat.aspects.MyLog;
import org.aop.gestioncontrat.entity.Contrat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ContratServiceImpl implements IContratService {

    private ContratRepository contratRepository;

    public ContratServiceImpl(ContratRepository contratRepository){
        this.contratRepository = contratRepository;
    }

    @Override
    @MyLog
    public Contrat ajouterContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Optional<Contrat> consulterContrat(Long numeroContrat) {
        return contratRepository.findById(numeroContrat);
    }

    @Override
    public List<Contrat> consulterContratByCINClient(String CINClient) {
        return contratRepository.findByCINClient(CINClient);
    }

}
