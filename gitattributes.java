import java.util.Scanner;

public class DadosUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar o nome do usuário
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        // Solicitar a altura do usuário (em metros)
        System.out.print("Altura (em metros): ");
        double altura = sc.nextDouble();

        // Solicitar a idade do usuário
        System.out.print("Idade: ");
        int idade = sc.nextInt();

        // Perguntar se o usuário é estudante
        System.out.print("Você é estudante? (sim/não): ");
        sc.nextLine(); // Limpar o buffer
        String estudanteResposta = sc.nextLine();
        boolean estudante = estudanteResposta.equalsIgnoreCase("sim");

        // Mensagem de boas-vindas
        System.out.println("\nOlá, " + nome + "! Seja bem-vindo!");

        // Calcular em quantos anos o usuário terá 50 anos
        int anosPara50 = 50 - idade;
        if (anosPara50 > 0) {
            System.out.println("Você terá 50 anos em " + anosPara50 + " anos.");
        } else {
            System.out.println("Você já tem 50 anos ou mais!");
        }

        // Converter altura para centímetros
        double alturaCm = altura * 100;
        System.out.println("Sua altura em centímetros é: " + alturaCm + " cm");

        // Informar se o usuário é estudante
        if (estudante) {
            System.out.println("Você é estudante.");
        } else {
            System.out.println("Você não é estudante.");
        }

        sc.close(); // Fechar o scanner
    }
}