package domaci.domaci9;

public class Departman {

    private String nazivDepartmana;
    private int brojStudenata;
    private int brojStrucnihPredmeta;


    public Departman(String nazivDepartmana, int brojStudenata, int brojStrucnihPredmeta){
        this.nazivDepartmana = nazivDepartmana;
        this.brojStudenata = brojStudenata;
        this.brojStrucnihPredmeta = brojStrucnihPredmeta;

    }


    public String getNazivDepartmana() {
        return nazivDepartmana;
    }

    public int getBrojStudenata() {
        return brojStudenata;
    }

    public int getBrojStrucnihPredmeta() {
        return brojStrucnihPredmeta;
    }

    public void setNazivDepartmana(String nazivDepartmana) {
        this.nazivDepartmana = nazivDepartmana;
    }

    public void setBrojStudenata(int brojStudenata) {
        if(brojStudenata > 0)
        this.brojStudenata = brojStudenata;
        else
            System.out.println("Broj studenata ne moze biti negativan broj.");
    }

    public void setBrojStrucnihPredmeta(int brojStrucnihPredmeta) {
        if(brojStrucnihPredmeta > 0)
        this.brojStrucnihPredmeta = brojStrucnihPredmeta;
        else
            System.out.println("Broj strucnih predmeta ne moze biti negativan broj");
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Departman ").append(nazivDepartmana).append(" pohadja ").append(brojStudenata).append(" studenata i on poseduje ").append(brojStrucnihPredmeta).append(" strucnih predmeta.");

    return sb.toString();
    }
}
