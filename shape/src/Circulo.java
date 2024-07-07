class Circulo extends FormaBidimensional {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    double obterArea() {
        return Math.PI * raio * raio;
    }
}

class Quadrado extends FormaBidimensional {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double obterArea() {
        return lado * lado;
    }
}

class Triangulo extends FormaBidimensional {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double obterArea() {
        return 0.5 * base * altura;
    }
}
