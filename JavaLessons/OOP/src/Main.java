public class Main {
    public static void main(String[] args) {

        InvoiceItem i = new InvoiceItem("123", "apples", 5, 0.1);
//        System.out.println(i.toString());

        Account a = new Account("123", "Vytauts", 25);
        System.out.println(a.toString());
        System.out.println();
        Account b = new Account("123", "Jons", 40);
        System.out.println(b.toString());

        Date  date  = new Date (31, 12, 2023);
        System.out.println(date.toString());

    }
}


