public final class ContaDeposito extends ContaBancaria {
    private double taxaJuros;

    public ContaDeposito(double saldoInicial, double taxaJuros){
        super(saldoInicial);
        this.taxaJuros = taxaJuros;

    }
    @Override
    public double calcularJuros(){
        return saldo*taxaJuros;
    }
    public void adicionarJuros(){
        double juros = calcularJuros();
        depositar(juros);
    }
}
