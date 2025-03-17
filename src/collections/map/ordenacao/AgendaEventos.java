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
}
