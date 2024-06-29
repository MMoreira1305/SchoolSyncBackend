package com.schoolsync.schoolsynchback.repository;

import com.schoolsync.schoolsynchback.domain.Escola;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscolaRepository extends MongoRepository<Escola, String> {
}
