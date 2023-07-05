package domaci.domaci12;

import java.util.ArrayList;

public class Kamion extends MotornoVozilo {

    private int ukupanBrojTockova = 12;

    public Kamion(ArrayList<Tocak> listaTockova, double cena, int godinaProizvodnje) {
        super(listaTockova, cena, godinaProizvodnje);
    }

    public Kamion() {
    }

    /*-daLiJeOStecen -> Koji proverava koliko je Tocak koriscen, ako Kamion koristi Tocak vise
    od 120 dana - ostecen*/
    @Override
    public boolean daLiJeOstecen() {
        for (Tocak t : getListaTockova()) {
            if (t.getKolikoJeProsloDana() < 120)
                return t.isOstecenje();
        }
        return true;
    }

    @Override
    public void removeOstecenu() {
        getListaTockova().removeIf(t -> daLiJeOstecen());

    }


    @Override
    public void ubaciRezervnu() {
        int kolikoFaliTockova = ukupanBrojTockova - getListaTockova().size();
        for (int i = 0; i < kolikoFaliTockova; i++) {
            Tocak nekiTocak = new Tocak();
            getListaTockova().add(nekiTocak);

        }


    }

}
