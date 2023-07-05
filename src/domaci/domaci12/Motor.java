package domaci.domaci12;

import java.util.ArrayList;

public class Motor extends MotornoVozilo{

    private int ukupanBrojTockova = 3;
    public Motor(ArrayList<Tocak> listaTockova, double cena, int godinaProizvodnje) {
        super(listaTockova, cena, godinaProizvodnje);
    }

    public Motor() {
    }

    @Override
    public boolean daLiJeOstecen() {
        for (Tocak t: getListaTockova()) {
            if(t.getKolikoJeProsloDana() < 200)
                return t.isOstecenje();
        }
        return false;
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
