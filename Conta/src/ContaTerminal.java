import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite o número da agencia");
        String agencia = scanner.next();

        System.out.println("Digite o numero da conta");
        int conta = scanner.nextInt();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Ola " + nome + ", obrigado por criar uma conta em nossa agencia, sua agencia eh " + agencia
            + ", conta " + conta + ", saldo " + saldo + " ja esta disponivel para saque");
    
        scanner.close();


    }
}
