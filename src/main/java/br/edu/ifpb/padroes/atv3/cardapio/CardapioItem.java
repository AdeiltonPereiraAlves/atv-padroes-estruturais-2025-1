package br.edu.ifpb.padroes.atv3.cardapio;



public interface CardapioItem {
    String getNome();
    double getPreco();
    void exibir(String indentacao); // indentacao para mostrar hierarquia
}
