package br.edu.ifpb.padroes.atv3.cardapio;



import java.util.ArrayList;
import java.util.List;

public class Cardapio {

    private List<CardapioItem> itens = new ArrayList<>();

    public void adicionarItem(CardapioItem item) {
        itens.add(item);
    }

    public void exibirTodos() {
        System.out.println("=== Cardápio Completo ===");
        for (CardapioItem item : itens) {
            item.exibir("");
        }
    }
}
