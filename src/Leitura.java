import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Vou ler a sua mente!\nDigite um numero!");
        String numero = leitura.nextLine();
        System.out.println("O numero que você pensou foi " + numero);
        System.out.println("voce gostou? (sim ou nao)");
        String resposta = leitura.nextLine();
        String retribuir;
        switch (resposta){
            default:
                retribuir = "Tente responder denovo, sim ou nao";
                break;

            case "nao":
                retribuir = "Obrigado por participar";
                break;

            case "sim":
                retribuir = "Obrigado, volte sempre!";
                break;
        }
        System.out.println(retribuir);

    }
}
 class ExemploScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o valor que pretende investir esse mês: ");
        double valor = scanner.nextDouble();

        System.out.println(nome + " que tem " + idade + " anos, irá investir R$ " + valor + " esse mês.");

        scanner.close();
    }
}









