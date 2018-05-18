package com.sustentacao.sustentacao.repository;

import com.sustentacao.sustentacao.model.MpComponente;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.CrudRepository;

public interface MpComponenteRepository extends CrudRepository<MpComponente, Long> {

    Iterable<MpComponente> findBycpNomeIgnoreCaseContaining(String place);
}