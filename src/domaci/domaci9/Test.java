package domaci.domaci9;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Departman biologija = new Departman("Biologija", 10, 10);
        Departman ekologija = new Departman("Ekologija", 15, 10);


        System.out.println(biologija);
        System.out.println(ekologija);

        System.out.println(biologija.getBrojStudenata());
        System.out.println(ekologija.getBrojStudenata());

        Fakultet fakultet1 = new Fakultet("Bioloski fakultet", biologija, ekologija);

        System.out.println(fakultet1);

        System.out.println(fakultet1.ukupanBrojUcenika());

        fakultet1.dodavanjeBrojaStrucnihPredmeta();
        fakultet1.dodavanjeBrojaStrucnihPredmeta();

        System.out.println(biologija.getBrojStrucnihPredmeta());






    }
}
