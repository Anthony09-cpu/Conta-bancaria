import java.util.Scanner;

public class Conta {
    public static void main(String[] args) throws Exception {

        String nome;
        int idade;
        String cpf;

        Scanner scanner = new Scanner(System.in);

        // Conhecer e importar a classe Scanner
        // Exibir as mesagens para o nosso usuario
        // Obter pelo scanner os valores digitados
        // Exibir a mensagem conta criada

        System.out.println("Bem vindo ao Banco SI");
        System.out.println("Deseja criar uma conta conosco?");
        System.out.println("1 -> Sim");
        System.out.println("2 -> Não");
        String scanf = scanner.nextLine();

        if (scanf.equals("1")) {
            System.out.println("Você escolheu criar uma conta!!");
            System.out.println("Vamos começar informando seu nome:");
            nome = scanner.nextLine();

            System.out.println();

            System.out.println("Agora sua idade: ");
            idade = Integer.parseInt(scanner.nextLine());

            System.out.println();

            System.out.println("E por fim, seu CPF:");
            cpf = scanner.nextLine();

            System.out.println();

            System.out.println("Conta Criada com Sucesso!!");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("CPF: " + cpf);

        } else if (scanf.equals("2")) {
            System.out.println();
            System.out.println("Você não escolheu criar a conta!");
            System.out.println("Obrigado pelo contato, volte sempre!!");
        } else {
            System.out.println("Opção Invalida");
        }
        scanner.close();
    }
}
