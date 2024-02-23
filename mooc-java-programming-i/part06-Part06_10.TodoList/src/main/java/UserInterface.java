
import java.util.Scanner;

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

    private TodoList toDoList;
    private Scanner scanner;

    public UserInterface(TodoList toDoList, Scanner scanner) {
        this.toDoList = toDoList;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {

            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;

            } else if (command.equals("add")) {
                System.out.println("To add: ");
                String task = scanner.nextLine();
                toDoList.add(task);

            } else if (command.equals("list")) {
                toDoList.print();
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                String removeCommand = scanner.nextLine();
                toDoList.remove(Integer.valueOf(removeCommand));
            }
        }
    }

}
