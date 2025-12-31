package com.diegoduarte.notificacao.controller;

import com.diegoduarte.notificacao.business.NotificacaoService;
import com.diegoduarte.notificacao.business.dto.TarefasDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/email")
public class EmailController {

    private final NotificacaoService notificacaoService;

    @PostMapping
    public ResponseEntity<Void> enviaEmail (@RequestBody TarefasDTO tarefasDTO) {
        notificacaoService.enviaEmail(tarefasDTO);
        return ResponseEntity.ok().build();
    }
}
