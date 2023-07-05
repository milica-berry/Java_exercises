package domaci.domaci3;

import java.util.Scanner;

public class DrugiZadatak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int plata = 1000;

        System.out.println("Firma ima din: ");
        double dinaraFirme = sc.nextDouble();
        System.out.println("Zaposlenih: ");
        double zaposleni = sc.nextInt();

        for(double i = zaposleni; zaposleni >= 0; zaposleni--){

            if(dinaraFirme <= 0)
                break;

            if (zaposleni > 0) {
                dinaraFirme -= plata;
            }


        }
        System.out.println("Firmi je ostalo: " + dinaraFirme);


    }


    }

