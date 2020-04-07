package OOP_HW5;

import sun.font.TrueTypeFont;

import java.util.Arrays;
import java.util.Scanner;

public class Library {

     Book[] books;

    public Library(Book[] books)
    {
        this.books = books;
    }

    public void searchByAuthor() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите автора: ");
        String author = scan.nextLine();
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals(author)) {
                System.out.println(books[i].toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Книги этого автора отсутствуют в нашей библиотеке");
        }
    }

    public void searchByPublishingHouse() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите издательство: ");
        String house = scan.nextLine();
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPublishingHouse().equals(house)) {
                System.out.println(books[i].toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Книги этого изательства отсутствуют в нашей библиотеке");
        }
    }

    public void searchByYear(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scan.nextInt();
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getYear() >= year){
                System.out.println(books[i].toString());
                count ++;
            }
        }
        if (count == 0) {
            System.out.println("В библиотеке нет книг, опубликованных после " + year + " года");
        }
    }
}