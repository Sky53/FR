package Packages_interfaces.UseBook;

class ExtBook extends Packages_interfaces.bookpack.Book3 {
    private String publisher;

    public ExtBook(String t4, String a4, int d4, String p) {
        super(t4, a4, d4);
        publisher = p;
    }

    public void showBook4() {
        super.showBook3();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String p) {
        publisher = p;
    }

    /**
     * Следующие операторы допустимы, посколько подклассы имеют
     * право доступа к членам класса, объявленным защищенным
     */
    public String getTitle3() {
        return title3;
    }

    public void setTitle3(String t4) {
        title3 = t4;
    }

    public String getAutor3() {
        return autor3;
    }

    public void setAutor3(String a4) {
        autor3 = a4;
    }

    public int getPubDate3() {
        return pubDate3;
    }

    public void setPubDate3(int p4) {
        pubDate3 = p4;
    }
}

class ProtectDemo {
    public static void main(String[] args) {
        ExtBook books[] = new ExtBook[5];

        books[0] = new ExtBook("book1", "autor1", 2000, "I");
        books[1] = new ExtBook("book2", "autor2", 2001, "it");
        books[2] = new ExtBook("book3", "autor1", 1998, "prosv");
        books[3] = new ExtBook("book4", "autor1", 2005, "yak");
        books[4] = new ExtBook("book5", "autor3", 2012, "i");

        books[2].setTitle3("Loly");

        for (int x = 0; x < books.length; x++) {
            books[x].showBook4();
        }
        // find to autor
        System.out.println("showing all books by autor1");
        for (int k = 0; k < books.length; k++) {
            if (books[k].getAutor3() == "autor1") {
                System.out.println(books[k].getTitle3());
            }
        }
    }
}
