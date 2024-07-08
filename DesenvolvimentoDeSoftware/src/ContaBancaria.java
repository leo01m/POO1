public abstract class ContaBancaria implements Conta{
    protected double saldo;

    public ContaBancaria(double saldoInicial){
        this.saldo = saldoInicial;
    }
    @Override
    public void depositar(double quantia){
        if (quantia>0){
            saldo += quantia;
        }
    }
    @Override
    public void sacar(double quantia){
        if (quantia>0 && quantia <= saldo){
            saldo -= quantia;
        }
    }
    @Override
    public double obterSaldo(){
        return saldo;
    }
    public abstract double calcularJuros();
}

