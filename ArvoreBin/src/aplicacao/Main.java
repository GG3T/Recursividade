package aplicacao;

import arvore.ABBint;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ABBint abb = new ABBint();
        Scanner le = new Scanner(System.in);

        // criar Menuzin

        int opcao;
        do {
            System.out.println("0 - encerrar");
            System.out.println("1 - Inserir");
            System.out.println("2 - Lista em Ordem Crescente");
            System.out.println("3 - Apresentar a quantidade de nos");
            opcao = le.nextInt();
            switch (opcao){
                case 0:
                    System.out.println("Encerado");
                    break;
                case 1:
                    System.out.println("Informe valor am ser inserido: ");
                    int info = le.nextInt();
                    abb.raiz = abb.inserir(abb.raiz, info);
                    break;
                case 2:
                    abb.listaEmordem(abb.raiz);
                    break;
                case 3 :
                    System.out.println("quantidade de nos : " + abb.contaNos(abb.raiz, 0));
                    break;
                default:
                    System.out.println("Opção invalida");

            }

        }while (opcao != 0);
        // para execução
    }
}
