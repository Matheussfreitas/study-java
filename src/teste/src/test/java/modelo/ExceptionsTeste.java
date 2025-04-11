package modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.teste.modelo.Conta;
import com.teste.modelo.TransferenciaEntreContas;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456548", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));
    }
}

