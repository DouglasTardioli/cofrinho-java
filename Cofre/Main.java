package Cofre;

import java.util.Scanner;

//Classe principal para inicialização do sistema
public class Main {
    public static void main(String[] args) {
        // Scanner para selecionar captura do que foi digitado
        Scanner teclado = new Scanner(System.in);
        int opcao;

        Cofrinho cofrinho = new Cofrinho();

        // Menu principal
        System.out.println("---------------*---------------");
        System.out.println("| Inicie sua poupança          |");
        System.out.println("| 1 - Adicionar Moedas         |");
        System.out.println("| 2 - Remover Moedas           |");
        System.out.println("| 3 - Listar Moedas            |");
        System.out.println("| 4 - Listar valor em Real     |");
        System.out.println("| 0 - Encerrar                 |");
        System.out.println("---------------*---------------");
        System.out.println("");
        opcao = teclado.nextInt();

        //Variaveis de controle
        int tipoMoeda;
        double real, euro, dolar;
        Moeda cofre;

        // Loop das acoes principais do sistema
        while (opcao != 0) {
            switch (opcao) {
                // caso seja 1 - adicionar moeda pela moeda referente
                case 1:
                    tipoMoeda = 0;
                    while (tipoMoeda > 3 || tipoMoeda <= 0) {
                        System.out.println("---------------*---------------");
                        System.out.println("| 1 - Real                     |");
                        System.out.println("| 2 - Dolar                    |");
                        System.out.println("| 3 - Euro                     |");
                        System.out.println("---------------*---------------");

                        System.out.println("");

                        tipoMoeda = teclado.nextInt();
                    }

                    cofre = null;
                    // se for 1 - adicionar moeda Real
                    if (tipoMoeda == 1) {
                        System.out.println("---------------*---------------");
                        System.out.println("Quantos Reais deseja adicionar: ");
                        real = teclado.nextDouble();
                        System.out.println("");

                        System.out.println("Valor adicionado: R$" + real);
                        System.out.println("---------------*---------------");
                        cofre = new Real(real);

                    }

                    // se for 2 - adicionar moeda Dolar
                    if (tipoMoeda == 2) {
                        System.out.println("---------------*---------------");
                        System.out.println("Quantos Dolares deseja adicionar: ");
                        dolar = teclado.nextDouble();
                        System.out.println("");

                        System.out.println("Valor adicionado: $" + dolar);
                        System.out.println("---------------*---------------");
                        cofre = new Dolar(dolar);

                    }

                    // se for 2 - adicionar moeda Euro
                    if (tipoMoeda == 3) {
                        System.out.println("---------------*---------------");
                        System.out.println("Quantos Euros deseja adicionar: ");
                        euro = teclado.nextDouble();
                        System.out.println("");

                        System.out.println("Valor adicionado: €" + euro);
                        System.out.println("---------------*---------------");
                        cofre = new Euro(euro);

                    }

                    // Atualizar Cofre
                    cofrinho.adicionar(cofre);
                    break;

                // Caso 2 - remover moeda pela moeda referente
                case 2:
                    tipoMoeda = 0;
                    while (tipoMoeda > 3 || tipoMoeda <= 0) {
                        System.out.println("---------------*---------------");
                        System.out.println("| 1 - Remover Real             |");
                        System.out.println("| 2 - Remover Dolar            |");
                        System.out.println("| 3 - Remover Euro             |");
                        System.out.println("---------------*---------------");
                        System.out.println("");

                        tipoMoeda = teclado.nextInt();
                    }

                    cofre = null;

                    // Se for 1 - remover moeda em Real
                    if (tipoMoeda == 1) {
                        System.out.println("---------------*---------------");
                        System.out.println("Quantos Reais deseja Remover: ");
                        real = teclado.nextDouble();
                        System.out.println("Valor removido: R$" + real);
                        System.out.println("---------------*---------------");
                        cofre = new Real(real);

                    }

                    // Se for 1 - remover moeda em Dolar
                    if (tipoMoeda == 2) {
                        System.out.println("---------------*---------------");
                        System.out.println("Quantos Dolares deseja Remover: ");
                        dolar = teclado.nextDouble();
                        System.out.println("Valor removido: $" + dolar);
                        System.out.println("---------------*---------------");
                        cofre = new Dolar(dolar);

                    }

                    // Se for 1 - remover moeda em Euro
                    if (tipoMoeda == 3) {
                        System.out.println("---------------*---------------");
                        System.out.println("Quantos Euros deseja remover: ");
                        euro = teclado.nextDouble();
                        System.out.println("Valor removido: €" + euro);
                        System.out.println("---------------*---------------");
                        cofre = new Euro(euro);

                    }

                    // Remover e atualizar cofre
                    cofrinho.remover(cofre);
                    break;
                case 3:
                    // Listar valores do Cofre
                    System.out.println("Valores no Cofrinho até o momento: ");
                    cofrinho.listar();
                    break;

                default:
                    // diferente do menu - Opcao Invalida
                    System.out.println("Opcao invalida!");
                    break;
                case 4:
                    // listar valor convertido para real
                    System.out.println("");
                    System.out.println("----------------*----------------");
                    cofrinho.totalConvertido();
                    System.out.println("----------------*----------------");
                    System.out.println("");

                    break;
            }
            
            //Retorno do Menu inicial 
            System.out.println("---------------*---------------");
            System.out.println("| Inicie sua poupança          |");
            System.out.println("| 1 - Adicionar Moedas         |");
            System.out.println("| 2 - Remover Moedas           |");
            System.out.println("| 3 - Listar Moedas            |");
            System.out.println("| 4 - Listar valor em Real     |");
            System.out.println("| 0 - Encerrar                 |");
            System.out.println("---------------*---------------");
            opcao = teclado.nextInt();
        }
        // Encerramento Cofre
        System.out.println("---------------*---------------");
        System.out.println("Encerrando Cofrinho - até Mais :) ");

    }
}
