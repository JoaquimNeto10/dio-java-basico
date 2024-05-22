package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Cliente conta = new Cliente();

    System.out.print("Digite seu nome: ");
    conta.nomeCliente = sc.nextLine();    

    System.out.print("Digite o numero: ");
    conta.numero = sc.nextInt();

    sc.nextLine();

    System.out.print("Digite sua agencia: ");
    conta.agencia = sc.nextLine();
    
    System.out.print("Digite seu saldo: ");
    conta.saldo = sc.nextDouble();

    System.out.println(conta);

    sc.close();    

    }
}
