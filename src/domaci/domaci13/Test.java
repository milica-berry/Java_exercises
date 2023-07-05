package domaci.domaci13;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Planina fruskaGora = new Planina(539, "Fruska gora");
        Planina kopaonik = new Planina(2017, "Kopaonik");
        Planina ovcar = new Planina(985, "Ovcar");


        ArrayList<Planina> lista = new ArrayList<>();

        Planinar mile = new Planinar(lista, 1000, 50);

        lista.add(fruskaGora);
        System.out.println(mile);

        mile.popniSe(ovcar);

        System.out.println("========");

        System.out.println(mile);

        System.out.println(mile.clanarina());
        System.out.println(mile.sviUsponi());
        System.out.println(mile.najvecaPlanina());

        System.out.println("====");

        mile.popniSe(kopaonik);
        System.out.println(mile);



    }
}
