package domaci.domaci8;


public class AutoSkola {


    String naziv;
    int brojLjudi;
    double cenaPolaganja;
    String tipVozila;

    public AutoSkola(String naziv, int brojLjudi, double cenaPolaganja, String tipVozila){
        this.naziv = naziv;
        this.brojLjudi = brojLjudi;
        this.cenaPolaganja = cenaPolaganja;
        this.tipVozila = tipVozila;
    }

    public void snizenjeCeneZaMotor(){
        if(tipVozila .equalsIgnoreCase("motor")){
            cenaPolaganja *= 0.5;
        }
    }

    public int podelaUGrupe(){
        int brojGrupa;
        brojGrupa = brojLjudi / 5;
        return brojGrupa;
    }

    public void polaganjeZaAutobus(String tipVozila){
        if(tipVozila .equalsIgnoreCase("auto") || tipVozila .equalsIgnoreCase("motor")){
            System.out.println("Polaganje je moguce.");
        }
        else System.out.println("Nije moguce polagati u ovom trenutku.");



    }

    @Override
    public String toString(){
        return "U auto skoli " + naziv + " za " + brojLjudi + " polaznika, cena polaganja za " + tipVozila + " je " + cenaPolaganja + " dinara.";
    }
}
