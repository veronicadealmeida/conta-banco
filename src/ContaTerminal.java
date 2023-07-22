import java.awt.*;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);

        int conta;
        String agencia;
        String nomeDoCliente;
        double saldo;

        System.out.println("Por favor, digite o número da conta");
        conta = sc.nextInt();

        System.out.println("Por favor, digite o número da agência");
        agencia = scString.next();

        System.out.println("Por favor, digite o nome do cliente");
        nomeDoCliente = scString.next();

        System.out.println("Por favor, digite o saldo");
        saldo = sc.nextDouble();

        System.out.println("Olá "+ nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + conta + " e seu saldo " + String.format("%.2f", saldo)  + " já está disponível para saque");
    }
}
