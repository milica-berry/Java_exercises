package domaci.domaci2;

import java.util.Scanner;

public class PrviZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Uneti koliko din po satu: ");
        int satnica = sc.nextInt();

        System.out.println("Uneti broj radnih sati: ");
        int brRadnihSati = sc.nextInt();

        if (satnica * brRadnihSati > 0) {
            System.out.println("Satnica je: " + satnica);
            System.out.println("Broj radnih sati je: " + brRadnihSati);
            System.out.println("Vasa plata je: " + satnica * brRadnihSati);
        }
        else {
            System.out.println("Neispravno uneti podaci! Ukupna plata ne moze biti negativna!");

        }







    }
}
