package domaci.domaci12;

public class Tocak {

    private int kolikoJeProsloDana;
    private boolean ostecenje;
    private double cena;

    public Tocak(int kolikoJeProsloDana, double cena) {
        this.kolikoJeProsloDana = kolikoJeProsloDana;

        this.cena = cena;
    }

    public Tocak() {
        kolikoJeProsloDana = 0;
        cena = 0;
    }

    public int getKolikoJeProsloDana() {
        return kolikoJeProsloDana;
    }

    public void setKolikoJeProsloDana(int kolikoJeProsloDana) {
        this.kolikoJeProsloDana = kolikoJeProsloDana;
    }

    public boolean isOstecenje() {
        return ostecenje;
    }

    public void setOstecenje(boolean ostecenje) {
        this.ostecenje = ostecenje;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tocak koriscen ").append(kolikoJeProsloDana).append(" dana, kostao je: ").append(cena);
        return sb.toString();
    }
}
