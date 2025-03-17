package collections.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> produtosEstoque;

    public EstoqueProduto() {
        this.produtosEstoque = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtosEstoque.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProduto() {
        System.out.println(produtosEstoque);
    }

    public Double calcularEstoqueTotal() {
        Double total = 0.0;
        if (!produtosEstoque.isEmpty()) {
            for(Produto produto : produtosEstoque.values()) {
                total += produto.getPreco() * produto.getQuantidade();
            }
        }
        return total;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!produtosEstoque.isEmpty()) {
            for(Produto produto : produtosEstoque.values()) {
                if (produto.getPreco() > maiorPreco) {
                    produtoMaisCaro = produto;
                }
            }
        }
        return produtoMaisCaro;
    }
}
