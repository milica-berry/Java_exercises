package domaci.domaci6;

import java.util.Scanner;

public class Proba {


    static int[] pravimNiz(Scanner skener1, int velicinaNiza){
        int[] niz = new int [velicinaNiza];
        for (int i = 0; i < velicinaNiza; i++) {
            System.out.println("Unesi broj: ");
            int broj = skener1.nextInt();
            niz[i] = broj;
        }
        for (int i = 0; i < velicinaNiza; i++) {
            System.out.println("Element: ");
            System.out.println(niz[i] + " ");

        }
        System.out.println();
        return niz;
    }



    public static void main(String[] args){

        /*a) Napraviti funkciju za ubacivanje celih brojeva u niz.
        U parametru metoda cemo imati broj koji predstavlja velicinu
        niza, unutar funkcije cemo ubacivati elemente u niz
        i vratiti konacan niz.

        b) Proci kroz zadati niz iz primera a)
        i svaki neparan broj pretvoriti u parni.

        */

            Scanner skener2 = new Scanner(System.in);

            System.out.println("Unesite velicinu niza: ");
            int nasaVelicinaNiza = skener2.nextInt();


        }

    }


