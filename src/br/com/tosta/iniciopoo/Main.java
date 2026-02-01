    package br.com.tosta.iniciopoo;
    import java.util.ArrayList;
    import java.util.Scanner;

    // Codigo bem incompleto mas o negocio é constancia...

    public class Main {
        static Scanner sc = new Scanner(System.in);
        static ArrayList<Pessoa> pessoas = new ArrayList<>();
        public static void main(String[] args) {
            System.out.println("Olá, Seja bem vindo!");
            System.out.println("Você acha que consegue lembrar de quantas pessoas ?");
            System.out.println("Vamos ver agora! hahahah");

            // Não pensei em um gancho melhor, kakkakakak

            while(true){
                int opcao = menu();
                if (opcao == 1){
                    cadastraPessoas();
                    if (!continuar())
                        break;
                }else if (opcao == 2) {
                    verPessoas();
                    if (!continuar())
                        break;
                }else {
                    break;
                }
            }
        }
        public static void verPessoas(){
            if(pessoas.isEmpty()){
                System.out.println(" A lista está vazia no momento!");
                return;
            }
            System.out.println("Lista Pessoas : ");
            for(Pessoa p : pessoas){
                System.out.print("| Nome : " + p.nome + " | ");
                System.out.print("| Idade : " + p.idade + " anos | ");
                System.out.println("| Altura : "  + p.altura + " m | ");
            }
        }
        public static void cadastraPessoas(){
            sc.nextLine();
            System.out.println("Digite seu nome:");
            String nome = sc.nextLine();
            System.out.println("Digite a sua idade :");
            int idade = sc.nextInt();
            System.out.println("Digite a sua altura:");
            float altura = sc.nextFloat();
            pessoas.add(new Pessoa(nome,idade,altura));
            System.out.println("Sucesso! Pessoa adicionada com sucesso!");
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
        float altura;
        public Pessoa(String nome, int idade,  float altura) {
            this.nome = nome;
            this.idade = idade;
            this.altura = altura;
            System.out.println("Olá, Seja Bem vindo " + this.nome);
        }
    }
    //Melhorar o while para opção inválida
    //Pensar em uma forma de tornar o codigo mais utilizavel como lista em si
    //tentar replicar oq entendi com os metodos, classe, objetos ...