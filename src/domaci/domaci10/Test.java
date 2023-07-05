package domaci.domaci10;

public class Test {
    public static void main(String[] args) {

        SefSmene sefSmene = new SefSmene("Ratko", 40, 1000, 5000);
        Masinovodja marko = new Masinovodja("Marko", 40, 1000);
        Fizikalac fica = new Fizikalac("Filip", 50, 500);

        System.out.println(sefSmene.ukupnoZaradjenihParaZaSefaSmene());
        System.out.println(marko.ukupnoZaradjenihPara());

        System.out.println(sefSmene.daLiJeRadnikNaOdmoru());
        System.out.println(marko.daLiJeRadnikNaOdmoru());
        System.out.println(fica.daLiJeRadnikNaOdmoru());




    }
}
