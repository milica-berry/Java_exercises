package domaci.domaci5;

import java.util.Scanner;

public class PrviZadatak {
    public static void main(String[] args) {
    /*
     * Zadatak 3: Definisati neki niz imena. Uneti ime preko Scannera koje ce
     * vratiti poruku ukoliko se uneto ime nalazi u nizu.
     * Na Zadatku 3 sa casa dodati funkcionalnost koja ispisuje koliko puta se neko ime pojavljuje u nizu.
     */

        String[] nizImena = {"Ana", "Lana", "Jana", "Dana", "Brana", "Ana", "Ana"};
        String unesenoIme;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nizImena.length; i++) {
            System.out.println("Ime: " + nizImena[i]);


        }
        System.out.println("Unesite ime: ");
        unesenoIme = sc.nextLine();

        int ponavljanjeImena = 0;

        for (int i = 0; i < nizImena.length; i++) {

            if(unesenoIme .equalsIgnoreCase(nizImena[i])){
                ponavljanjeImena++;
            }
        }
        System.out.println("Ime: " + unesenoIme + " se pojavljuje: " + ponavljanjeImena + " puta.");


    }

}
