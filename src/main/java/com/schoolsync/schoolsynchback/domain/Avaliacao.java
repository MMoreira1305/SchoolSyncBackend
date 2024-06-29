package com.schoolsync.schoolsynchback.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "avaliacao")
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Avaliacao {
    @Id
    private String id;
    private String titulo;
    private String descricao;
    private Date dataEntrega;
    private String turmaId;
    private String professorId;
    private List<Resposta> respostas;
}
