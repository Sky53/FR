package Packages_interfaces.bookpack;

public class Book1 {
    private String title2;
    private String autor2;
    private int pubDate2;

    public Book1(String t2, String a2, int d2){
        title2 = t2;
        autor2 = a2;
        pubDate2 =d2;
    }
    public void showBook2(){
        System.out.println(title2);
        System.out.println(autor2);
        System.out.println(pubDate2);
        System.out.println();
    }
}
