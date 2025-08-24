package br.edu.ifpb.padroes.atv3.cardapio;



import java.util.ArrayList;
import java.util.List;

public class Combo implements CardapioItem {

    private String nome;
    private List<CardapioItem> itens;
    private double desconto; // desconto em % opcional

    public Combo(String nome) {
        this(nome, 0.0);
    }

    public Combo(String nome, double desconto) {
        this.nome = nome;
        this.itens = new ArrayList<>();
        this.desconto = desconto;
    }

    public void adicionarItem(CardapioItem item) {
        itens.add(item);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (CardapioItem item : itens) {
            total += item.getPreco();
        }
        return total * (1 - desconto / 100);
    }

    @Override
    public void exibir(String indentacao) {
        System.out.println(indentacao + nome + " - R$ " + getPreco());
        for (CardapioItem item : itens) {
            item.exibir(indentacao + "    ");
        }
    }
}
