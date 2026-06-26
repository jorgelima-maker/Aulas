public class Conta {
    private double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) throws SaldoException {
        if (valor > this.saldo) {
            throw new SaldoException();
        }
        this.saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
