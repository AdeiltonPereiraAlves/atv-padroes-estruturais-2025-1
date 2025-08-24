package br.edu.ifpb.padroes.atv3.musicas;



import br.edu.ifpb.padroes.atv3.musicas.facade.StreamFacade;
import br.edu.ifpb.padroes.atv3.musicas.modelo.MusicaPadrao;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StreamFacade stream = new StreamFacade();

        // Lista todas as músicas unificadas dos dois serviços
        System.out.println("=== Lista de músicas disponíveis ===");
        List<MusicaPadrao> todas = stream.listarTodasMusicas();
        todas.forEach(System.out::println);

        // Toca algumas músicas
        System.out.println("\n=== Tocando músicas ===");
        if (!todas.isEmpty()) {
            stream.tocarMusica(todas.get(0));
            stream.tocarMusica(todas.get(1));
            stream.tocarMusica(todas.get(2));
            stream.tocarMusica(todas.get(0)); // toca repetida para ver estatísticas
        }

        // Exibe estatísticas geradas pelo decorator
        System.out.println("\n=== Estatísticas de uso ===");
        stream.mostrarEstatisticas();
    }
}
