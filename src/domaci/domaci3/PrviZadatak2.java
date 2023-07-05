package domaci.domaci3;

import java.util.Scanner;

public class PrviZadatak2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.println("Unesite String:");
        String s = sc.nextLine();
        String rezultat = s;

        for(int brojac = 0; brojac < 100; brojac++){
            if(s .equalsIgnoreCase("stop")){
                break;
            }
            else {
                s = sc.nextLine();
                if(!s .equalsIgnoreCase("stop"))     {
                    rezultat = rezultat + " " + s;
                }
            }
        }
        System.out.println(rezultat);


    }
}
