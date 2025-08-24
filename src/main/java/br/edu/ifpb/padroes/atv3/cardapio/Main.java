package br.edu.ifpb.padroes.atv3.cardapio;



public class Main {
    public static void main(String[] args) {
        ItemIndividual prato1 = new ItemIndividual("Arroz com Feijão", 12.0);
        ItemIndividual bebida1 = new ItemIndividual("Suco de Laranja", 5.0);
        ItemIndividual sobremesa1 = new ItemIndividual("Pudim", 7.0);

        Combo combo1 = new Combo("Combo Básico", 10); // 10% de desconto
        combo1.adicionarItem(prato1);
        combo1.adicionarItem(bebida1);

        Combo megaCombo = new Combo("Mega Combo Família", 15); // 15% de desconto
        megaCombo.adicionarItem(combo1);
        megaCombo.adicionarItem(sobremesa1);

        System.out.println("=== Cardápio ===");
        prato1.exibir("");
        bebida1.exibir("");
        sobremesa1.exibir("");
        combo1.exibir("");
        megaCombo.exibir("");
    }
}
