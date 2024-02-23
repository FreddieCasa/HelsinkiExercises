
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {

        String outPut = "The collection " + name;
        String listItems = "";
        int count = 0;
        for (String element : elements) {
            listItems = listItems + element + "\n";
            count++;
        }

        if (elements.isEmpty()) {
            return outPut + " is empty.";
        } else if (elements.size() == 1) {
            return outPut + " has " + count + " element:\n" + elements.get(0);
        } else {
            return outPut + " has " + count + " elements:\n" + listItems;
        }

    }

}
