package domaci.domaci4;

public class DrugiZadataka {
    public static void main(String[] args) {


        int [] niz = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < niz.length; i++){

            if(niz[i] % 2 == 0)
                   System.out.println(niz[i] + 1);
            else {
                System.out.println(niz[i]);
            }

        }





    }
}
