public class SaldoException extends Exception {
    @Override
    public String getMessage() {
        return "Erro: Saldo insuficiente para realizar o saque.";
    }
}
