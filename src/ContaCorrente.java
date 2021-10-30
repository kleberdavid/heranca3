public class ContaCorrente extends Conta {

    private double ChequeEspecial;
    private double SaldoConta;

    public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(numero, agencia, banco, saldo);
        ChequeEspecial = chequeEspecial;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "ChequeEspecial=" + ChequeEspecial +
                '}';
    }

    public double getSaldo() {
        return this.ChequeEspecial + this.saldo;
    }
    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    public void sacar(double valorSaque) {
        if (valorSaque > this.getSaldo()) {
            System.out.println("Saldo Insuficiente");
        } else {
             this.saldo -= valorSaque;
        }

    }
}
