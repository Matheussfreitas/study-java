package modelo;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.teste.modelo.BancoDados;
import com.teste.modelo.Pessoa;

public class ConsultarDadosTeste {
  // BeforeAll e AfterAll rodam uma vez antes e depois de todos os testes
  @BeforeAll
    static void configuraConexao() {
        BancoDados.iniciaConexao();
    }
    // BeforeEach e AfterEach rodam antes e depois de cada teste
    @BeforeEach
    void insereDadosParaTeste() {
        BancoDados.insereDados(new Pessoa("João", LocalDate.of(2000, 1, 1)));
    }

    @AfterEach
    void removeDadosDoTeste() {
        BancoDados.deletaDados(new Pessoa("João", LocalDate.of(2000, 1, 1)));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDados.fechaConexao();
    }
}

