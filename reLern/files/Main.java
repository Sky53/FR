package reLern.files;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Sky\\Desktop\\testic");
        if (dir.isDirectory()) {
            for (File file : dir.listFiles()) {
                if (file.isDirectory()) {
                    System.out.println(file.getName() + " Folder");

                } else {
                    System.out.println(file.getName() + " file");
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        showFile(dir);
    }

    public static void showFile(File path) {
        //File file = new File("C:\\Users\\Sky\\Desktop\\testic");
        File[] files = path.listFiles();

        for (File entry : files) {
            if (entry.isDirectory()) {
                showFile(entry);
                System.out.println(entry.getParent() + "   " + entry.getName() + " Folder");
                continue;
            } else {
                System.out.println(entry.getParent() + "  содержит  " +entry.getName() + " file");
            }
        }

    }
}
