package domaci.domaci8;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        AutoSkola auto = new AutoSkola("AutoMoto", 10, 10000, "auto");
        AutoSkola motor = new AutoSkola("AutoMoto", 10, 15000, "motor");



        System.out.println(motor);
        motor.snizenjeCeneZaMotor();
        System.out.println(motor);

        System.out.println(auto.podelaUGrupe() + motor.podelaUGrupe());

        Scanner sc = new Scanner(System.in);
        String tipVozilaKorisnik = sc.nextLine();
        auto.polaganjeZaAutobus(tipVozilaKorisnik);

    }
}
