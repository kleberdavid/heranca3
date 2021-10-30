public class ContaPoupanca extends Conta {

    private int diaDeAniversario;
    private double taxaDeJuros;
    private double SaldoConta;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaDeAniversario, double taxaDeJuros) {
        super(numero, agencia, banco, saldo);
        this.diaDeAniversario = diaDeAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "diaDeAniversario=" + diaDeAniversario +
                ", taxaDeJuros=" + taxaDeJuros +
                '}';
    }

    public double getSaldo() {
        return this.saldo + this.taxaDeJuros * this.saldo;
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
