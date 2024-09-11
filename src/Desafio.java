import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome ="Daniel";
        String tipoConta = "Corrente";
        double saldo = 2000.50;
        int opcao = 0;

        System.out.println("****************************");
        System.out.println("\nNome do Cliente: " +nome);
        System.out.println("Tipo da conta :" +tipoConta);
        System.out.println("Saldo disponivel: "+saldo);
        System.out.println("\n***************************");

        Scanner leitura = new Scanner(System.in);

        String menu = """
                ** Digite sua opção **
                1- Consultar Saldo
                2- Transferencia
                3- Deposito
                4- Sair
                **********************
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("o saldo atualizado é: " +saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que você deseja transferir ? ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente para esta transferencia !!");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo é de : " +saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " +saldo);

            } else if (opcao != 4) {
                System.out.println("Opção invalida");
            }
        }

    }
}
