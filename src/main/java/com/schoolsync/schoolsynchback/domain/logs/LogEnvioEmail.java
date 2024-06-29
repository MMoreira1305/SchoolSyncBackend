package com.schoolsync.schoolsynchback.domain.logs;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "logEnvioEmail")
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class LogEnvioEmail {
    private Date dataEnvio;
    private String usuarioId;
    private String acao = "envio_email";
    private String destinatario;
    private String assunto;
    private String conteudo;
    private String status = "enviado";
}
