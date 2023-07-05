package domaci.domaci4;

import java.util.Scanner;

public class PrviZadatak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i = 1; i < n; i++) {

            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i + ": FizzBuzz");
                continue;
            }
            if(i % 3 == 0){
                System.out.println(i + ": Fizz");
                continue;
            }
            if(i % 5 == 0){
                System.out.println(i + ": Buzz");
                continue;
            }


            System.out.println(i);


        }

    }


}
