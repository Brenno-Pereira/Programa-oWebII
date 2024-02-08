package com.example.aula2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Anotação @Controller: Pode receber requisições
@RequestMapping("/Pessoa")//Anotação @RequestMapping: para chamar pela URL(Localhost:8080/Pessoa...)
public class PessoaController {
}
