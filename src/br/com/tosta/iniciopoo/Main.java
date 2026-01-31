    package br.com.tosta.iniciopoo;
    import java.util.Scanner;

    // Codigo bem incompleto mas o negocio é constancia...

    public class Main {
        static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            System.out.println("Olá, Seja bem vindo!");
            System.out.println("Você acha que consegue lembrar de quantas pessoas ?");
            System.out.println("Vamos ver agora! hahahah");

            // Não pensei em um gancho melhor, kakkakakak

            while(true){
                int opcao = menu();
                if (opcao == 1){
                    System.out.println(" Teste POO - Incompleto - Adicionar metodo para add pessoas ");
                    if (!continuar())
                        break;
                }else if (opcao == 2) {
                    System.out.println("Teste POO - Incompleto - Adicionar metodo para ver lista de pessoas");
                    if (!continuar())
                        break;
                }else {
                    break;
                }
            }
        }

        public static int menu(){
            System.out.println("Menu :");
            System.out.println("1 - Adicionar Pessoa");
            System.out.println("2 - Ver lista de Pessoas");
            System.out.println("3 - Sair ");
            System.out.println("Digite a opção que deseja de acordo com o numero no menu");
            int opcao = sc.nextInt();
            return opcao;
        }
        public static int menu2(){
            System.out.println("Você deseja continuar ou vai sair já ? :");
            System.out.println("1 - Voltar ao menu inicial");
            System.out.println("2 - Sair ");
            System.out.println("Digite a opção que deseja de acordo com o menu");
            int opcao = sc.nextInt();
            return opcao;
        }
        public static boolean continuar(){
            int opcao = menu2();
            if  (opcao == 1){
                System.out.println("Vamos voltar ao menu agora!");
                return true;
            } else {
                System.out.println("Tchau! Espero que tenha gostado da experiência!");
                return false;
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