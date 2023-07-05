package domaci.domaci10;

import java.util.ArrayList;

public class Radnik {

    private String ime;
    private double brojOdradjenihSatiUNedelji;
    private double satnica;
    private SefSmene nedeljniDodatak;

    public Radnik(String ime, double brojOdradjenihSatiUNedelji, double satnica) {
        this.ime = ime;
        this.brojOdradjenihSatiUNedelji = brojOdradjenihSatiUNedelji;
        this.satnica = satnica;
    }



    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getBrojOdradjenihSatiUNedelji() {
        return brojOdradjenihSatiUNedelji;
    }

    public void setBrojOdradjenihSatiUNedelji(double brojOdradjenihSatiUNedelji) {
        this.brojOdradjenihSatiUNedelji = brojOdradjenihSatiUNedelji;
    }

    public double getSatnica() {
        return satnica;
    }

    public void setSatnica(double satnica) {
        this.satnica = satnica;
    }

    public SefSmene getNedeljniDodatak() {
        return nedeljniDodatak;
    }



    public void setNedeljniDodatak(SefSmene nedeljniDodatak) {
        this.nedeljniDodatak = nedeljniDodatak;
    }


    public double ukupnoZaradjenihPara(){

        return brojOdradjenihSatiUNedelji * satnica;
    }

    public boolean daLiJeRadnikNaOdmoru(){
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" cija je satnica ").append(satnica).append(" dinara, odradio je ")
                .append(brojOdradjenihSatiUNedelji).append(" sati u nedelji.");
        return sb.toString();
    }
}
