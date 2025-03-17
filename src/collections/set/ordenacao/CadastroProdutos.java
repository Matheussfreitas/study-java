package collections.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtosCadastrados;

    public CadastroProdutos() {
        this.produtosCadastrados = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        this.produtosCadastrados.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosOrdenadosPorNome = new TreeSet<>(produtosCadastrados);
        return produtosOrdenadosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosOrdenadosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosOrdenadosPorPreco.addAll(produtosCadastrados);
        return produtosOrdenadosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();
        cadastro.adicionarProduto(1, "Produto 5", 100.0, 10);
        cadastro.adicionarProduto(2, "Produto 2", 1100.0, 20);
        cadastro.adicionarProduto(2, "Produto 3", 300.0, 30);
        cadastro.adicionarProduto(4, "Produto 4", 400.0, 40);
        cadastro.adicionarProduto(5, "Produto 1", 500.0, 50);

        System.out.println(cadastro.exibirProdutosPorNome());
        System.out.println(cadastro.exibirProdutosPorPreco());
    }
}
