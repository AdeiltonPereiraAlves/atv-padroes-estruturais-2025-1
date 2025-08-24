package br.edu.ifpb.padroes.atv3.musicas.xpto;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class ClientHttpXPTO {

    public List<Song> getSongs() {
        try {
            URL url = new URL("http://localhost:4000/musics");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            InputStream in = conn.getInputStream();
            ObjectMapper mapper = new ObjectMapper();

            return mapper.readValue(in, new TypeReference<List<Song>>() {});
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar músicas do serviço XPTO", e);
        }
    }
}
