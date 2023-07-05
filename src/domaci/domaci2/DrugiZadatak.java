package domaci.domaci2;

import java.util.Scanner;

public class DrugiZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cenaRuza = 50;
        double cenaZumbul = cenaRuza + 20;
        double cenaOrhideja = cenaZumbul * 2.5;
        double cenaBonzai = cenaOrhideja * 3;

        String ruza = "Ruza";
        String zumbul = "Zumbul";
        String orhideja = "Orhideja";
        String bonzai = "Bonzai";

        System.out.println("Unesite cvet: ");
        String imeCveta = sc.nextLine();

        if (imeCveta .equals(ruza)) {
            System.out.println("Imamo Ruzu: " + cenaRuza);
        }
        else if (imeCveta .equals(zumbul)) {
            System.out.println("Imamo Zumbul: " + cenaZumbul);

        }
        else if ( imeCveta.equals(orhideja)) {
            System.out.println("Imamo Orhideju: " + cenaOrhideja);

        }
        else if (imeCveta.equals(bonzai)) {
            System.out.println("Imamo Bonzai: " + cenaBonzai);
        }
        else {
            System.out.println("Pogresan unos ili nepostojeci cvet na lageru!");
        }










    }
}
