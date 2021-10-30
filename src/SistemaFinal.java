import java.util.Scanner;

public class SistemaFinal {
    ContaSalario cs1 = new ContaSalario(1, 22, "Banco P", 100.00, 2);

    public void sacarSalario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saldo da Conta Salario: " + cs1.getSaldo());
        System.out.print("Digite o valor para saque: ");
        double saque = scanner.nextDouble();
        cs1.sacar(saque);
        System.out.println("______________________________________________");
    }
    public void depositarSalario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saldo da conta salario é R$: " + cs1.getSaldo());
        System.out.println("Digite o valor para deposito: ");
        double valor = scanner.nextDouble();
        cs1.depositar(valor);
        System.out.println("___________________________________________");
    }
}
