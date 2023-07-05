package domaci.domaci7;

import java.util.ArrayList;
import java.util.List;

public class Zadatak {

    static List<Integer> kreiranjeListe(){
        List<Integer> lista = new ArrayList<>(20);
        System.out.println("Lista 20 parnih brojeva: ");

        for (int i = 1; i <= 40; i++) {
                if(i % 2 == 0){
                    lista.add(i);
            }
        }

        return lista;
    }

    static List<Integer> eliminisanjeBrojevaDeljivihSa4(List<Integer> lista){
        List<Integer> listaBezBrojevaDeljivihSa4 = new ArrayList<>(lista);

        for (int i = 0; i < listaBezBrojevaDeljivihSa4.size(); i++) {
            if(listaBezBrojevaDeljivihSa4.get(i) % 4 == 0){
                listaBezBrojevaDeljivihSa4.remove(i);
            }
        }

        return listaBezBrojevaDeljivihSa4;
    }

    public static void main(String[] args) {


        List<Integer> mojaLista = kreiranjeListe();
        System.out.println(mojaLista);
        System.out.println(eliminisanjeBrojevaDeljivihSa4(mojaLista));
    }
}
