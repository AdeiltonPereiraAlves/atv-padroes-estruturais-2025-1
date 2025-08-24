package br.edu.ifpb.padroes.atv3.musicas.xpto;




import com.fasterxml.jackson.annotation.JsonProperty;

public class Song {

    @JsonProperty("id")
    private String id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("artist")
    private String artist;

    @JsonProperty("year")
    private Long year;

    @JsonProperty("genre")
    private String genre;

    // Construtor padrão necessário para Jackson
    public Song() { }

    // Construtor completo
    public Song(String id, String title, String artist, Long year, String genre) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.genre = genre;
    }

    // Getters
    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public Long getYear() { return year; }
    public String getGenre() { return genre; }

    // Setters
    public void setId(String id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setArtist(String artist) { this.artist = artist; }
    public void setYear(Long year) { this.year = year; }
    public void setGenre(String genre) { this.genre = genre; }
}
