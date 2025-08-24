package br.edu.ifpb.padroes.atv3.musicas.decorator;
import br.edu.ifpb.padroes.atv3.musicas.modelo.MusicaPadrao;
public class TocadorBasico  extends TocadorDecorator {
    @Override
    public void tocar(MusicaPadrao musica) {
        System.out.println("Tocando: " + musica);
    }
}
