import java.util.Scanner;

public class BancoSimples {
    public static void main(String[] args) {
        int contaCorreta = 5555;
        int senhaCorreta = 3442;

        Scanner acesso = new Scanner(System.in);

        System.out.println("Bem Vindo(a) digite sua conta para começar");

        int conta = acesso.nextInt();

        while (conta != contaCorreta) {
            System.out.println("Conta não localizada ! Tente novamente");
            System.out.println("Bem Vindo(a) digite sua conta para começar");
            conta = acesso.nextInt();
        }
        System.out.println("Conta localizada!");
        System.out.println("Agora digite sua senha para continuar:");

        int senha = acesso.nextInt();

        while (senha != senhaCorreta) {
            System.out.println("Senha incorreta! Tente novamente.");
            System.out.println("Digite sua senha para continuar:");
            senha = acesso.nextInt();
        }

        System.out.println("Acesso concedido Daniel , veja suas opções no menu: ");
        acesso.close();
    }
}