package domaci.domaci6;

import java.util.Scanner;

public class PrviZadatakAiB {

    static int[] ubaciBrojeve(int velicinaNiza){
        int[] niz = new int[velicinaNiza];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < velicinaNiza; i++) {
            System.out.println("Unesi broj: ");
            int broj = sc.nextInt();
            niz[i] = broj;

        }

        for (int i = 0; i < velicinaNiza; i++) {
            System.out.println("Element: ");
            System.out.println(niz[i] + " ");

        }
        System.out.println();
        return niz;
    }

    static int[] neparniUParni(int[] niz){

        int[] noviNiz = new int [niz.length];

        for (int i = 0; i < noviNiz.length; i++) {
            int broj = niz[i];
            if(broj % 2 != 0){
                broj++;
            }
            niz[i] = noviNiz[i];
            noviNiz[i] += broj;
            
        }
        return noviNiz;
    }

    public static void main(String[] args) {
        /*a) Napraviti funkciju za ubacivanje celih brojeva u niz.
        U parametru metoda cemo imati broj koji predstavlja velicinu
        niza, unutar funkcije cemo ubacivati elemente u niz
        i vratiti konacan niz.

        b) Proci kroz zadati niz iz primera a)
        i svaki neparan broj pretvoriti u parni.

        */

        Scanner skener = new Scanner(System.in);
        System.out.println("Unesi velicinu niza: ");
        int velicinaMogNiza = skener.nextInt();



       int[] niz = ubaciBrojeve(velicinaMogNiza);
        System.out.println("Niz pre izmene: ");
        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]);

        }

        System.out.println("Niz nakon izmene: ");
        int[] noviNiz = neparniUParni(niz);

        for (int i = 0; i < noviNiz.length; i++) {
            System.out.println(noviNiz[i]);

        }




        }


    }




