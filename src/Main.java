//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int valor = 5;  //Atribui o valor 5 à variável valor

        System.out.println("Bem Vindo ao Screen Match!");
        System.out.println("Filme: Divertidamente 2 ");

        int anoDeLancamento = 2024;
        System.out.println("""
                Muito legal
                Filme sobre emotes
                Ano de Lancamento
                """ + anoDeLancamento);
        boolean incluidoNoPlano = true;

        String saudacao = "Olá, meu nome é ";
        String nome = "Alice ";
        String continuacao = "e minha idade é ";
        int idade = 17;
        System.out.println(saudacao + nome + continuacao + idade);



    }
}
class ConversaoDolaresReais {
    public static void main(String[] args) {
        double valorEmReais = 100.50;
        double taxaDeConversao = 4.94;

        double valorEmRobux = valorEmReais * taxaDeConversao;

        System.out.println("O valor em Robux é: " + valorEmRobux);
    }
}