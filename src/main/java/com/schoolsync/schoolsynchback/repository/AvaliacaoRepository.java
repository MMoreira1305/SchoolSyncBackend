package com.schoolsync.schoolsynchback.repository;

import com.schoolsync.schoolsynchback.domain.Avaliacao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoRepository extends MongoRepository<Avaliacao, String> {
}
