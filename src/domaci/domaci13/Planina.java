package domaci.domaci13;

public class Planina {

    private double visinaPlanine;
    private String nazivPlanine;

    public Planina(double visinaPlanine, String nazivPlanine) {
        this.visinaPlanine = visinaPlanine;
        this.nazivPlanine = nazivPlanine;
    }

    public Planina() {
        this.nazivPlanine = "";
    }


    public double getVisinaPlanine() {
        return visinaPlanine;
    }

    public void setVisinaPlanine(double visinaPlanine) {
        this.visinaPlanine = visinaPlanine;
    }

    public String getNazivPlanine() {
        return nazivPlanine;
    }

    public void setNazivPlanine(String nazivPlanine) {
        this.nazivPlanine = nazivPlanine;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Planina ").append(nazivPlanine).append(" visoka je ").append(visinaPlanine).append(" metara.");
        return sb.toString();
    }
}
