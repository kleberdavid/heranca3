import java.util.Scanner;

public class TestaConta {



    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(20,21,"Banco P",10.00, 1000.00);
        System.out.println();
        System.out.println("O Saldo da Conta Corrente é R$: " + cc1.getSaldo());
        System.out.println("---------------------------------------------------------------");



        ContaPoupanca cp1 = new ContaPoupanca(21,22,"Banco P",10.00,20,0.05);
        System.out.println();
        System.out.println("O Saldo da Conta Poupança é R$: " + cp1.getSaldo());
        System.out.println("___________________________________________________________________");


        ContaSalario cs1 = new ContaSalario(1,22,"Banco P",100.00, 2);
        System.out.println();
        System.out.println("O saldo da Conta Salario é R$: " + cs1.getSaldo());

        int opcao = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o valor para saque: ");
            double saque = scanner.nextDouble();
            cs1.sacar(saque);
            System.out.println("O saldo da Conta Salario é R$: " + cs1.getSaldo());
            System.out.println("Digite o valor para deposito: ");
            double valor = scanner.nextDouble();
            cs1.depositar(valor);
            System.out.print("Valor da conta salario é R$: " + cs1.getSaldo());
        }while(opcao != 2);







    }
}
