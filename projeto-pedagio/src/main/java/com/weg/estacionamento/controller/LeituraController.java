package com.weg.estacionamento.controller;

import com.weg.estacionamento.model.Leitura;
import com.weg.estacionamento.repository.LeituraRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

/**
 * Controller responsável por expor os endpoints da API relacionados às leituras de sensores do estacionamento.
 *
 * Permite consultar todas as leituras registradas e cadastrar novas leituras enviadas pelo sensor.
 *
 * @author Amanda Salvador
 * @version 1.0
 * @since 2026
 */

@Tag(name = "Leituras", description = "Endpoints responsáveis pelo gerenciamento das leituras do sensor de estacionamento")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/leituras")
public class LeituraController {

    private final LeituraRepository repository;

    /**
     * Construtor responsável pela injeção do repositório de leituras.
     *
     * @param repository repositório responsável pelo acesso aos dados da entidade Leitura
     */
    public LeituraController(LeituraRepository repository) {
        this.repository = repository;
    }

    /**
     * Lista todas as leituras registradas no sistema.
     *
     * @return lista de leituras armazenadas no banco de dados
     */
    @Operation(
            summary = "Listar leituras",
            description = "Retorna todas as leituras registradas pelos sensores de estacionamento"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Lista de leituras retornada com sucesso"),
            @ApiResponse(responseCode = "500", description = "Erro interno no servidor")
    })
    @GetMapping
    public List<Leitura> listar() {
        return repository.findAll();
    }

    /**
     * Salva uma nova leitura enviada pelo sensor no sistema.
     *
     * @param leitura objeto contendo os dados da leitura do sensor
     * @return leitura salva no banco de dados
     */
    @Operation(
            summary = "Registrar nova leitura",
            description = "Salva uma nova leitura enviada pelo sensor de estacionamento"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Leitura registrada com sucesso"),
            @ApiResponse(responseCode = "400", description = "Dados da leitura inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro interno no servidor")
    })
    @PostMapping
    public Leitura salvar(@RequestBody Leitura leitura) {
        return repository.save(leitura);
    }
}