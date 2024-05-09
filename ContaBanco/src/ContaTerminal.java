import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        

        System.out.println("Por favor, digite o número da conta");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor digite as credenciais da agência");
        String agencia = sc.nextLine();
        System.out.println("Por favor digite o seu nome");
        String nomeCliente = sc.nextLine();
        System.out.println("Por favor digite o saldo inicial da conta");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + "! Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", sua conta é " + numeroConta +  " ,e seu saldo de " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
