package com.schoolsync.schoolsynchback.repository;

import com.schoolsync.schoolsynchback.domain.Resposta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespostaRepository extends MongoRepository<Resposta, String> {
}
