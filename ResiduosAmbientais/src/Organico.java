public class Organico implements GestaoResiduos {
    private String tipo;
    private double peso;

    public Organico(String tipo, double peso){
        this.tipo =tipo;
        this.peso =peso;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override 
    public double calcularImpacto(){
        return peso * 0.2;
    }
    public String toString(){
        return "Organico(" +
        "tipo = '" + tipo + '\'' +
        ", peso = " + peso +
        ')';
    }
}
