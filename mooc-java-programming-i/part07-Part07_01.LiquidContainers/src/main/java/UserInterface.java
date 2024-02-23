/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamba
 */
public class UserInterface {

    private Container container;

    Container first = new Container();
    Container second = new Container();

    public void add(int amount) {
        if (amount + first.getCurrentAmount() > first.getMaxAmount()) {
            first.setCurrentAmount(first.getMaxAmount());
        } else {
            first.setCurrentAmount(first.getCurrentAmount() + amount);
        }

    }

    public void move(int amount) {

        if (first.getCurrentAmount() < amount && amount + second.getCurrentAmount() > second.getMaxAmount()) {
            second.setCurrentAmount(second.getMaxAmount());
            first.setCurrentAmount(0);
        } else if (amount + second.getCurrentAmount() > second.getMaxAmount()) {
            second.setCurrentAmount(second.getMaxAmount());
            first.setCurrentAmount(0);

        } else if (first.getCurrentAmount() < amount) {

            second.setCurrentAmount(first.getCurrentAmount());
            first.setCurrentAmount(0);
        } else {
            second.setCurrentAmount(amount);
            first.setCurrentAmount(first.getCurrentAmount() - amount);
        }

    }

    public void remove(int amount) {
        if (second.getCurrentAmount() < amount) {
            second.setCurrentAmount(0);
        } else {
            second.setCurrentAmount(second.getCurrentAmount() - amount);
        }

    }

    public void printResult() {
        System.out.println("First: " + first.getCurrentAmount() + "/100");
        System.out.println("Second: " + second.getCurrentAmount() + "/100");
    }

    @Override
    public String toString() {
        String firstContainerOutput = "First: " + first.getCurrentAmount() + "/100";
        String secondContainerOutput = "Second: " + second.getCurrentAmount() + "/100";
        return firstContainerOutput + "\n" + secondContainerOutput;
    }

}
