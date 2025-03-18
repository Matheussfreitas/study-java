package collections.map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosAgendados;

    public AgendaEventos() {
        this.eventosAgendados = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosAgendados.put(data, new Evento(nome, atracao));
    }

    public void exibirEventos() {
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventosAgendados);
        System.out.println(eventosOrdenados);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosAgendados);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().equals(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("Próximo evento: " + proximaData + " - " + proximoEvento);
                break;
            } else {
                System.out.println("Não há eventos agendados.");
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEvento(LocalDate.of(2021, 10, 10), "Show de Rock", "Banda X");
        agenda.adicionarEvento(LocalDate.of(2021, 10, 15), "Show de MPB", "Cantor Y");
        agenda.adicionarEvento(LocalDate.of(2021, 10, 20), "Show de Samba", "Grupo Z");
        agenda.exibirEventos();
        agenda.obterProximoEvento();
    }
}
