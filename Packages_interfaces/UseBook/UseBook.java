package Packages_interfaces.UseBook;

class UseBook {
    public static void main(String[] args) {
        Packages_interfaces.bookpack.Book1 books1[] = new Packages_interfaces.bookpack.Book1[5];
        books1[0] = new Packages_interfaces.bookpack.Book1("Book from another pack","you",2018);
        books1[1] = new Packages_interfaces.bookpack.Book1("Star War","Lucas",1960);
        books1[2] = new Packages_interfaces.bookpack.Book1("it","spilberg",1963);
        books1[3] = new Packages_interfaces.bookpack.Book1("Lord of the rings","Tolkein",1954);
        books1[4] = new Packages_interfaces.bookpack.Book1("brave new world","Haksly",1931);

        for ( int j = 0; j < books1.length; j++){
            books1[j].showBook2();
        }
    }
}
