package com.weg.estacionamento.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Entidade responsável por representar uma leitura de sensor no sistema de controle de estacionamento.
 *
 * Cada registro armazena informações como a distância detectada, o status da vaga e a data e hora da leitura realizada.
 *
 * Essa entidade é mapeada para a tabela "leituras" no banco de dados.
 *
 * @author Amanda Salvador
 * @version 1.0
 * @since 2026
 */

@Getter
@Setter
@Entity
@Table(name = "leituras")
@Schema(description = "Entidade que representa uma leitura realizada por um sensor de estacionamento")
public class Leitura {

    /**
     * Identificador único da leitura.
     * Gerado automaticamente pelo banco de dados.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Identificador único da leitura", example = "1")
    private Long id;

    /**
     * Distância medida pelo sensor no momento da leitura.
     * Geralmente utilizada para determinar se a vaga está ocupada ou livre.
     */
    @Schema(description = "Distância detectada pelo sensor em centímetros", example = "35.5")
    private Float distancia;

    /**
     * Status da vaga baseado na leitura do sensor.
     * Pode indicar se a vaga está livre ou ocupada.
     */
    @Schema(description = "Status da vaga detectado pelo sensor", example = "OCUPADO")
    private String status;

    /**
     * Data e hora em que a leitura foi registrada.
     */
    @Column(name = "data_hora")
    @Schema(description = "Data e hora em que a leitura foi registrada", example = "2026-03-16T10:30:00")
    private LocalDateTime dataHora;
}