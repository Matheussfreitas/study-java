package collections.map.agenda;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    private Map<String, Integer> contatos;

    public AgendaContato() {
        this.contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, int telefone) {
        contatos.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!contatos.isEmpty()) {
            contatos.remove(nome);
        }
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!contatos.isEmpty()) {
            numeroPorNome = contatos.get(nome);
        }
        return numeroPorNome;
    }
}
