package exercicios.ex02;

public class Main {
           public static void main(String[] args) {
            Funcionario funcionario = new Funcionario();
            Gerente gerente = new Gerente();
            Gerente gerenteNaoExtensivel = new Gerente();

            System.out.println(funcionario.obterCargo()); // Saída: Sou Funcionário
            System.out.println(gerente.obterCargo()); // Saída: Sou Gerente
            System.out.println(gerenteNaoExtensivel.obterCargo()); // Saída: Sou Gerente
        }
    }
