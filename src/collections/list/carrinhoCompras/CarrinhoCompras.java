package collections.list.carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Produto> carrinho;

    public CarrinhoCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarProduto(String nome, double preco, int quantidade) {
        this.carrinho.add(new Produto(nome, preco, quantidade));
    }

    public void removerProduto(String nome, int quantidade) {
        for (Produto p : carrinho) {
            if (p.getQuantidade() > quantidade && p.getNome().equalsIgnoreCase(nome)) {
                p.setQuantidade(p.getQuantidade() - quantidade);
                break;
            }
            if(p.getQuantidade() <= quantidade && p.getNome().equalsIgnoreCase(nome)) {
                carrinho.remove(p);
                break;
            }
        }
    }

    public void calcularValorTotal() {
        double total = 0;
        for (Produto p : carrinho) {
            total += p.getPreco() * p.getQuantidade();
        }
        System.out.println("Valor total: " + total);
    }

    public void exibirProdutos() {
        System.out.println(carrinho);
    }
}
