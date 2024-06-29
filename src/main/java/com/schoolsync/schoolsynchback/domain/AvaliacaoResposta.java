package com.schoolsync.schoolsynchback.domain;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class AvaliacaoResposta {
    private float nota;
    private String comentario;
}
