
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lamba
 */
public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();

    }

    public int getMaximumWeight() {
        return maximumWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() > getMaximumWeight()) {

        } else {
            suitcases.add(suitcase);

        }

    }

    public int totalWeight() {
        int y = 0;
        for (Suitcase item : suitcases) {
            y = y + item.totalWeight();
        }
        return y;
    }

    public void printItems() {
        for (Suitcase item : suitcases) {
            item.printItems();
        }
    }

    @Override
    public String toString() {
        int x = suitcases.size();
        int y = 0;
        for (Suitcase item : suitcases) {
            y = y + item.totalWeight();
        }
        return x + " suitcases" + "(" + y + " kg)";
    }

}
