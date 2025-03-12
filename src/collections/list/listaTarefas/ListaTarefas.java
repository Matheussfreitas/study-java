package collections.list.listaTarefas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listTarefas;

    public ListaTarefas() {
        this.listTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String description) {
        listTarefas.add(new Tarefa(description));
    }

    public void removerTarefa(String description) {
        List<Tarefa> tarefasARemover = new ArrayList<>();
        for (Tarefa t : listTarefas) {
            if(t.getDescription().equalsIgnoreCase(description)) {
                tarefasARemover.add(t);
            }
        }
        listTarefas.removeAll(tarefasARemover);
    }

    public int obterTotalTarefas() {
        return listTarefas.size();
    }

    public void obterDescricaoTarefas() {
        System.out.println("Tarefas: " + listTarefas);
    }
}
