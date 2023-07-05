package domaci.domaci10;

public class SefSmene extends Radnik {

    private double nedeljniBonus;


    public SefSmene(String ime, double brojOdradjenihSatiUNedelji, double satnica, double nedeljniBonus) {
        super(ime, brojOdradjenihSatiUNedelji, satnica);
        this.nedeljniBonus = nedeljniBonus;
    }

    public SefSmene(Radnik r, double nedeljniBonus) {
        super(r.getIme(), r.getBrojOdradjenihSatiUNedelji(), r.getSatnica());
    }

    public double getNedeljniBonus() {
        return nedeljniBonus;
    }

    public void setNedeljniBonus(double nedeljniBonus) {
        this.nedeljniBonus = nedeljniBonus;
    }

    @Override
    public boolean daLiJeRadnikNaOdmoru() {
        return getBrojOdradjenihSatiUNedelji() > 50;
    }

    public double ukupnoZaradjenihParaZaSefaSmene(){
        return super.ukupnoZaradjenihPara()+ nedeljniBonus;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getIme()).append(" cija je satnica ").append(getSatnica()).append(" dinara, odradio je ")
                .append(getBrojOdradjenihSatiUNedelji()).append(" sati u nedelji.");
        return sb.toString();
    }
}
