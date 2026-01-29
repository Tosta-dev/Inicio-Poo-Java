    package br.com.tosta.iniciopoo;
    import java.util.Scanner;

    // Codigo bem incompleto mas o negocio é constancia...

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.println("Menu :");
                System.out.println("1 - Adicionar Pessoa");
                System.out.println("2 - Ver lista de Pessoas");
                System.out.println("3 - Sair ");
                System.out.println("Digite a opção que deseja de acordo com o menu");
                int opcao = sc.nextInt();
                if (opcao == 1){
                    System.out.println("Teste - adcionar metodo cadastro pessoa");
                }else if (opcao == 2) {
                    System.out.println("Teste - pessoas");
                }else {
                    break;
                }
            }
        }
    }
    class Pessoa {
        String nome;
        int idade;
        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
            System.out.println("Olá, Seja Bem vindo " + this.nome);
        }
    }
    //System.out.println("Digite seu nome:");
    //                    String nome = sc.nextLine();
    //                    System.out.println("Digite a sua idade :");
    //                    int idade = sc.nextInt();

    // Criar uma estrutura para guardar as pessoas
    // Criar um metodo para cadastrar pessoa
    //Melhorar o while para opção inválida
    //Criar um metodo para listar pessoas usando for