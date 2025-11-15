import java.util.Scanner;

public class BankSystem{

    static void main(String[] args) {
        String nome = "Caio Pereira";
        String tipoConta = "Corrente";
        double saldo = 1600.00;

        System.out.println("==***************************==");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo total: " + saldo + "R$");
        System.out.println("==***************************==");
        int opcao = 0 ;
        String menu = """
                      \nOperações            
                      ==*********************==
                      1- Consultar saldos
                      2- Receber valor
                      3- Transferir valor
                      4- Sair
                      ==*********************==
                      Digite a opção desejada:
                      """ ;

        while (opcao != 4) {
            System.out.println(menu);
            Scanner input = new Scanner(System.in);
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("\nSaldo atual: R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber:");
                    double receber = input.nextDouble();
                    saldo = saldo + receber;
                    System.out.println("Saldo atualizado R$ " + saldo);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir: ");
                    double transferir = input.nextDouble();
                    if (transferir > saldo){
                        System.out.println("Saldo insuficiente para transferência!");
                    }
                    else {
                        saldo = saldo - transferir;
                        System.out.println("Saldo atualizado R$ " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;

            }
        }
    input.close();


    }
}
