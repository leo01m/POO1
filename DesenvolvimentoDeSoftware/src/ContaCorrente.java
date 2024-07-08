public class ContaCorrente extends ContaBancaria{
    public ContaCorrente(double saldoInicial){
        super(saldoInicial);
    }
    @Override
    public double calcularJuros(){
        return 0;
    }
}
