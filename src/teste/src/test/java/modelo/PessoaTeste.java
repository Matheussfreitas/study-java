package modelo;

import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.teste.modelo.Pessoa;


public class PessoaTeste {
  @Test
  void verificarIdadeCorretamente() {
    Pessoa pessoa = new Pessoa("João", LocalDate.of(2000,1,15));
    Assertions.assertEquals(25, pessoa.getIdade());
  }

  @Test
  void verificarMaiorIdade() {
    Pessoa pessoa = new Pessoa("João", LocalDate.of(2000,1,15));
    Assertions.assertTrue(pessoa.isMaiorDeIdade());

    Pessoa jose = new Pessoa("Jose", LocalDate.of(2019,1,15));
    Assertions.assertFalse(jose.isMaiorDeIdade());
  }
}
