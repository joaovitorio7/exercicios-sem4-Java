package exercicios.ex01;

    public abstract class Conta implements Operavel {
        protected double saldo;

        protected Conta(double saldoInicial) {
            this.saldo = saldoInicial;
        }

        protected double obterSaldoAtual() {
            return saldo;
        }

        @Override
        public void depositar(double valor) {
            saldo += valor;
        }

        @Override
        public double sacar(double valor) {
            if (valor <= saldo) {
                saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente");
            }
            return valor;
        }
    }
