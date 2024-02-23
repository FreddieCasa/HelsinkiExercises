import java.util.Scanner;
public class Daysofmonth {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = Integer.parseInt(reader.nextLine());
        System.out.println("Enter month:");
        int month = Integer.parseInt(reader.nextLine());

        int daysInMonth;
        String monthName;

        switch (month) {
            case 1:
                daysInMonth = 31;
                monthName = "January";
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                monthName = "February";
                break;
            case 3:
                daysInMonth = 31;
                monthName = "March";
                break;
            case 4:
                daysInMonth = 30;
                monthName = "April";
                break;
            case 5:
                daysInMonth = 31;
                monthName = "May";
                break;
            case 6:
                daysInMonth = 30;
                monthName = "June";
                break;
            case 7:
                daysInMonth = 31;
                monthName = "July";
                break;
            case 8:
                daysInMonth = 31;
                monthName = "August";
                break;
            case 9:
                daysInMonth = 30;
                monthName = "September";
                break;
            case 10:
                daysInMonth = 31;
                monthName = "October";
                break;
            case 11:
                daysInMonth = 30;
                monthName = "November";
                break;
            case 12:
                daysInMonth = 31;
                monthName = "December";
                break;
            default:
                System.out.println("Invalid month number.");
                return;
        }


        System.out.println(monthName + " " + year + " has " + daysInMonth + " days.");

    }


}
