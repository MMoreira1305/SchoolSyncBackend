package com.schoolsync.schoolsynchback.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "resposta")
public class Resposta {
    private String alunoId;
    private String resposta;
    private Date dataEnvio;
    private AvaliacaoResposta avaliacao;
}
