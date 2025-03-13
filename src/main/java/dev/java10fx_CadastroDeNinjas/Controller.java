package dev.java10fx_CadastroDeNinjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping


public class Controller {

    @GetMapping("/boasVindas")
public String boasVindas(){

    return "Essa é a minha primeira mensagem nessa rota";
    }
}
