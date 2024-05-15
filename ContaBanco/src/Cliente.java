public class Cliente {

    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;

    public String toString() {
		return "Ola " + nomeCliente 
        + ", obrigado por criar uma conta em nosso banco, sua agencia eh: " + agencia
        + " conta " + numero
        + " e seu saldo " + saldo
        + " ja esta disponivel para saque";
	}
}
