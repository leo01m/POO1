public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(double saldoInicial, double taxaJuros){
        super(saldoInicial);
        this.taxaJuros = taxaJuros;
    }
    @Override
    public double calcularJuros(){
        return saldo * taxaJuros;
    }
    public final void adicionarJuros(){
        double juros = calcularJuros();
        depositar(juros);
    }
}
