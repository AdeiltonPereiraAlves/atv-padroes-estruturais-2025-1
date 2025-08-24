package br.edu.ifpb.padroes.atv3.musicas.modelo;

public class MusicaPadrao {
    private String titulo;
    private String artista;
    private String genero;

    public MusicaPadrao(String titulo, String artista, String genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return titulo + " - " + artista + " (" + genero + ")";
    }
}
