package exercicios.ex01;

public class ContaCorrente extends Conta implements Operavel {
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    // Implementação dos métodos herdados
    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public double sacar(double valor) {
        super.sacar(valor);
        return valor;
    }
}
