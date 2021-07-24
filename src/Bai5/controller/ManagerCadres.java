package Bai5.controller;

import Bai5.model.Cadres;

import java.util.ArrayList;
import java.util.List;

public class ManagerCadres {
    private List<Cadres> list = new ArrayList<>();


    public void addNewCadres(Cadres newCadres) {
        list.add(newCadres);
    }

    public int findCadresByName(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name))
                return i;
        }
        return -1;
    }

    public String displayInforCadres(Cadres cadres) {
        return cadres.toString();
    }

    public void showAll() {
        for (Cadres cadres : list) {
            System.out.println(cadres);
        }
    }

    public void editInforCadres(int index, Cadres cadres) {
        list.remove(index);
        list.add(index, cadres);
    }
}
