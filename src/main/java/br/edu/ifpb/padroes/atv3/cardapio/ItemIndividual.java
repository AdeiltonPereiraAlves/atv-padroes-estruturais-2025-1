package br.edu.ifpb.padroes.atv3.cardapio;



public class ItemIndividual implements CardapioItem {

    private String nome;
    private double preco;

    public ItemIndividual(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void exibir(String indentacao) {
        System.out.println(indentacao + nome + " - R$ " + preco);
    }
}
