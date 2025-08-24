package br.edu.ifpb.padroes.atv3.musicas.adapter;

import br.edu.ifpb.padroes.atv3.musicas.abcd.Musica;
import br.edu.ifpb.padroes.atv3.musicas.modelo.MusicaPadrao;

public class MusicaABCDAdapter extends MusicaPadrao {

    public MusicaABCDAdapter(Musica musica) {
        super(musica.getTitulo(), musica.getArtista(), musica.getGenero());
    }
}
