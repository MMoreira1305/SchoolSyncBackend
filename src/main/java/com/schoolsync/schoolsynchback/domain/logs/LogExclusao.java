package com.schoolsync.schoolsynchback.domain.logs;

import com.schoolsync.schoolsynchback.domain.details.DetalhesExclusao;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "logExclusao")
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class LogExclusao {
    private Date dataExclusao;
    private String usuarioId;
    private String acao = "Exclusao";
    private String tipoItem;
    private String item_id;
    private String descricao;
    private DetalhesExclusao detalhesExclusao;
}
