package modelo;


import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.teste.modelo.Pessoa;

public class AssertionsTeste {
  @Test
  void validarLancamentos(){
    int[] lancamento1 = {1, 2, 3, 4, 5};
    int[] lancamento2 = {2, 4, 6, 8, 10};
    assertNotEquals(lancamento1, lancamento2);

    int[] lancamento3 = {1, 2, 3, 4, 5};
    int[] lancamento4 = {1, 2, 3, 4, 5};
    assertArrayEquals(lancamento3, lancamento4);
  }

  @Test
  void validarObjetosNulos(){
    Pessoa pessoa = null;
    assertNull(pessoa);

    Pessoa pessoa2 = new Pessoa("João", LocalDate.of(2000, 1, 1));
    assertNotNull(pessoa2);
  }

  @Test
  void validarValoresNumericos(){
    int numero1 = 10;
    int numero2 = 20;
    assertEquals(30, numero1 + numero2);

    double valor1 = 10.5;
    double valor2 = 10.5;
    assertEquals(valor1,  valor2);
  }
}
