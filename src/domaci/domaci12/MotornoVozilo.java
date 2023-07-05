package domaci.domaci12;

import java.util.ArrayList;

public abstract class MotornoVozilo {
    private ArrayList<Tocak> listaTockova;
    private double cena;
    private int godinaProizvodnje;

    public MotornoVozilo(ArrayList<Tocak> listaTockova, double cena, int godinaProizvodnje) {
        this.listaTockova = listaTockova;
        this.cena = cena;
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public MotornoVozilo() {
        listaTockova = new ArrayList<>();
    }

    public ArrayList<Tocak> getListaTockova() {
        return listaTockova;
    }

    public void setListaTockova(ArrayList<Tocak> listaTockova) {
        this.listaTockova = listaTockova;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }




    public abstract boolean daLiJeOstecen();
    public abstract void removeOstecenu();
    public abstract void ubaciRezervnu();




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motorno vozilo tipa ").append(getClass()).append(" koje kosta ").append(getCena())
                .append(" i proizvedeno je ").append(getGodinaProizvodnje()).append(" godine, poseduje listu tockova:\n")
                .append(getListaTockova().toString()).append("\n");
        return sb.toString();
    }


}
