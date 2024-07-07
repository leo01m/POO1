public class Main {
    public static void main(String[] args) {
        Forma[] formas = {
            new Circulo(5),
            new Quadrado(4),
            new Triangulo(3, 4),
            new Esfera(5),
            new Cubo(3),
            new Tetraedro(2)
        };

        for (Forma forma : formas) {
            System.out.println(forma);
            if (forma instanceof FormaBidimensional) {
                System.out.println("Área: " + ((FormaBidimensional) forma).obterArea());
            } else if (forma instanceof FormaTridimensional) {
                System.out.println("Área: " + ((FormaTridimensional) forma).obterArea());
                System.out.println("Volume: " + ((FormaTridimensional) forma).obterVolume());
            }
            System.out.println();
        }
    }
}