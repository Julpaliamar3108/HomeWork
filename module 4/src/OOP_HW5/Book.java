package OOP_HW5;

public class Book {
    private String bookName;
    private String author;
    private String publishingHouse;
    private int year;
    private int pages;
    private String bindingType;
    private int price;

    public Book(String bookName, String author, String publishingHouse, int year, int pages, String bindingType, int price) {
        this.bookName = bookName;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.pages = pages;
        this.bindingType = bindingType;
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookName: " + bookName + "; Author: " + author + "; PublishingHouse: " + publishingHouse + "; Year: " + year + "; BindingType: " + bindingType + "; Price: " + price;
    }

    public String getPublishingHouse(){
        return  publishingHouse;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }
}



