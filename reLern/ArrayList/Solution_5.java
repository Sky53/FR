package reLern.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> fuulList = new ArrayList<>();
        List<Integer> List2 = new ArrayList<>();
        List<Integer> List3 = new ArrayList<>();
        List<Integer> other = new ArrayList<>();

        for (int i = 0 ; i<20; i++){
            fuulList.add(Integer.parseInt(reader.readLine()));
        }
        reader.close();

        for (int j = 0; j < fuulList.size(); j++){
            if (fuulList.get(j) % 3 ==0) {
                List3.add(fuulList.get(j));
            }
            if (fuulList.get(j) % 2 ==0) {
                List2.add(fuulList.get(j));
            }
            if ((fuulList.get(j) % 3 !=0) && (fuulList.get(j) % 2 !=0) ) {
                other.add(fuulList.get(j));
            }
        }

        printList(fuulList);
        printList(List3);
        printList(List2);
        printList(other);

    }
    public static void printList(List<Integer> list){
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
