public class ContaSalario extends Conta {

     private int limiteSaque;

    public ContaSalario(int numero, int agencia, String banco, double saldo, int limiteSaque) {
        super(numero, agencia, banco, saldo);
          this.limiteSaque = limiteSaque;
    }
    @Override
    public String toString() {
        return "ContaSalario{" +
                "saldo=" + saldo +
                ", limiteSaque=" + limiteSaque +
                '}';
    }

    public double getSaldo() {//ok

        return this.saldo;
    }

    public void sacar(double valor) {
        if (limiteSaque == 0) {
            System.out.println("Saque Indisponível, limite Atingido!");
        }
            if(valor > this.getSaldo()){
                System.out.println("Saldo Insuficiente");

        }else{
            System.out.println("Limites Disponiveis para saque: " + this.limiteSaque);
            this.limiteSaque --;
            this.saldo -= valor;
        }
    }
    public void depositar(double valordeposito){
        this.saldo += valordeposito;
    }




    }
