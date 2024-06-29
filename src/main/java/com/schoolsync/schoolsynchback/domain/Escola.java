package com.schoolsync.schoolsynchback.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "escola")
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Escola {
    @Id
    private String id;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String diretorId;
}
