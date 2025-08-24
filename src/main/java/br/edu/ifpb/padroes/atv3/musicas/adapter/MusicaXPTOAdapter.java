package br.edu.ifpb.padroes.atv3.musicas.adapter;

import br.edu.ifpb.padroes.atv3.musicas.xpto.Song;
import br.edu.ifpb.padroes.atv3.musicas.modelo.MusicaPadrao;

public class MusicaXPTOAdapter extends MusicaPadrao {

    public MusicaXPTOAdapter(Song song) {
        super(song.getTitle(), song.getArtist(), song.getGenre());
    }
}
