package domaci.domaci1;

public class PrviZadatak {
    public static void main(String[] args) {

        String imeIPrezime = "Pera Peric";
        System.out.println("Ime i prezime: " + imeIPrezime);

        int godinaRodjenja = 1990;
        System.out.println("Godina rodjenja: " + godinaRodjenja);

        int godineRadnogStaza = 25;
        System.out.println("Godine radnog staza: " + godineRadnogStaza);

        int trenutnaGodina = 2023;


        int godinaZaposlenja = trenutnaGodina - godineRadnogStaza;
        System.out.println("Godina zaposlenja: " + godinaZaposlenja);

    }
}
