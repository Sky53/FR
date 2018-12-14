package Packages_interfaces.bookpack;

public class Book3 {
    protected String title3;
    protected String autor3;
    protected int pubDate3;

    public Book3(String t3, String a3, int d3){
        title3 = t3;
        autor3 = a3;
        pubDate3 = d3;
    }
    public void showBook3(){
        System.out.println(title3);
        System.out.println(autor3);
        System.out.println(pubDate3);
        System.out.println();
    }
}
