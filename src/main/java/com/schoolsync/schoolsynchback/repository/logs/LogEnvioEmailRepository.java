package com.schoolsync.schoolsynchback.repository.logs;

import com.schoolsync.schoolsynchback.domain.logs.LogEnvioEmail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogEnvioEmailRepository extends MongoRepository<LogEnvioEmail, String> {
}

