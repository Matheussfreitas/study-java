package collections.list.listaTarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.obterTotalTarefas();
        listaTarefas.obterDescricaoTarefas();
    }
}
