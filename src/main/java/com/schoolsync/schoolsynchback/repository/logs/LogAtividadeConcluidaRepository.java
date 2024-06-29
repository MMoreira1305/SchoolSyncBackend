package com.schoolsync.schoolsynchback.repository.logs;

import com.schoolsync.schoolsynchback.domain.logs.LogAtividadeConcluida;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogAtividadeConcluidaRepository extends MongoRepository<LogAtividadeConcluida, String> {
}
