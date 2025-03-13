package collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    private List<Livro> livros;

    public CatalogoLivro() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String autor, String titulo, int anoPublicacao) {
        livros.add(new Livro(autor, titulo, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosEncontrados.add(l);
                }
            }
        }
        return livrosEncontrados;
    }

    public List<Livro> pesquisarPorAno(int anoInicial, int anoFinal) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosEncontrados.add(l);
                }
            }
        }
        return livrosEncontrados;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    return l;
                }
            }
        }
        return null;
    }
}
