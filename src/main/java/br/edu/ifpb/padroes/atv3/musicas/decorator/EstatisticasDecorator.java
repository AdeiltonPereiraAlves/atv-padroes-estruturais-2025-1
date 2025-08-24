package br.edu.ifpb.padroes.atv3.musicas.decorator;

import br.edu.ifpb.padroes.atv3.musicas.modelo.MusicaPadrao;
import java.util.HashMap;
import java.util.Map;

public class EstatisticasDecorator extends TocadorDecorator {

    private TocadorDecorator tocador;
    private Map<String, Integer> artistas = new HashMap<>();
    private Map<String, Integer> generos = new HashMap<>();

    public EstatisticasDecorator(TocadorBasico tocador) {
        this.tocador = tocador;
    }

    @Override
    public void tocar(MusicaPadrao musica) {
        tocador.tocar(musica);

        artistas.put(musica.getArtista(), artistas.getOrDefault(musica.getArtista(), 0) + 1);
        generos.put(musica.getGenero(), generos.getOrDefault(musica.getGenero(), 0) + 1);
    }

    public void imprimirEstatisticas() {
        System.out.println("Artistas mais tocados: " + artistas);
        System.out.println("Gêneros mais tocados: " + generos);
    }
}
