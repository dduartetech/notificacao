package com.diegoduarte.notificacao.business.dto;

import com.diegoduarte.notificacao.business.enums.StatusNotEnum;
import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TarefasDTO {

    private String id;
    private String emailUsuario;
    private String nomeTarefa;
    private String desc;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataEvento;
    private LocalDateTime dataAlteracao;
    private StatusNotEnum statusNotEnum;

}
