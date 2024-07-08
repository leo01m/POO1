public class Main {
    public static void main(String[] args){
        
        ContaPoupanca poupanca = new ContaPoupanca(10000, 0.5);
        ContaCorrente corrente = new ContaCorrente(5000);
        ContaDeposito deposito = new ContaDeposito(2000, 0.7);

        poupanca.depositar(2000);
        poupanca.sacar(500);

        corrente.depositar(1000);
        corrente.sacar(1500);

        deposito.depositar(500);
        deposito.sacar(100);

        poupanca.adicionarJuros();
        deposito.adicionarJuros();

        System.out.println("Saldo da conta poupnça: " + poupanca.obterSaldo());
        System.out.println("Saldo da conta corrente: " + corrente.obterSaldo());
        System.out.println("Saldo da conta depósito: " + deposito.obterSaldo());
    }
}
