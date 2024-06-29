package com.schoolsync.schoolsynchback.repository.logs;

import com.schoolsync.schoolsynchback.domain.logs.LogExclusao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogExclusaoRepository extends MongoRepository<LogExclusao, String> {
}
