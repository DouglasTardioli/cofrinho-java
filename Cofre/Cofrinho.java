package Cofre;

import java.util.ArrayList;

//class de controle dos metodos
public class Cofrinho {
    ArrayList<Moeda> listaMoeda = new ArrayList<Moeda>();

    // Adicionar Moedas
    public void adicionar(Moeda m) {
        listaMoeda.add(m);
    }

    // Remover Moedas
    public void remover(Moeda m) {
        listaMoeda.remove(m);
    }

    // Listar Moedas
    public void listar() {
        // Listar estiver vazio, mostrar mensagem
        if (listaMoeda.isEmpty()) {
            System.out.println("-------------*-------------");
            System.out.println("Não há nada no cofrinho!");
            System.out.println("Adicione já!");
            System.out.println("-------------*-------------");
        } else {
            // Listar estiver com valores, mostrar valores
            for (Moeda m : listaMoeda) {
                System.out.println(" ");
                System.out.println(m);
                System.out.println("-------------*-------------");
            }
        }
    }

    // Converter para Real
    public void totalConvertido() {
        double totalConvertido = 0;
        // Total Convertido estiver vazio, mostrar mensagem
        if (listaMoeda.isEmpty()) {
            System.out.println("-------------*-------------");
            System.out.println("Não há valor a converter!");
            System.out.println("Adicione já!");
            System.out.println("-------------*-------------");
        } else {
            // Total Convertido estiver com valores, mostrar valores
            for (Moeda m : this.listaMoeda) {
                totalConvertido += m.converter();
            }
            System.out.printf("Total convertido para Real: R$%.2f\n", totalConvertido);
        }

    }

}
