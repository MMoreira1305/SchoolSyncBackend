package com.schoolsync.schoolsynchback.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "mensagem")
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Mensagem {
    private String id;
    private String remetenteId;
    private List<String> destinatariosId;
    private String assunto;
    private String conteudo;
    private Date dataEnvio;
    private String tipo;
}
