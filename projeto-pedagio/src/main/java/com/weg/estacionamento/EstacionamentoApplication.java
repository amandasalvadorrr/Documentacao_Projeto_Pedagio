package com.weg.estacionamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

/**
 * Classe principal responsável por inicializar a aplicação de gerenciamento de estacionamento utilizando Spring Boot.
 *
 * Esta classe configura e inicia o contexto da aplicação, permitindo que todos os componentes como controllers,
 * repositórios e entidades sejam carregados automaticamente.
 *
 * Também define as informações principais da documentação da API gerada pelo Swagger/OpenAPI.
 *
 * @author Amanda Salvador
 * @version 1.0
 * @since 2026
 */

@OpenAPIDefinition(
		info = @Info(
				title = "API de Controle de Estacionamento",
				version = "1.0",
				description = "API responsável pelo gerenciamento das leituras de sensores de estacionamento"
		)
)
@SpringBootApplication
public class EstacionamentoApplication {

	/**
	 * Metodo principal responsável por iniciar a aplicação Spring Boot.
	 *
	 * @param args argumentos de inicialização da aplicação
	 */
	public static void main(String[] args) {
		SpringApplication.run(EstacionamentoApplication.class, args);
	}

}