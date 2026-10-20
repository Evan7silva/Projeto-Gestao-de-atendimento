package com.gestaodeatendimentos.gestao_de_atendimentos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "gestao-atendimentos";
    }
}