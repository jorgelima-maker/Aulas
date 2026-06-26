public class Teste {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.depositar(100.0);

        try {
            System.out.println("Tentando sacar R$150...");
            minhaConta.sacar(150.0);
        } catch (SaldoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Saldo atual: R$" + minhaConta.getSaldo());
    }
}
