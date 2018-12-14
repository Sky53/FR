package Packages_interfaces.UseBook;

import Packages_interfaces.bookpack.*;
public class UseBook1 {
    public static void main(String[] args) {
        Book3 book31[] = new Book3[5];

        book31[0] = new Book3("book1", "autor1", 2000);
        book31[1] = new Book3("book2", "autor2", 2001);
        book31[2] = new Book3("book3", "autor1", 1998);
        book31[3] = new Book3("book4", "autor1", 2005);
        book31[4] = new Book3("book5", "autor3", 2012);

        for ( int i = 0; i < book31.length; i++){
            book31[i].showBook3();
        }
    }
}
