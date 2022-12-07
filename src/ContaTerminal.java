import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int conta;
        String agencia, nomeCliente;
        double saldo;

        agencia = scan.next();
        conta = scan.nextInt();
        nomeCliente = scan.next();
        saldo = scan.nextDouble();
        
        System.out.println("Olá, por favor, digite o número da sua agência: ");
        
        
        System.out.println("Agora, digite o número da sua conta: ");
		
        
        System.out.println("Qual o seu nome completo? ");
        
        
        System.out.println("Agora, digite o valor do saldo para saque: ");


        System.out.println("Olá" + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é" + agencia + ", conta" + conta +"e seu saldo" + saldo + "já está disponível para saque.");
    }
}

