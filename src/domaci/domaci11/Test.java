package domaci.domaci11;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {



        Sportista s = new Sportista("ime", 1000);
        Sportista s1 = new Sportista("ime1", 500);
        Sportista s2 = new Sportista("ime 2", 700);


        ArrayList<Sportista> lista = new ArrayList<>();
        lista.add(s);
        lista.add(s1);

        SportskiKlub sk = new SportskiKlub(lista,"beograd", 5000);


        System.out.println(sk.isplati());

        System.out.println(sk.prosekPlata());
        System.out.println(sk.getListaClanovaKluba());

        System.out.println(sk.getListaClanovaKluba());

        System.out.println(sk.isplati());

        Spartak spartak = new Spartak(lista, "Subotica", 10000);
        spartak.dodajClana(s2);

        System.out.println(spartak);
        System.out.println(spartak.prosekPlata());
        spartak.removePreplaceni();
        System.out.println(spartak);













    }
}
