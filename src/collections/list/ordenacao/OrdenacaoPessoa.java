package collections.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoasOrdenadas;

    public OrdenacaoPessoa() {
        this.pessoasOrdenadas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoasOrdenadas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasOrdenadasPorIdade = new ArrayList<>(pessoasOrdenadas);
        Collections.sort(pessoasOrdenadasPorIdade);
        return pessoasOrdenadasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasOrdenadasPorAltura = new ArrayList<>(pessoasOrdenadas);
        Collections.sort(pessoasOrdenadasPorAltura, new ComparatorPorAltura());
        return pessoasOrdenadasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("João", 20, 1.80);
        ordenacaoPessoa.adicionarPessoa("Maria", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("José", 30, 1.75);
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
