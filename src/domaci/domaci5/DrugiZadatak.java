package domaci.domaci5;

public class DrugiZadatak {
    public static void main(String[] args) {
    /*Definisati dva jednaka niza brojeva, kao rezultat vratiti niz
    gde ce se sabrati svi elementi sa istim indeksima. */

        int[] nizBrojeva1 = {1, 2, 3};
        int[] nizBrojeva2 = {2, 4, 5};

        int[] nizBrojeva3 = new int[3];

        for (int i = 0; i < nizBrojeva1.length; i++) {
            System.out.println("Niz 1: " + nizBrojeva1[i]);

            }
        System.out.println("====================");
        for (int i = 0; i < nizBrojeva2.length; i++) {
                System.out.println("Niz 2: " + nizBrojeva2[i]);
        }
        System.out.println("====================");

        for (int i = 0; i < nizBrojeva3.length; i++) {
            nizBrojeva3[i] += nizBrojeva1[i] + nizBrojeva2[i];
            System.out.println("Niz 3: " + nizBrojeva3[i]);





            }









    }
}
