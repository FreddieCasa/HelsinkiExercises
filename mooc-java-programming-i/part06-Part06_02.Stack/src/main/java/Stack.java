
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
public class Stack {

    private ArrayList<String> aListOfStrings;

    public Stack() {

        this.aListOfStrings = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (aListOfStrings.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
//dds the value given as a parameter to the top of the stack.

    public void add(String value) {
        aListOfStrings.add(0, value);
    }

    public ArrayList<String> values() {
        return aListOfStrings;
    }

    public String take() {

        String taken = aListOfStrings.get(0);
        aListOfStrings.remove(0);

        return taken;
    }

    @Override
    public String toString() {
        return "aListOfStrings=" + aListOfStrings;
    }

}
