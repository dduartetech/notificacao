package com.diegoduarte.notificacao.controller;

import com.diegoduarte.notificacao.business.EmailService;
import com.diegoduarte.notificacao.business.dto.TarefasDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/email")
public class EmailController {

    private final EmailService emailService;

    public ResponseEntity<Void> enviarEmail (@RequestBody TarefasDTO tarefasDTO) {
        emailService.enviaEmail(tarefasDTO);
        return ResponseEntity.ok().build();
    }
}
