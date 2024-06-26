public class Main {

    public static void main(String[] args) {

        Cliente joaquim = new Cliente();
        joaquim.setNome("Joaquim");

        Conta cc = new ContaCorrente(joaquim);                
        Conta poupanca = new ContaPoupanca(joaquim);

        cc.depositar(100);
        cc.transferir(50, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
    
}
