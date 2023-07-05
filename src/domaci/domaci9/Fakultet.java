package domaci.domaci9;

import java.util.ArrayList;

public class Fakultet {

    private String naziv;
    private ArrayList<Departman> listaDepartmana;
    private Departman departman;
    private Departman brojStudenata;
    private Departman brojStrucnihPredmeta;







    public Fakultet (String naziv, ArrayList<Departman> listaDepartmana ){
        this.naziv = naziv;
        this.listaDepartmana = listaDepartmana;
    }

    public Fakultet(String naziv, Departman ... listaDepartamana) {
        this.naziv = naziv;
        this.listaDepartmana = new ArrayList<>();
        for (Departman d : listaDepartamana)
            this.listaDepartmana.add(d);
    }



    public Fakultet(String nazivFakulteta, String nazivDepartmana, int brojStudenata, int brojStrucnihPredmeta){
        this.naziv = nazivFakulteta;
        this.departman = new Departman(nazivDepartmana, brojStudenata, brojStrucnihPredmeta);
    }


    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Departman getBrojStrucnihPredmeta() {
        return brojStrucnihPredmeta;
    }

    public void setBrojStrucnihPredmeta(Departman brojStrucnihPredmeta) {
        this.brojStrucnihPredmeta = brojStrucnihPredmeta;
    }

    public ArrayList<Departman> getListaDepartmana() {
        return listaDepartmana;
    }

    public void setListaDepartmana(ArrayList<Departman> listaDepartmana) {
        this.listaDepartmana = listaDepartmana;
    }

    public Departman getDepartman() {
        return departman;
    }

    public void setDepartman(Departman departman) {
        this.departman = departman;
    }

    public Departman getBrojStudenata() {
        return brojStudenata;
    }

    public void setBrojStudenata(Departman brojStudenata) {
        this.brojStudenata = brojStudenata;
    }

    public int ukupanBrojUcenika(){
        int ukupanBrojUcenika = 0;
        for (Departman d : listaDepartmana) {
            ukupanBrojUcenika += d.getBrojStudenata();
        }

        return ukupanBrojUcenika;
    }




    public void dodavanjeBrojaStrucnihPredmeta() {
        for (Departman departman : listaDepartmana) {
            if (departman.getNazivDepartmana().equalsIgnoreCase("Biologija") || departman.getNazivDepartmana().equalsIgnoreCase("Matematika")) {
                int brojStrucnihPredmeta = departman.getBrojStrucnihPredmeta() + 5;
                departman.setBrojStrucnihPredmeta(brojStrucnihPredmeta);
            }
        }
    }

    private void dodajDepartman(Departman departman){
        this.departman = departman;
        listaDepartmana.add(departman);
    }



    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Na fakultetu ").append(naziv).append(" lista departamana je:\n");
        for (Departman d : listaDepartmana)
            sb.append(d.toString()).append("\n");

        return sb.toString();
    }





}
