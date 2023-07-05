package domaci.domaci12;

import java.util.ArrayList;

public class Test {


    public static void main(String[] args) {

        Tocak t1 = new Tocak(130, 2000);
        ArrayList<Tocak> listaTockova1 = new ArrayList<>();
        listaTockova1.add(t1);
        MotornoVozilo kamion1 = new Kamion(listaTockova1, 15000, 2000);
        System.out.println(kamion1.getListaTockova());
        System.out.println(kamion1.daLiJeOstecen());
        kamion1.removeOstecenu();
        System.out.println(kamion1.getListaTockova());

        ArrayList<Tocak> listaTockova2 = new ArrayList<>();
        Tocak t2 = new Tocak(350, 2000);
        listaTockova2.add(t2);

        MotornoVozilo automobil1 = new Automobil(listaTockova2, 10000, 2005);
        System.out.println(automobil1.daLiJeOstecen());
        automobil1.removeOstecenu();
        System.out.println(automobil1.getListaTockova());

        ArrayList<Tocak> listaTockova3 = new ArrayList<>();
        Tocak t3 = new Tocak(5, 1000);
        listaTockova3.add(t3);


        MotornoVozilo motor1 = new Motor(listaTockova3, 30000, 2022);
        System.out.println(motor1.getListaTockova());
        motor1.ubaciRezervnu();
        System.out.println(motor1.getListaTockova());



    }
}
