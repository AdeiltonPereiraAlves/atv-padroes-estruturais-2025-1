package br.edu.ifpb.padroes.atv3.musicas.abcd;




import com.fasterxml.jackson.annotation.JsonProperty;

public class Musica {

    @JsonProperty("id")
    private String id;

    @JsonProperty("titulo")
    private String titulo;

    @JsonProperty("artista")
    private String artista;

    @JsonProperty("ano")
    private Long ano;

    @JsonProperty("genero")
    private String genero;

    // Construtor padrão (necessário para o Jackson)
    public Musica() { }

    // Construtor completo
    public Musica(String id, String titulo, String artista, Long ano, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.ano = ano;
        this.genero = genero;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public Long getAno() {
        return ano;
    }

    public String getGenero() {
        return genero;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setAno(Long ano) {
        this.ano = ano;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
