package application;

import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira a sigla que deseja procurar: ");
        char sigla = sc.next().charAt(0);

        switch (sigla) {
            case 'P': {
                System.out.println("PEQUENO");
                break;
            }
            case 'M': {
                System.out.println("MÉDIO");
                break;
            }
            case 'G': {
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");                
        }

        sc.close();

    }
}
    
