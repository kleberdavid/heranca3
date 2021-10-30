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
    public double getSacar() {
        return this.saldo - this.SaldoConta;
    }
    public double getDepositar() {
        return this.SaldoConta + this.ChequeEspecial;
    }

    public void depositar(double valorDeposito) {
        SaldoConta = SaldoConta + valorDeposito;
    }

    public void sacar(double valorSaque) {
        if (valorSaque <= SaldoConta) {
            double valorDeposito = 0;
            SaldoConta = SaldoConta - valorDeposito;
        } else {
            System.out.println("Saldo Insuficiente");
        }

    }
}
