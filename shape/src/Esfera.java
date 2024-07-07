class Esfera extends FormaTridimensional {
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    double obterArea() {
        return 4 * Math.PI * raio * raio;
    }

    @Override
    double obterVolume() {
        return (4.0 / 3) * Math.PI * raio * raio * raio;
    }
}

class Cubo extends FormaTridimensional {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    double obterArea() {
        return 6 * lado * lado;
    }

    @Override
    double obterVolume() {
        return lado * lado * lado;
    }
}

class Tetraedro extends FormaTridimensional {
    private double aresta;

    public Tetraedro(double aresta) {
        this.aresta = aresta;
    }

    @Override
    double obterArea() {
        return Math.sqrt(3) * aresta * aresta;
    }

    @Override
    double obterVolume() {
        return (Math.pow(aresta, 3) / (6 * Math.sqrt(2)));
    }
}