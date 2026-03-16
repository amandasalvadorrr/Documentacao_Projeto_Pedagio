package com.weg.estacionamento.repository;

import com.weg.estacionamento.model.Leitura;
import org.springframework.data.jpa.repository.JpaRepository;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * Repositório responsável pelas operações de acesso a dados da entidade {@link Leitura}.
 *
 * Esta interface utiliza o Spring Data JPA para fornecer automaticamente operações de persistência como salvar,
 * buscar, atualizar e remover registros da tabela correspondente à entidade Leitura no banco de dados.
 *
 * Não é necessário implementar os métodos manualmente, pois o JpaRepository já fornece implementações padrão para operações CRUD.
 *
 * @author Amanda Salvador
 * @version 1.0
 * @since 2026
 * @see Leitura
 */
@Tag(name = "Leitura Repository", description = "Repositório responsável pelo acesso aos dados de leituras no sistema de estacionamento")
public interface LeituraRepository extends JpaRepository<Leitura, Long> {
}
