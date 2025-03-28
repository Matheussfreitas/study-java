package collections.set.convidados;

import java.util.HashSet;
import java.util.Set;

public class CatalogoConvidados {
    private Set<Convidado> convidadosSet;

    public CatalogoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigo(int codigoConvite) {
        Convidado convidadoRemover = null;
        for(Convidado c : convidadosSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoRemover);
    }

    public void contarConvidado() {
        convidadosSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        CatalogoConvidados catalogo = new CatalogoConvidados();
        catalogo.adicionarConvidado("Maria", 123456);
        catalogo.adicionarConvidado("João", 123456);
        catalogo.adicionarConvidado("Maria", 654321);
        catalogo.adicionarConvidado("José", 987654);
        catalogo.exibirConvidados();
    }
}
