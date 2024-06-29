package com.schoolsync.schoolsynchback.repository;

import com.schoolsync.schoolsynchback.domain.Mensagem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensagemRepository extends MongoRepository<Mensagem, String> {
}
