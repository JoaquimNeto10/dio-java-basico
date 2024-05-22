import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double salarioBase = 2000;

        System.out.println("Insira o salário pretendido: ");
        double salarioPretendido = sc.nextDouble();

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato!");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para candidato com contra proposta.");
        } else{
            System.out.println("Aguardando resultado dos demais candidatos.");
        }      
        sc.close();

    }
}
