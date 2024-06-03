import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        String mensagem = String.format(
                "Ola %s, obrigado por criar uma conta em nosso banco, sua agencia é %s, conta %d e seu saldo %.2f ja esta disponivel para saque.", nomeCliente, agencia, numero, saldo);
        
        System.out.println(mensagem);

        scanner.close();
    }
}
