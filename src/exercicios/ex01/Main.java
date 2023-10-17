package exercicios.ex01;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(1000.0);

        System.out.println("Saldo Inicial: " + conta.obterSaldoAtual());
        conta.depositar(500.0);
        System.out.println("Saldo após depósito: " + conta.obterSaldoAtual());
        conta.sacar(300.0);
        System.out.println("Saldo após saque: " + conta.obterSaldoAtual());
    }
}
