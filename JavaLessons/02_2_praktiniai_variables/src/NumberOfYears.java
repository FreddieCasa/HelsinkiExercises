import java.util.Scanner;

public class NumberOfYears {

    public static void main (String[] args) {
        Scanner reader= new Scanner(System.in);
        System.out.println ("Enter the number of minutes:");
        int minutes= Integer.parseInt(reader.nextLine());
        int minutesInYear = 525600;
        int daysInYear=365;
        int years=minutes/minutesInYear;
        double years2=(double) minutes/minutesInYear;
        double years3=(double) years2 - years;
        double daysD=(double)years3*daysInYear;
        int days= (int) daysD;
        System.out.println (minutes + " minutes is approximately " + years + " years " + " and " + days + " days");
    }
}

