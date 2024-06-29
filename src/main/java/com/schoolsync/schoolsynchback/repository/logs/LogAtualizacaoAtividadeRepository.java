package com.schoolsync.schoolsynchback.repository.logs;

import com.schoolsync.schoolsynchback.domain.logs.LogAtualizacaoAtividade;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogAtualizacaoAtividadeRepository extends MongoRepository<LogAtualizacaoAtividade, String> {
}

