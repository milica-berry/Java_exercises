package domaci.domaci11;

import java.util.ArrayList;

public class SportskiKlub {


    private ArrayList<Sportista> listaClanovaKluba;
    private String grad;
    private double budzet;

    public SportskiKlub(ArrayList<Sportista> listaClanovaKluba, String grad, double budzet) {
        this.listaClanovaKluba = listaClanovaKluba;
        this.grad = grad;
        this.budzet = budzet;
    }



    public SportskiKlub() {
        this.listaClanovaKluba = new ArrayList<>();
    }

    public void dodajClana(Sportista sportista){
        listaClanovaKluba.add(sportista);
    }

    public ArrayList<Sportista> getListaClanovaKluba() {
        return listaClanovaKluba;
    }

    public void setListaClanovaKluba(ArrayList<Sportista> listaClanovaKluba) {
        this.listaClanovaKluba = listaClanovaKluba;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public double getBudzet() {
        return budzet;
    }

    public void setBudzet(double budzet) {
        this.budzet = budzet;
    }

    public double isplati(){
        double sumaPlata = 0;
        for (Sportista d : listaClanovaKluba) {
            sumaPlata += d.getPlata();
        }
        return budzet - sumaPlata;
    }

    public double prosekPlata(){
        double sumaPlata = 0;
        for (Sportista s : listaClanovaKluba) {
            sumaPlata += s.getPlata();
        }

        return sumaPlata / listaClanovaKluba.size();
    }

    public void removePreplaceni(){
        listaClanovaKluba.removeIf(s -> s.getPlata() > prosekPlata());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sportski klub poreklom iz grada ").append(grad).append(" sa budzetom od ")
                .append(budzet).append(" dinara, ima sledece clanove kluba:\n");
        sb.append(listaClanovaKluba.toString()).append("\n");
        return sb.toString();
    }
}
