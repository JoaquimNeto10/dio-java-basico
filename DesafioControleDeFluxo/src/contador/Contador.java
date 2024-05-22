package contador;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o primeiro parâmetro: ");
        int parametro1 = sc.nextInt();
        System.out.println("Insira o segundo parâmetro: ");
        int parametro2 = sc.nextInt();

        try {
            contador(parametro1,parametro2);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior do que o primeiro!");
        }
        sc.close();
        
    } 

static void contador(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException();
        }

        int contar = parametro2 - parametro1;

        for(int i = 0; i < contar; i++){
            System.out.println("Imprimindo o número " + (i+1));
        }
    
    }
}
