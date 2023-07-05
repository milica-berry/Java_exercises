package domaci.domaci13;

import java.util.ArrayList;

public class Planinar implements Planinarenje {


    private ArrayList<Planina> listaPlanina;
    private double maxUspon;
    private double tezinaOpreme;

    public Planinar(ArrayList<Planina> listaPlanina, double maxUspon, double tezinaOpreme) {
        this.listaPlanina = listaPlanina;
        this.maxUspon = maxUspon;
        this.tezinaOpreme = tezinaOpreme;
    }



    public Planinar() {
        this.listaPlanina = new ArrayList<>();
    }


    @Override
    public void popniSe(Planina p) {
            if(p.getVisinaPlanine() < maxUspon)
                listaPlanina.add(p);


    }

    @Override
    public double clanarina() {
        double originalnaClanarina = 1000;
        double novaClanarina = originalnaClanarina - (listaPlanina.size() * (1000 * 0.02));

        return novaClanarina;
    }

    @Override
    public double sviUsponi() {
        double sumaVisina = 0;
        for (Planina p : listaPlanina ) {
            sumaVisina += p.getVisinaPlanine();

        }
        return sumaVisina;
    }

    public Planina najvecaPlanina(){
        Planina trenutnaPlanina = listaPlanina.get(0);
        for (Planina planina : listaPlanina ) {
            if(planina.getVisinaPlanine() > trenutnaPlanina.getVisinaPlanine())
                trenutnaPlanina = planina;

        }
        return trenutnaPlanina;
    }

    public ArrayList<Planina> getListaPlanina() {
        return listaPlanina;
    }

    public void setListaPlanina(ArrayList<Planina> listaPlanina) {
        this.listaPlanina = listaPlanina;
    }

    public double getMaxUspon() {
        return maxUspon;
    }

    public void setMaxUspon(double maxUspon) {
        this.maxUspon = maxUspon;
    }

    public double getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(double tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Planinar se popeo na sledece planine: \n")
                .append(listaPlanina).append("\n")
                .append("Maksimalna visina na koju planinar moze da se popne je ").append(maxUspon)
                .append(" sa tezinom opreme od ").append(tezinaOpreme).append(" kila.");
        return sb.toString();
    }


}
