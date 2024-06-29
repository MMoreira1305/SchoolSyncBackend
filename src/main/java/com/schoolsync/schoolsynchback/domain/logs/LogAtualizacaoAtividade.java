package com.schoolsync.schoolsynchback.domain.logs;

import com.schoolsync.schoolsynchback.domain.details.DetalhesAtividade;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "logAtualizacaoAtividade")
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class LogAtualizacaoAtividade {
    private Date dataAtualizacao;
    private String usuarioId; // Professor ID
    private String acao = "Atualização";
    private String tipoItem = "Tarefa";
    private String atividadeId;
    private String descricao;
    private DetalhesAtividade detalhes;
}
