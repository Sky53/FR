package Packages_interfaces;

class Book {
    private String title;
    private String autor;
    private int pubDate;

    Book(String t, String a, int d){
        title = t;
        autor = a;
        pubDate = d;

    }
    void showBook(){
        System.out.println(title);
        System.out.println(autor);
        System.out.println(pubDate);
        System.out.println();
    }
}
public class BookDemo {
    public static void main(String[] args) {
        Book books[] = new  Book[5];
        books[0] = new Book("Сказка","народ",970);
        books[1] = new Book("SuperMan","DC",1965);
        books[2] = new Book("1984","Oruel", 1965);
        books[3] = new Book("Cat in cat","I",2018);
        books[4] = new Book("Java: А Beginner's Guide","Schild",2014);

        for (int i = 0; i < books.length; i++){
            books[i].showBook();
        }
    }
}
