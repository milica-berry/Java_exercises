package domaci.domaci11;

public class Sportista {

    private static int JMBG = 0;


    private String ime;
    private double plata;
    private final int jmbg;
    public Sportista(String ime, double plata) {
        this.ime = ime;
        this.plata = plata;
        jmbg = JMBG;
        JMBG++;

    }


    public int getJmbg() {
        return jmbg;
    }

    public static int getJMBG() {
        return JMBG;
    }

    public static void setJMBG(int JMBG) {
        Sportista.JMBG = JMBG;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" ").append(" ima platu u vrednosti od ").append(plata).append(" dinara");
        return sb.toString();
    }
}
