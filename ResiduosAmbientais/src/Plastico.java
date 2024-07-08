public class Plastico implements GestaoResiduos{
    private String tipo;
    private double peso;
   
    public Plastico(String tipo, double peso){
        this.peso = peso;
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    @Override
    public double calcularImpacto(){
        return peso * 1.5;
    }
    @Override
    public String toString(){
        return "Plastico (" +
        "tipo = '" + tipo + '\'' +
        ", peso=" + peso +
        ')';
    }
}
