package collections.list.carrinhoCompras;

public class Main {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.adicionarProduto("Arroz", 10.0, 2);
        carrinho.adicionarProduto("Feijão", 8.0, 1);
        carrinho.adicionarProduto("Macarrão", 5.0, 3);
        carrinho.removerProduto("macarrão", 1);
        carrinho.exibirProdutos();
        carrinho.calcularValorTotal();
    }
}
