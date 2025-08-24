package br.edu.ifpb.padroes.atv3.musicas.decorator;

import br.edu.ifpb.padroes.atv3.musicas.modelo.MusicaPadrao;

public abstract class TocadorDecorator {
    public abstract void tocar(MusicaPadrao musica);
}
