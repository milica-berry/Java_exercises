package domaci.domaci10;

public class Fizikalac extends Radnik{

    public Fizikalac(String ime, double brojOdradjenihSatiUNedelji, double satnica) {
        super(ime, brojOdradjenihSatiUNedelji, satnica);
    }

    @Override
    public boolean daLiJeRadnikNaOdmoru() {
            return getBrojOdradjenihSatiUNedelji() > 40;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getIme()).append(" cija je satnica ").append(getSatnica()).append(" dinara, odradio je ")
                .append(getBrojOdradjenihSatiUNedelji()).append(" sati u nedelji.");
        return sb.toString();
    }


}
