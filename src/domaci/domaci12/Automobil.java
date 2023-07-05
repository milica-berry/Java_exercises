package domaci.domaci12;

import java.util.ArrayList;

public class Automobil extends MotornoVozilo {

    private int ukupanBrojTockova = 6;

    public Automobil(ArrayList<Tocak> listaTockova, double cena, int godinaProizvodnje) {
        super(listaTockova, cena, godinaProizvodnje);
    }


    public Automobil() {
    }

    @Override
    public boolean daLiJeOstecen() {
        for (Tocak t : getListaTockova()) {
            if (t.getKolikoJeProsloDana() < 365)
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
