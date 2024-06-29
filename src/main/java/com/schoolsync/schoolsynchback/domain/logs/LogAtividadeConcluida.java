package com.schoolsync.schoolsynchback.domain.logs;

import com.schoolsync.schoolsynchback.domain.details.DetalhesAtividade;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "logAtividadeConcluida")
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class LogAtividadeConcluida {
    private Date dataCriacao;
    private String usuarioId; // Professor ID
    private String acao = "Inclusão";
    private String tipo_item = "Tarefa";
    private String atividade_id;
    private String descricao;
    private DetalhesAtividade detalhes;
}
