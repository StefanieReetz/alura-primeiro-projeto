import java.util.Random;
import java.util.Scanner;

public class MeusCodigos {
    public static void main(String[] args) {
        int anoLancamento = 1950;
        boolean incluidoNoPlano =false;
        double notaDoFilme = 9.1;
        String tipoDoPlano = "plus";

        if (anoLancamento >= 2024){
            System.out.println("Lancamento que os clientes estao curtindo!");

        } else {
            System.out.println("Este filme é Retro");

        }
        if (incluidoNoPlano || tipoDoPlano.equals("plus")) {
            System.out.println("Filme liberado!");

        }else {
            System.out.println("Voce deve pagar para ver este filme!");
        }
        int dia = 3;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        System.out.println("O dia " + dia + " é " + nomeDia);




    }
}

class Switch {
    public static void main(String[] args) {
        int dia = 3;
        String nomeDia;

        switch(dia){

            case 1:
            nomeDia = "domingo";
                break;
            case 2:
            nomeDia = "segunda-feira";
                break;
            case 3:
            nomeDia = "terça-feira";
                break;
            case 4:
            nomeDia = "quarta-feira";
                break;
            case 5:
            nomeDia = "quinta-feira";
                break;
            case 6:
            nomeDia = "sexta-feira";
                break;
            case 7:
            nomeDia = "sábado";
                break;
            default:
            nomeDia = "Dia inválido";
                break;
        }
    }
}

class Docinhos {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int totalDocinhos = 10;
        double comidos = 0;

        while (totalDocinhos > 7) {
            System.out.println("Quantos docinhos voce comeu agora?");
            comidos = leitura.nextDouble();
            totalDocinhos -= comidos;

            if (totalDocinhos == 7){
                System.out.println("Pare de comer docinhos! voce ja comeu " + comidos);
            } else if (totalDocinhos < 7) {
                System.out.println("Voce comeu demais! Voce comeu " + comidos);
            }
        }

        System.out.println("sobrou " + totalDocinhos);
    }
}

class TesteNumeroAleatorio {
    public static void main(String[] args) {
        int sorte = new Random().nextInt(10);

        System.out.println("\nNUMERO ALEATORIO É\n" + sorte);

    }
}


    class Desafio{
        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);
            String nome;
            int idade;

            System.out.println("Diga seu nome ");
            nome = leitura.nextLine();
            System.out.println("Agora sua idade ");
            idade = leitura.nextInt();
            System.out.println("Dados do cliente ");
            System.out.println("\n***********************\n\nNome do cliente: " + nome + "\nIdade do cliente: " + idade + "\n\n***********************\n");


            int opcao = 0;
            String menu = "\nDigite uma opcao\n1 - Brincar de Adivinhar\n2 - Docinhos\n3 - Somar Numeros\n4 - Sair\n";


            while (opcao != 4){
                System.out.println(menu);
                opcao = leitura.nextInt();
                switch (opcao) {
                    case 1:
                        int numeroGerado = new Random().nextInt(50); // gera um número aleatório entre 0 e 50
                        int tentativas = 0;
                        int numeroDigitado = 0;
                        int chances = 5;

                        while (tentativas < 5) {
                            System.out.print("Digite um número entre 0 e 50: ");
                            numeroDigitado = leitura.nextInt();
                            tentativas++;

                            if (numeroDigitado == numeroGerado) {
                                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                                break; // interrompe o loop while
                            } else if (numeroDigitado < numeroGerado) {
                                System.out.println("\nO número que voce digitou é menor que o número que eu pensei.\n\nSobraram " + (chances - tentativas) + " chances\n");
                            } else {
                                System.out.println("\nO número que voce digitou é maior que o número que eu pensei.\n\nSobraram " + (chances - tentativas) + " chances");
                            }
                        }

                        if (tentativas == 5 && numeroDigitado != numeroGerado) {
                            System.out.println("\nVocê não conseguiu acertar o número em 05 tentativas. O número era: \n" + numeroGerado);
                        }

                        break;
                    case 2:
                        int totalDocinhos = 10;
                        double comidos = 0;

                        while (totalDocinhos > 7) {
                            System.out.println("Quantos docinhos voce comeu agora?");
                            comidos = leitura.nextDouble();
                            totalDocinhos -= comidos;

                            if (totalDocinhos == 7){
                                System.out.println("Pare de comer docinhos! sobrou " + totalDocinhos);
                            } else if (totalDocinhos < 7) {
                                System.out.println("Voce comeu demais! Sobrou " + totalDocinhos);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("\nDigite um numero\n");
                        float numero1 = leitura.nextShort();
                        System.out.println("\nAgora diga outro numero para somar\n");
                        float numero2 = leitura.nextShort();
                        System.out.println("\nEste e o resuldado:\n" + (numero1+numero2));
                        break;

                    default:
                        System.out.println("\nNao entendi.. Tente digitar um numero de 1 a 4.\n\nMas voce achou um segredo..\nEscola dois numeros para multiplicar\n");
                        float numer1 = leitura.nextShort();
                        System.out.println("\nAgora digite outro\n");
                        float numer2 = leitura.nextShort();
                        System.out.println("\nO resultado é " + (numer1*numer2));
                        break;
                }
            }
            System.out.println("\nObrigado por jogar!\n");

        }


        }
