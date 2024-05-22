package contador;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Insira o primeiro parâmetro: ");
        int parametro1 = terminal.nextInt();
        System.out.println("Insira o segundo parâmetro: ");
        int parametro2 = terminal.nextInt();

        try {
            contar(parametro1,parametro2);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior do que o primeiro!");
        }
        terminal.close();
        
    } 

static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametro2 - parametro1;

        for(int i = 0; i < contagem; i++){
            System.out.println("Imprimindo o número " + (i+1));
        }
    
    }
}
