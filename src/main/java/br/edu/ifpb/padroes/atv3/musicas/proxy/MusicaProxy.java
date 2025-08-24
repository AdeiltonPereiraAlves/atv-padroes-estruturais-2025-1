package br.edu.ifpb.padroes.atv3.musicas.proxy;

import br.edu.ifpb.padroes.atv3.musicas.modelo.MusicaPadrao;
import java.util.ArrayList;
import java.util.List;

public class MusicaProxy {
    private List<MusicaPadrao> cache = new ArrayList<>();

    public List<MusicaPadrao> getMusicas(List<MusicaPadrao> fonte) {
        if (cache.isEmpty()) {
            cache.addAll(fonte);
        }
        return cache;
    }
}
