import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<GestaoResiduos> residuos = new ArrayList<>();

        Plastico plastico = new Plastico("Garrafa pet", 5.0);
        Papel papel = new Papel(true, 2.0);
        Organico organico = new Organico("Restos de comida", 3.0);

        residuos.add(plastico);
        residuos.add(papel);
        residuos.add(organico);

        for(GestaoResiduos res : residuos){
            System.out.println(res);
            System.out.println("impacto ambiental: "+ res.calcularImpacto());
            System.out.println();
        }
    }
}