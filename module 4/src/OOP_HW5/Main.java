package OOP_HW5;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

import static OOP_HW5.Library.*;


public class Main{
    public static void main(String[] args) {
        Book[] books = new Book[6];

        books[0] = new Book("Мастер и Маргарита", "Булгаков М.А.", "Худ. литература", 1978, 300, "Твердый", 120);
        books[1] = new Book("Атлант расправил плечи", "Айн Ренд", "Альпина Паблишер", 2013, 1120, "Мягкий", 299);
        books[2] = new Book("Отель", "Артур Хейли", "Худ. литература", 2016, 608, "Мягкий", 215);
        books[3] = new Book("Ромео и Джульетта", "Уильям Шекспир", "Отдельное издание",2005, 144, "Твердый", 230);
        books[4] = new Book("Война и мир","Толстой Л.Н.", "Азбука",2018 , 700, "Твердый", 700);
        books[5] = new Book("Скотный двор", "Джордж Оруэл", "Азбука", 2014, 100, "Мягкий",100);

        Library library = new Library(books);

        library.searchByAuthor();
        library.searchByPublishingHouse();
        library.searchByYear();
    }
}



