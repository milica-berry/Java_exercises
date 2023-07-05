package domaci.domaci3;

import java.util.Scanner;

public class PrviZadatak {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite String: ");
        String s = sc.nextLine();
        String unetiStringovi = "";

        for (int brojac = 0; brojac < 100; brojac++) {
            if(!s .equalsIgnoreCase("stop")){
                unetiStringovi = unetiStringovi + s + " ";
                s = sc.nextLine();
            }


        }

        System.out.println(unetiStringovi);



    }
}
