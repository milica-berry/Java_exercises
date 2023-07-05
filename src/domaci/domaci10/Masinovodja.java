package domaci.domaci10;

public class Masinovodja extends Radnik{

    public Masinovodja(String ime, double brojOdradjenihSatiUNedelji, double satnica) {
        super(ime, brojOdradjenihSatiUNedelji, satnica);
    }

    @Override
    public boolean daLiJeRadnikNaOdmoru() {
        return getBrojOdradjenihSatiUNedelji() > 30;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getIme()).append(" cija je satnica ").append(getSatnica()).append(" dinara, odradio je ")
                .append(getBrojOdradjenihSatiUNedelji()).append(" sati u nedelji.");
        return sb.toString();
    }
}
