package collections.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    private Set<Contato> contatos;

    public AgendaContato() {
        this.contatos = new HashSet<>() ;
    }

    public void adicionarContato(String nome, int telefone) {
        contatos.add(new Contato(nome, telefone));
    }

    public void exibirContatos() {
        System.out.println(contatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosEncontrados = new HashSet<>();
        for (Contato contato : contatos) {
            if (contato.getNome().startsWith(nome)) {
                contatosEncontrados.add(contato);
            }
        }
        return contatosEncontrados;
    }

    public Contato atualizarContato(String nome, int telefone) {
        Contato contato = null;
        for(Contato c : contatos) {
            if(c.getNome().equals(nome)) {
                c.setTelefone(telefone);
                contato = c;
            }
        }
        return contato;
    }

    public static void main(String[] args) {
        AgendaContato agenda = new AgendaContato();
        agenda.adicionarContato("Maria", 123456);
        agenda.adicionarContato("João", 123456);
        agenda.adicionarContato("João", 1234567);
        agenda.adicionarContato("Maria", 654321);
        agenda.adicionarContato("José", 987654);
        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("Jo"));
    }
}
