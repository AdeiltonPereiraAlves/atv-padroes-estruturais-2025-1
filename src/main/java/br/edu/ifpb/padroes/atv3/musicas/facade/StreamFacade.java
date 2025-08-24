package br.edu.ifpb.padroes.atv3.musicas.facade;


import br.edu.ifpb.padroes.atv3.musicas.adapter.MusicaABCDAdapter;
import br.edu.ifpb.padroes.atv3.musicas.adapter.MusicaXPTOAdapter;
import br.edu.ifpb.padroes.atv3.musicas.abcd.ClienteHttpABCD;
import br.edu.ifpb.padroes.atv3.musicas.xpto.ClientHttpXPTO;
import br.edu.ifpb.padroes.atv3.musicas.decorator.*;
import br.edu.ifpb.padroes.atv3.musicas.modelo.MusicaPadrao;
import br.edu.ifpb.padroes.atv3.musicas.proxy.MusicaProxy;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFacade {
    private ClienteHttpABCD clienteABCD = new ClienteHttpABCD();
    private ClientHttpXPTO clienteXPTO = new ClientHttpXPTO();
    private MusicaProxy proxy = new MusicaProxy();
    private TocadorDecorator tocador = new EstatisticasDecorator(new TocadorBasico());

    public List<MusicaPadrao> listarTodasMusicas() {
        List<MusicaPadrao> musicasABCD = clienteABCD.getMusicas().stream()
                .map(MusicaABCDAdapter::new)
                .collect(Collectors.toList());

        List<MusicaPadrao> musicasXPTO = clienteXPTO.getSongs().stream()
                .map(MusicaXPTOAdapter::new)
                .collect(Collectors.toList());

        musicasABCD.addAll(musicasXPTO);
        return proxy.getMusicas(musicasABCD);
    }

    public void tocarMusica(MusicaPadrao musica) {
        tocador.tocar(musica);
    }

    public void mostrarEstatisticas() {
        if (tocador instanceof EstatisticasDecorator stats) {
            stats.imprimirEstatisticas();
        }
    }
}
