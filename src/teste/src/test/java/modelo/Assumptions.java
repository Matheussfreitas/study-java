package modelo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class Assumptions {
  /*Assumptions são utilizadas para verificar se o teste deve ser executado ou não, 
  dependendo de uma condição. Se a condição não for atendida, o teste é ignorado.*/
  @Test
  @EnabledOnOs(OS.LINUX)
  public void testLinux() {
    System.out.println("This test runs only on Linux");
  }
}
