import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente cc = new ContaCorrente("12345", 1000);
        ContaPoupanca cp = new ContaPoupanca("67890", 1.5);

        while (true) {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Depositar em Conta Corrente");
            System.out.println("2. Sacar de Conta Corrente");
            System.out.println("3. Ver saldo de Conta Corrente");
            System.out.println("4. Depositar em Conta Poupança");
            System.out.println("5. Sacar de Conta Poupança");
            System.out.println("6. Ver saldo de Conta Poupança");
            System.out.println("7. Aplicar juros na Conta Poupança");
            System.out.println("8. Sair");

            System.out.print("Digite sua escolha: ");
            int escolha = scanner.nextInt();
            double valor;

            switch (escolha) {
                case 1:
                    System.out.print("Digite o valor para depositar na Conta Corrente: ");
                    valor = scanner.nextDouble();
                    cc.depositar(valor);
                    System.out.println("Depósito realizado com sucesso.");
                    break;
                case 2:
                    try {
                        System.out.print("Digite o valor para sacar da Conta Corrente: ");
                        valor = scanner.nextDouble();
                        cc.sacar(valor);
                        System.out.println("Saque realizado com sucesso.");
                    } catch (SaldoInsuficienteException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Saldo da Conta Corrente: " + cc.getSaldo());
                    break;
                case 4:
                    System.out.print("Digite o valor para depositar na Conta Poupança: ");
                    valor = scanner.nextDouble();
                    cp.depositar(valor);
                    System.out.println("Depósito realizado com sucesso.");
                    break;
                case 5:
                    try {
                        System.out.print("Digite o valor para sacar da Conta Poupança: ");
                        valor = scanner.nextDouble();
                        cp.sacar(valor);
                        System.out.println("Saque realizado com sucesso.");
                    } catch (SaldoInsuficienteException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Saldo da Conta Poupança: " + cp.getSaldo());
                    break;
                case 7:
                    cp.aplicarJuros();
                    System.out.println("Juros aplicados na Conta Poupança.");
                    break;
                case 8:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }
            System.out.println();
        }
    }
}
