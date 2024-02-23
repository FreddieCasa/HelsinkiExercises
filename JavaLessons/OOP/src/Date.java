public class Date {
    private int day;
    private int month;
    private int year;

    public Date (int day, int Month, int Year){
        this.day = day;
        this.month = Month;
        this.year = Year;
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int dy, int month, int year){

    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%4d", month, day, year);
    }
}
