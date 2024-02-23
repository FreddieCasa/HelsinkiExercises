
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
public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> items;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();

    }

    public int getMaximumWeight() {
        return maximumWeight;
    }

    public void addItem(Item item) {

        if (totalWeight() + item.getWeight() > getMaximumWeight()) {

        } else {
            items.add(item);

        }

    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int y = 0;
        for (Item item : items) {
            y = y + item.getWeight();
        }
        return y;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviest = items.get(0);

        for (Item item : items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }

        }
        return heaviest;
    }

    @Override
    public String toString() {

        if (items.isEmpty()) {
            return "no items (0 kg)";
        } else if (items.size() == 1) {
            return items.size() + " item " + "(" + totalWeight() + " kg)";

        } else {
            return items.size() + " items " + "(" + totalWeight() + " kg)";
        }

    }

}
