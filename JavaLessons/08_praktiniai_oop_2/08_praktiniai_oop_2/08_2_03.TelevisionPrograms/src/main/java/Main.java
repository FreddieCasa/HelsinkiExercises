import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.equals("")){
                break;
            }
            System.out.print("Duration: ");
            Integer duration = Integer.valueOf(scanner.nextLine());
            TelevisionProgram program = new TelevisionProgram(name, duration);
            programs.add(program);

        }
        System.out.print("Program's maximum duration? ");
        Integer maxDuration = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram program:programs){
            if (program.getDuration()<=maxDuration){
//                break;
                System.out.println(program);
            }

        }
    }
}
