import java.util.Scanner;

public class TestaConta {

    public static void main(String[] args) {

        SistemaFinal sf1 = new SistemaFinal();
        int opcao;
        do {

            System.out.print("***BANCO MENTORAMA***");
            System.out.println();
            System.out.println("** 01 - Conta Corrente --");
            System.out.println("** 02 - Conta Poupança --");
            System.out.println("** 03 - Conta Salario --");
            System.out.println("** 00 - Sair--");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a Opção desejada: ");
            opcao = scanner.nextInt();
            System.out.println("___________________________________");

            switch (opcao) {
                case 1:
                    Scanner entrada = new Scanner(System.in);
                    ContaCorrente cc1 = new ContaCorrente(20, 21, "Banco P", 10.00, 1000.00);
                    System.out.println();
                    System.out.println("O Saldo da Conta Corrente é R$: " + cc1.getSaldo());
                    System.out.println("---------------------------------------------------------------");
                    System.out.print("Digite o valor para Deposito: ");
                    double cc2 = scanner.nextDouble();
                    cc1.depositar(cc2);
                    System.out.println("Valor total do Saldo: " + cc1.getSaldo());
                    System.out.println("_______________________________________________________________");
                    System.out.print("Digite o valor para Saque: ");
                    double saquecc = scanner.nextDouble();
                    cc1.sacar(saquecc);
                    System.out.println("Valor total do saque: " + cc1.getSaldo());
                    System.out.println("______________________________________________________________");

                    break;

                case 2:
                    Scanner sc = new Scanner(System.in);
                    ContaPoupanca cp1 = new ContaPoupanca(21, 22, "Banco P", 10.00, 20, 0.05);
                    System.out.println();
                    System.out.println("O Saldo da Conta Poupança é R$: " + cp1.getSaldo());
                    System.out.println("_______________________________________________________________");
                    System.out.println("Valor total do Saldo: " + cp1.getSaldo());
                    System.out.println("_______________________________________________________________");
                    System.out.print("Digite o valor para Deposito: ");
                    double depos = scanner.nextDouble();
                    cp1.depositar(depos);
                    System.out.println("Valor total do Saldo: " + cp1.getSaldo());
                    System.out.println("_______________________________________________________________");
                    System.out.print("Digite o valor para Saque: ");
                    double saquecp = scanner.nextDouble();
                    cp1.sacar(saquecp);
                    System.out.println("Valor total do saque: " + cp1.getSaldo());
                    System.out.println("______________________________________________________________");

                    break;

                case 3:
                    sf1.sacarSalario();
                    sf1.depositarSalario();

                    break;
            }

        } while (opcao != 0) ;
    }





}

