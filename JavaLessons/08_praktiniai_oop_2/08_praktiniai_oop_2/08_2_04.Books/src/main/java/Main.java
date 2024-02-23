import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

//        book
//        title
//        numberOfPages
//        publication year

//       nameOfBook.equals("") = break;
//       user is asked what is printed
//        if input = everything = all details printed
//        if name = only book name
//
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner= new Scanner(System.in);

        while(true){
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.equals("")){
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine());
            Book newBook = new Book(title, pages, year);
            bookList.add(newBook);
        }

        System.out.println("What information will be printed?");
        String answer = scanner.nextLine();
        if (answer.equals("everything")){
            for (Book book : bookList){
                System.out.println(book);
            }
        }else if(answer.equals("name")){
            for (Book book : bookList){
                System.out.println(book.getTitle());
            }
        }

    }
}
