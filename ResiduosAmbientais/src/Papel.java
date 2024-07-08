public class Papel implements GestaoResiduos {
    private boolean reciclado;
    private double peso;
    
    public Papel(boolean reciclado, double peso){
        this.peso = peso;
        this.reciclado = reciclado;
    }
    public boolean isReciclado() {
        return reciclado;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    @Override
    public double calcularImpacto(){
        return reciclado ? peso * 0.5 : peso * 1.0;
    }
    @Override
    public String toString(){
        return "Papel (" +
        "reciclado = " + reciclado +
        ", peso = " + peso +
        ')'; 
    }
}
