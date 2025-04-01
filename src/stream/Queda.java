package stream;

import java.util.Scanner;
import java.util.Arrays;

public class Queda {

    public static String verificarQuedaConexao(String[] velocidades) {
        boolean houveQueda = Arrays.stream(velocidades)
        .anyMatch(v -> v.equals("0"));
        
        return houveQueda ? "Queda de Conexao" : "Sem Quedas";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Verificando se houve queda de conexão
        String resultado = verificarQuedaConexao(velocidades);

        // Exibindo o resultado da verificação
        System.out.println(resultado);

        scanner.close();
    }
}