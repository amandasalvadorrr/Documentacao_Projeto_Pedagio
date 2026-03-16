package com.weg.estacionamento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * Controller responsável pelo carregamento das páginas da interface web do sistema de estacionamento.
 *
 * Este controller é utilizado para redirecionar o usuário para a página principal da aplicação.
 *
 * @author Amanda Salvador
 * @version 1.0
 * @since 2026
 */

@Tag(name = "Páginas", description = "Controller responsável pelo carregamento das páginas da aplicação")
@Controller
public class PageController {

    /**
     * Abre a página principal da aplicação.
     *
     * @return retorna a página "index" localizada na pasta de templates
     */
    @Operation(
            summary = "Abrir página inicial",
            description = "Carrega a página principal do sistema de estacionamento"
    )
    @GetMapping("/")
    public String abrirPagina() {
        return "index";
    }
}